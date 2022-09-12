package treeSetAndHashSet;

import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Lucifer");
        hashSet.add("Lucifer");
        hashSet.add("Simon");
        hashSet.add("Lucy");
        hashSet.add("Lucifer");
        hashSet.forEach(System.out::println);
    }
}
