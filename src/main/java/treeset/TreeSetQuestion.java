package treeset;

import java.util.Random;
import java.util.TreeSet;

public class TreeSetQuestion {
  public TreeSet<Character> random() {
    TreeSet<Character> treeSet =new TreeSet<>() ;
    Random r = new Random();
      for (int i = 0; i < 10; i++) {
        char char1 = (char) (r.nextInt(26) + 'A');
        treeSet.add(char1);
        System.out.println("first index :"+char1);
      }
      return treeSet;
    }

    static void union(TreeSet<Character> set1 , TreeSet<Character> set2){
    set1.addAll(set2);

    }

    static void intersection(TreeSet<Character> set1 , TreeSet<Character> set2){
    set1.retainAll(set2);
    }

  public static void main(String[] args) {
    TreeSetQuestion treeSetQuestion=new TreeSetQuestion();
    TreeSet<Character> treeSet1=new TreeSet<>();
    TreeSet<Character> treeSet2=new TreeSet<>();
    treeSetQuestion.random();
  }

}
