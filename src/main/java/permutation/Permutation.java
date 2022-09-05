package permutation;

import java.util.HashMap;

public class Permutation {
    int count=0;
    HashMap<Integer,String> memory=new HashMap<>();
    public HashMap<Integer, String> permutation(String input) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        char first = input.charAt(0);
        if (input.length() > 1) {
            input = input.substring(1);
            HashMap<Integer, String> temp = permutation(input);
            for (String word : temp.values())
                for (int i = 0; i <= word.length(); i++) {
                    hashMap.put(count++, word.substring(0, i) + first + word.substring(i));
                }
        } else
            hashMap.put(count++, String.valueOf(first));
    memory.putAll(hashMap);
        return hashMap;
    }

    static void print(HashMap<Integer, String> map) {
        for (String values : map.values()) {
            System.out.println(values);
        }
    }
}
