package hashmap.impl;

import hashmap.HashMapQ;


import java.util.LinkedList;

public class HashMapQImpl<K,V> implements HashMapQ<K,V> {
     LinkedList<K> keys = new LinkedList<>();
     LinkedList<V> values = new LinkedList<>();
    int count;

    public LinkedList<K> getKeys() {
        return keys;
    }

    public LinkedList<V> getValues() {
        return values;
    }

    public void setKeys(LinkedList<K> keys) {
        this.keys = keys;
    }

    public void setValues(LinkedList<V> values) {
        this.values = values;
    }

    @Override
   public V put(K key, V value) {
        for (int i = 0; i < count; i++) {

            if (keys.get(i) == key) {
                System.out.println("the key already exist !");
                return null;
            }
            keys.set(count, key);
            values.set(count++, value);
        }return value;
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
    public boolean replace(K key, V newValue) {
        if (keys.contains(key)) {

            values.set(keys.indexOf(key), newValue);
            return true;
        }
        return false;
    }

   static void print(HashMapQImpl<Integer,String> hashMapQ){
        for (String s:hashMapQ.getValues()) {
            System.out.println(s);
        }
    }
  HashMapQImpl(){

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
        hashMap.put(1,"df");
        hashMap.put(2,"fyh");
        hashMap.put(3,"srhh");
        hashMap.put(4,"nentn");
        hashMap.put(5,"srgr");
     print(hashMap);
        System.out.println(hashMap.containKey(2)) ;
        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap.replace(4,"srgr"));

    }
}
