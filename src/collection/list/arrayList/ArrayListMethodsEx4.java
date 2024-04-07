package collection.list.arrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayListMethodsEx4 {

    public static void main(String[] args) {

        // asList(), append(),

        StringBuffer sb1 = new StringBuffer("A");
        StringBuffer sb2 = new StringBuffer("B");
        StringBuffer sb3 = new StringBuffer("C");
        StringBuffer sb4 = new StringBuffer("D");

        StringBuffer[] array = {sb1, sb2, sb3, sb4};
        List<StringBuffer> list = Arrays.asList(array);
        System.out.println(list);

        array[0].append("!!!");
        System.out.println(list);

        array[0] = new StringBuffer("F");
        System.out.println(list);
    }
}
