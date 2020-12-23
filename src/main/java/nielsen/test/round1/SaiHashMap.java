package nielsen.test.round1;

public class SaiHashMap<K, V> {

    private Entry[] buckets;
    private static final int INITIAL_CAPACITY = 16;
    private int size = 0;

    public SaiHashMap() {
        this(INITIAL_CAPACITY);
    }

    public SaiHashMap(int capacity) {
        this.buckets = new Entry[capacity];
    }

    public int getSize(){
        return size;
    }

    public void put(K key, V value) {
        Entry<K, V> entry = new Entry<>(key, value, null);
        int index = key.hashCode() % buckets.length;
        Entry<K, V> existingEntry = buckets[index];
        if (existingEntry == null) {
            buckets[index] = entry;
            size++;
        } else {
            while (existingEntry.next != null) {
                if (existingEntry.key.equals(key)) {
                    existingEntry.value = value;
                    return;
                }
                existingEntry = existingEntry.next;
            }
            if (existingEntry.key.equals(key)) {
                existingEntry.value = value;
            } else {
                existingEntry.next = entry;
                size++;
            }
        }
    }



    public V get(K key) {
        Entry<K, V> entry = buckets[key.hashCode() % buckets.length];
        while (entry != null) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
            entry = entry.next;
        }
        return null;
    }

    public static void main(String[] args) {
        SaiHashMap<Integer,Integer> map = new SaiHashMap<>();
        map.put(1,3);
        map.put(2,4);
        map.put(1,5);
        map.put(3,8);
        map.put(6,9);

        System.out.println(map.get(1));
        System.out.println(map.getSize());
    }

}
