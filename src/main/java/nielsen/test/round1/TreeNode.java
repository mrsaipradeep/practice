package nielsen.test.round1;

public class TreeNode<K,V> {

    private K key;
    private V value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(K key, V value, TreeNode left, TreeNode right) {
        this.key = key;
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public TreeNode(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
