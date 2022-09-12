package main;


public class App {
    //LinkedList
    // value/pointer
    //Search --> O(n)
    //Access -> O(n)
    //Remove --> O(n)
    //Insert --> O(n)

    //Double LinkedList --> O(n)
    public static void main(String[] args) {
        LinkedListImpl<Integer> list = new LinkedListImpl<>();
        list.add(21);
        list.add(32);
        list.display();
        list.delete();
        list.display();
    }
}
