package treeset;

import java.util.Random;
import java.util.TreeSet;

public class TreeSetQ {


    public static TreeSet<Character> random() {
        TreeSet<Character> set = new TreeSet<>();
        Random random = new Random();
        while (set.size() < 10) {
            set.add((char) random.nextInt(97, 123));

        }print(set);
        return set;
    }

    static void print(TreeSet<Character> treeSet) {
        System.out.println(treeSet);
    }

    static void union(TreeSet<Character> set1, TreeSet<Character> set2) {
        TreeSet<Character> treeSet=new TreeSet<>(set1);
        treeSet.addAll(set2);
        print(treeSet);

    }

    static void intersection(TreeSet<Character> set1, TreeSet<Character> set2) {
        TreeSet<Character> treeSet=new TreeSet<>(set1);
  treeSet.retainAll(set2);
        print(treeSet);
    }

    public static void main(String[] args) {

        TreeSet<Character> treeSet1 = new TreeSet<>(random());
        TreeSet<Character> treeSet2 = new TreeSet<>(random());
   union(treeSet1,treeSet2);
   intersection(treeSet1,treeSet2);

    }

}
