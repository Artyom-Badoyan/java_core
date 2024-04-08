package collection.iterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {

    public static void main(String[] args) {

        // toCharArray(), add(), listIterator(), hasNext(), next(), hasPrevious(), previous()

        String str = "madam";
        List<Character> list = new LinkedList<>();
        for (char element : str.toCharArray()) { 
            list.add(element);
        }
        System.out.println(list);
        System.out.println("------------------------");

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());

        boolean isPalindrome = true;

        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
            if (iterator.next() != reverseIterator.previous()) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
