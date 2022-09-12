package stack;

import java.util.Stack;

public class App {
    public static void main(String[] args) {
        // Last In First Out (LIFO) data structure
        Stack<String> strings = new Stack<>();
        strings.push("Salim");
        strings.push("Salim");
        strings.push("Amin");
        strings.forEach(System.out::println);
    }
}
