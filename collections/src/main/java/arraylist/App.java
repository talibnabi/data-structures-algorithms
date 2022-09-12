package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class App {
    //---------ArrayList --> Dynamic array
    //---------LinkedList --> LinkedList (Dynamic)
    //---------Hashmap --> HashTable
    //---------Set --> HashTable
    //---------Stack --> Dynamic array stack
    //---------Queue --> Dynamic array queue
    //---------Priority queue --> Dynamic array queue

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Developer");
        arrayList.add("Tester");
        arrayList.add("Manager");
        for (String text : arrayList) {
            System.out.println(text);
        }
        System.out.println(arrayList.get(0));
        arrayList.remove(0);
        arrayList.remove("Manager");
        System.out.println(arrayList);
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Anar", "Hashimov", 19));
        employees.add(new Employee("Alisa", "Aslan", 20));
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        Iterator<Employee> employeeIterator = employees.iterator();
        while (employeeIterator.hasNext()) {
            employeeIterator.forEachRemaining(employee -> System.out.println());
        }
    }
}
