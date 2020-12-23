/*
package nielsen.test.round1;

public class SaiTreeHashMap<K, V> {
    private TreeNode<K, V>[] buckets;
    private static final int INITIAL_CAPACITY = 16;
    private int size = 0;

    public SaiTreeHashMap() {
        this(INITIAL_CAPACITY);
    }

    public SaiTreeHashMap(int capacity) {
        this.buckets = new TreeNode[capacity];
    }

    public int getSize() {
        return size;
    }

    public void put(K key, V value) {
        TreeNode<K, V> treeNode = new TreeNode<>(key, value, null, null);
        int index = key.hashCode() % buckets.length;
        TreeNode<K, V> existingEntry = buckets[index];
        if (existingEntry == null) {
            buckets[index] = treeNode;
            size++;
        } else {

        }
    }

    private V get(K data) {
        TreeNode<K, V> root = buckets[data.hashCode() % buckets.length];
        return search(root,data);
    }

    private V search(TreeNode root, K data){
        if (root == null)
            return null;
        else if ((int)root.getKey() == (int) data) {
            return (V)root.getValue();
        } else if ((int) data <= (int)root.getKey()) {
            return search(root.getLeft(), data);
        } else {
            return search(root.getRight(), data);
        }
    }

    TreeNode insertNode(TreeNode node, Integer k, Integer v) {
        if (node == null) {
            node = new TreeNode(k, v);
        } else if (k <= (int) node.getKey()) {
            node.setLeft(insertNode(node.getLeft(), k, v));
        } else {
            node.setRight(insertNode(node.getRight(), k, v));
        }
        return node;
    }
}
*/
