package collection.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethodsEx2 {
    public static void main(String[] args) {

        // remove(), indexOf();

        Student student1 = new Student("Artyom", 'm', 34, 4, 8.7);
        Student student2 = new Student("Karen", 'm', 25, 3, 9.5);
        Student student3 = new Student("Narine", 'f', 28, 4, 8.0);
        Student student4 = new Student("Karine", 'f', 24, 1, 9.2);
        Student student5 = new Student("Varuj", 'm', 30, 2, 7.2);
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        System.out.println(list);
        Student student6 = new Student("Varuj", 'm', 30, 2, 7.2);
        list.remove(student6);
        System.out.println(list);

        Student student7 = new Student("Karine", 'f', 24, 1, 9.2);
        int index = list.indexOf(student7);
        System.out.println(index);

    }
}
