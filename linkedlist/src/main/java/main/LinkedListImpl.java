package main;

public class LinkedListImpl<T> {
    private Nodex nodex;

    public LinkedListImpl() {
        this.nodex = null;
    }

    public void add(T object) {
        Nodex newNode = new Nodex(object, null);
        if (nodex != null) {
            newNode.setNodex(nodex);
        }
        nodex = newNode;
    }

    public void delete() {
        nodex = nodex.getNodex();
    }

    public void display() {
        Nodex node = nodex;
        if ((T) node != null) {
            System.out.println(nodex.getValue());
            node = nodex.getNodex();
        }
    }
}
