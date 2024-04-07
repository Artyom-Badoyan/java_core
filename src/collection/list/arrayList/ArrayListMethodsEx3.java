package collection.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethodsEx3 {

    public static void main(String[] args) {

        // addAll(), clear(), indexOf(), lastIndexOf(), size(), isEmpty(), contains(), toString()

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Artyom");
        arrayList.add("Karen");
        arrayList.add("Narine");
        arrayList.add("Artyom");
        System.out.println(arrayList);

        List<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("???");
        arrayList.addAll(arrayList2);
        System.out.println(arrayList);

        List<String> arrayList3 = new ArrayList<>();
        arrayList3.add("@@@");
        arrayList3.add("###");
        arrayList.addAll(1, arrayList3);
        System.out.println(arrayList);

        int index = arrayList.indexOf("Artyom");
        System.out.println(index);

        int lastIndexOf = arrayList.lastIndexOf("Artyom");
        System.out.println(lastIndexOf);

        System.out.println(arrayList.size());

        System.out.println(arrayList.isEmpty());

        System.out.println(arrayList.contains("Artyom"));

        System.out.println(arrayList.toString());

        arrayList.clear();
        System.out.println(arrayList);
    }
}
