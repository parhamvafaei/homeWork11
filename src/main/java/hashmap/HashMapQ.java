package hashmap;

public interface HashMapQ<K,V>  {
  V put(K key, V value);

    boolean containKey(K key);

    boolean isEmpty();

    boolean replace(K key, V newValue);
}
