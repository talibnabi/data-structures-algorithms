package treeSetAndHashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();//HashSet is not sorted
        hashSet.add("Lucifer");
        hashSet.add("Lucifer");
        hashSet.add("Simon");
        hashSet.add("Lucy");
        hashSet.add("Lucifer");
        hashSet.forEach(System.out::println);

        System.out.println();

        Set<String> treeSet = new TreeSet<>();//TreeSet is sorted and fast
        treeSet.add("Lucifer");
        treeSet.add("Lucifer");
        treeSet.add("Simon");
        treeSet.add("Lucy");
        treeSet.add("Lucifer");
        treeSet.forEach(System.out::println);
    }
}
