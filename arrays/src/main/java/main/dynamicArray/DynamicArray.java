package main.dynamicArray;

//1.search O(n)
// 2.access O(1)
// 3.insert O(n)
// 4.delete O(n)

import java.util.Arrays;

public class DynamicArray<T> {

    private T[] data;
    private int size;

    public DynamicArray() {
        size = 0;
        data = (T[]) new Object[1];
    }

    public int getSize() {
        return this.data.length;
    }

    public int length() {
        return this.size;
    }

    public T get(int index) {
        return data[index];
    }

    public void put(T element) {
        ensureCapacity(size + 1);
        data[size++] = element;
    }

    private void ensureCapacity(int minCapacity) {
        int oldCapacity = getSize();
        if (minCapacity > oldCapacity) {
            int newCapacity = oldCapacity * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            data = Arrays.copyOf(data, newCapacity);
        }
    }
}
