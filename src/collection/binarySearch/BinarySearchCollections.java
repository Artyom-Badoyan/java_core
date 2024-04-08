package collection.binarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchCollections {
    public static void main(String[] args) {

        // sort(), binarySearch(), reverse(), shuffle();

        List<Integer> integerList = new ArrayList<>();
        integerList.add(-3);
        integerList.add(8);
        integerList.add(12);
        integerList.add(-8);
        integerList.add(0);
        integerList.add(5);
        integerList.add(10);
        integerList.add(1);
        integerList.add(150);
        integerList.add(-30);
        integerList.add(19);

        Collections.sort(integerList);
        System.out.println(integerList + " ");
        System.out.println("-------------------------------");

        int indexElement = Collections.binarySearch(integerList, 12);
        System.out.println(indexElement);
        System.out.println("-------------------------------");

        Collections.reverse(integerList);
        System.out.println(integerList + " ");
        System.out.println("-------------------------------");

        Collections.shuffle(integerList);
        System.out.println(integerList + " ");
        System.out.println("-------------------------------");

    }
}
