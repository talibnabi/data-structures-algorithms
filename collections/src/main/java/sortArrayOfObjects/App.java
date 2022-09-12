package sortArrayOfObjects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
    String name;
    String surname;
    Integer age;

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.age.compareTo(o.age);
    }
}

public class App {

    public static void main(String[] args) {
//        ArrayList<String> listOfNames = new ArrayList<>();
//        listOfNames.add("Jena");
//        listOfNames.add("Alisa");
//        listOfNames.add("Djeka");
//        System.out.println("Print before sort: ");
//        listOfNames.forEach(System.out::println);
//        System.out.println("Print after sort: ");
//        Collections.sort(listOfNames);
//        listOfNames.forEach(System.out::println);
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Alisa", "Aslan", 99));
        people.add(new Person("Zahid", "Musayev", 29));
        people.add(new Person("Turan", "Aghayev", 49));
        Collections.sort(people);
        print(people);
    }

    public static void print(ArrayList<Person> listOfNames) {
        listOfNames.forEach(System.out::println);
    }
}
