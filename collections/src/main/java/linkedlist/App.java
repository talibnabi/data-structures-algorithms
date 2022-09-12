package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Alisa");
        list.add("Aslan");
        list.add("Salim");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
