package collection.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethodsEx1 {
    public static void main(String[] args) {

        // add(), get(), set(), remove();

        List<String> list = new ArrayList<>();
        list.add("Artyom");
        list.add("Karen");
        list.add("Narine");
        list.add(1, "Karine");
        System.out.println(list);
        System.out.println("-------------------");

        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("-------------------");


        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("-------------------");


        System.out.println(list.get(2));
        System.out.println("-------------------");

        list.set(1, "Varuj");
        System.out.println(list);
        System.out.println("-------------------");

        list.remove(0);
        System.out.println(list);
    }
}
