package collection.list.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {

    public static void main(String[] args) {

        // hasNext(), next(), remove()

        List<String> list = new ArrayList<>();
        list.add("Artyom");
        list.add("Karen");
        list.add("Anna");
        list.add("Varuj");
        list.add("Mari");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-----------------------------");

        Iterator<String> stringIterator = list.iterator();
        while (stringIterator.hasNext()) {
            stringIterator.next();
            stringIterator.remove();
        }
        System.out.println(list);
    }
}
