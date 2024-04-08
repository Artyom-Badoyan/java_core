package collection.list.linkedList;

import java.util.LinkedList;

public class LinkedListEx {

    public static void main(String[] args) {

        // add(), get(), remove(),

        Student student1 = new Student("Artyom", 3);
        Student student2 = new Student("Karen", 4);
        Student student3 = new Student("Anna", 2);
        Student student4 = new Student("Varuj", 1);
        Student student5 = new Student("Elena", 3);

        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(student1);
        studentLinkedList.add(student2);
        studentLinkedList.add(student3);
        studentLinkedList.add(student4);
        studentLinkedList.add(student5);
        System.out.println("linkedList = " + studentLinkedList);
        System.out.println("---------------------------------");

        System.out.println(studentLinkedList.get(2));
        System.out.println("---------------------------------");

        Student student6 = new Student("Mher", 3);
        Student student7 = new Student("Sveta", 4);
        studentLinkedList.add(student6);
        System.out.println("linkedList = " + studentLinkedList);
        System.out.println("---------------------------------");

        studentLinkedList.add(1, student7);
        System.out.println("linkedList = " + studentLinkedList);
        System.out.println("---------------------------------");

        System.out.println(studentLinkedList.remove(3));
        System.out.println("linkedList = " + studentLinkedList);
        System.out.println("---------------------------------");
    }
}
