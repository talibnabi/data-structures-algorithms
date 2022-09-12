package main;

public class Nodex {
    private Object value;
    private Nodex nodex;

    public Nodex(Object object, Nodex nodex) {
        this.value = object;
        this.nodex = nodex;
    }

    public Object getValue() {
        return value;
    }

    public void setObject(Object object) {
        this.value = object;
    }

    public Nodex getNodex() {
        return nodex;
    }

    public void setNodex(Nodex nodex) {
        this.nodex = nodex;
    }
}
