package comparableAndComparator.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Artyom");
        list.add("Narine");
        list.add("Karen");
        System.out.println("перед сортировкой:" + list);
        Collections.sort(list);
        System.out.println("после сортировки:" + list);

    }
}
