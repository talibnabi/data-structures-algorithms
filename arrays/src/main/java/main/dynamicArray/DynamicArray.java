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

    public T get(int index) {
        return data[index];
    }

    public int getSize() {
        return size;
    }

    public int length() {
        return data.length;
    }

    public void put(T object) {
        ensureCapacity(size + 1);
        data[size++] = object;
    }

    public void ensureCapacity(int capacity) {
        int oldCapacity = length();
        if (capacity > oldCapacity) {
            int newCapacity = oldCapacity * 2;
            if (newCapacity < capacity) {
                newCapacity = capacity;
            }
            data = Arrays.copyOf(data, newCapacity);
        }
    }
}
