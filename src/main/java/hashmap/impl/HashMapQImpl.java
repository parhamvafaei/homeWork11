package hashmap.impl;

import hashmap.HashMapQ;


import java.util.ArrayList;


public class HashMapQImpl<K, V> implements HashMapQ<K, V> {
    ArrayList<K> keys = new ArrayList<>();
    ArrayList<V> values = new ArrayList<>();
    int count;

    public ArrayList<K> getKeys() {
        return keys;
    }

    public ArrayList<V> getValues() {
        return values;
    }

    public void setKeys(ArrayList<K> keys) {
        this.keys = keys;
    }

    public void setValues(ArrayList<V> values) {
        this.values = values;
    }

    @Override
    public Boolean put(K key, V value) {
        for (int i = 0; i < count; i++) {

            if (keys.get(i) == key) {
                System.out.println("the key already exist !");
                return false;
            }
            keys.set(count, key);
            values.set(count++, value);
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
        HashMapQImpl<Integer, String> hashMapQ = new HashMapQImpl<>();
        for (Integer i : hashMapQ.getKeys()) {
            System.out.println(i);
        }
        for (String s : hashMapQ.getValues()) {
            System.out.println(s);
        }
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

    @Override
    public String toString() {
        System.out.println(keys);
        System.out.println(values);
        return "HashMapQImpl{" +
                "keys=" + keys +
                ", values=" + values +

                '}';
    }

    public static void main(String[] args) {
        HashMapQImpl<Integer, String> hashMap = new HashMapQImpl<>();
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
