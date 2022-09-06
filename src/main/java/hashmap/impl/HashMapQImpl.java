package hashmap.impl;

import hashmap.HashMapQ;


import java.util.ArrayList;


public class HashMapQImpl<K, V> implements HashMapQ<K, V> {
   static HashMapQImpl<Integer, String> hashMap = new HashMapQImpl<>();
    ArrayList<K> keys = new ArrayList<>();
    ArrayList<V> values = new ArrayList<>();
    int count;


    @Override
    public Boolean put(K key, V value) {
        if (!(containKey(key))) {

            this.keys.add(count, key);
            this.values.add(count++, value);
        }
        return true;
    }

    @Override
    public boolean containKey(K key) {
        return keys.contains(key);
    }

    @Override
    public boolean isEmpty() {
        return keys.isEmpty();
    }

    @Override
    public void print() {
        System.out.println(keys);
        System.out.println(values);

    }

    @Override
    public boolean replace(K key, V newValue) {
        if (keys.contains(key)) {

            values.set(keys.indexOf(key), newValue);
            return true;
        }
        return false;
    }

    HashMapQImpl() {

    }


    public static void main(String[] args) {

        hashMap.put(1, "df");
        hashMap.put(2, "fyh");
        hashMap.put(3, "srhh");
        hashMap.put(4, "nentn");
        hashMap.put(5, "srgr");
        hashMap.print();
        System.out.println(hashMap.containKey(2));
        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap.replace(4, "srgr"));

    }
}
