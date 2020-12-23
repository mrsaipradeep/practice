package nielsen.test.round1;

public class Account {
    private  float balance;

    public synchronized void deposit(float amt){
        balance += amt;
        System.out.println("New Balance after deposit " + balance);
    }

    public synchronized void withDraw(float amt){
        balance -= amt;
        System.out.println("New Balance after withdraw " + balance);
    }

    public float getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        Account account = new Account();
        account.deposit(1000);
        Thread t1 = new Thread(()->{
            account.deposit(500);
        });
        t1.start();
        Thread t2 = new Thread(()->{
            account.withDraw(500);
        });
        t2.start();

        System.out.println(account.getBalance());
    }
}
