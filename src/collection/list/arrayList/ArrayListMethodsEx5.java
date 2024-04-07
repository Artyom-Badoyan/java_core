package collection.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethodsEx5 {

    public static void main(String[] args) {

        // removeAll(), retainAll(), containsAll(), subList(), toArray(), List.of, List.copyOf();

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Artyom");
        arrayList.add("Karen");
        arrayList.add("Narine");
        arrayList.add("Varuj");
        arrayList.add("Mari");
        System.out.println(arrayList);
        System.out.println("------------------------------");

        Object[] array = arrayList.toArray();
        String[] array2 = arrayList.toArray(new String[0]);
        for (String s : array2) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("------------------------------");

        List<String> myList = arrayList.subList(0, 2);
        System.out.println("subList: " + myList);
        System.out.println("------------------------------");

        myList.add("Nver");
        System.out.println("subList: " + myList);
        System.out.println("------------------------------");

        System.out.println("arrayList: " + arrayList);
        System.out.println("------------------------------");

        List<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Karen");
        arrayList1.add("Narine");
        arrayList1.add("Harut");

        arrayList.removeAll(arrayList1);
        System.out.println(arrayList);
        System.out.println("------------------------------");

        List<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Artyom");
        arrayList2.add("Varuj");
        arrayList2.add("Harut");

        arrayList.retainAll(arrayList2);
        System.out.println(arrayList);
        System.out.println("------------------------------");

        boolean res = arrayList.containsAll(arrayList1);
        System.out.println(res);
        System.out.println("------------------------------");

        List<Integer> integerList = List.of(3, 8, 13);
        System.out.println(integerList);
        System.out.println("------------------------------");

        List<String> stringList = List.copyOf(arrayList);
        System.out.println(stringList);
    }
}
