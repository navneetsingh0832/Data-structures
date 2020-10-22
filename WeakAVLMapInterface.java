package col106.assignment4.WeakAVLMap;
import java.util.Vector;


/**
 * DO NOT EDIT THIS FILE.
 */
public interface WeakAVLMapInterface<K extends Comparable,V> {
    /**
     * @param key,value
     * @return vlaue added
     */
    public V put(K key, V value);

    /**
     * @param key
     * @return value associated with the key given, return null if no key mathed to passed key
     */
    public V remove(K key);

    /**
     * @param key
     * @return value associated with the given key
     */
    public V get(K key);

    /**
     * @param key1,key2
     * @return vector<V> having values that are associated with the keys in range key1 to key2(both inclusive)
     */
    public Vector<V> searchRange(K key1, K key2);

    /**
     * @return rotate counts performed so far
     */
    public int rotateCount();

    /**
     * @return height of the tree
     */
    public int getHeight();

    /**
     * @return BFS traversal of the WAVL tree
     */
    public Vector<K> BFS();
}
