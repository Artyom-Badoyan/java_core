package collection.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Artyom");
        arrayList.add("Karen");
        arrayList.add("Narine");
        System.out.println("arrayList : " + arrayList);

        ArrayList<String> arrayList1 = new ArrayList<>(200);
        arrayList1.add("Artyom");
        arrayList1.add("Karen");
        System.out.println("arrayList1 : " + arrayList1);

        List<String> arrayList2 = new ArrayList<>(arrayList);
        System.out.println("arrayList2 : " + arrayList2);
        System.out.println(arrayList == arrayList2);

    }
}
