package hashmap;

import java.util.Map;

public interface HashMapQ<K, V> {
    Boolean put(K key, V value);


    boolean containKey(K key);

    boolean isEmpty();

    void print();

    boolean replace(K key, V newValue);
}
