package queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class App {
    public static void main(String[] args) {
        //First In First Out (FIFO)
        Queue<Integer> queue = new LinkedList<>();
        queue.add(342);
        queue.add(23);
        queue.add(23);
        queue.add(234);
        queue.add(234);
        queue.forEach(System.out::println);
        System.out.println();

        System.out.println(queue.poll());
        System.out.println();

        PriorityQueue<Integer> queue1 = new PriorityQueue<>();
        queue1.add(3);
        queue1.add(3);
        queue1.add(43);
        queue1.forEach(System.out::println);
        System.out.println();

        PriorityQueue<Employee> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Employee("Alisa", "Aslan", 19));
        priorityQueue.add(new Employee("Aslan", "Aslanov", 23));
        System.out.println(priorityQueue.poll().getName());
        priorityQueue.forEach(System.out::println);
    }
}
