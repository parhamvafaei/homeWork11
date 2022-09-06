package arraylist;

import java.util.ArrayList;


public class ArrayListQ {

    static ArrayList<Integer> correctArray(ArrayList<Integer> arrayList) {
        if (!(arrayList.isEmpty())) {
            if (!(arrayList.size() % 2 == 0)) {
                arrayList.remove(arrayList.size() - 1);
            }

            for (int i = 0; i < arrayList.size(); i += 2) {
                if (arrayList.get(i) > arrayList.get(i + 1)) {
                    arrayList.remove(i);
                    arrayList.remove(i);
                    i -= 2;
                }
            }
        }

        return arrayList;
    }

    static void print(ArrayList<Integer> arrayList) {
        for (Integer values : arrayList) {
            System.out.println(values);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(2);
        arrayList.add(211);
        arrayList.add(2);
        arrayList.add(22);
        arrayList.add(2245);
        arrayList.add(2);
        arrayList.add(2254);
        arrayList.add(4);


        ArrayList<Integer> correctList = new ArrayList<>(correctArray(arrayList));
        print(correctList);
    }
}
