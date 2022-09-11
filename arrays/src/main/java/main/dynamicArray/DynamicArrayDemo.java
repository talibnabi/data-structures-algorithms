package main.dynamicArray;

import main.dynamicArray.DynamicArray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray<Integer> dynamicArray = new DynamicArray<Integer>();
        dynamicArray.put(11);
        dynamicArray.put(1);
        dynamicArray.put(434);
        dynamicArray.put(3);
        dynamicArray.put(23);
        for (int i = 0; i < dynamicArray.getSize(); i++) {
            System.out.println(dynamicArray.get(i));
        }
        System.out.println(dynamicArray.length());
        System.out.println(dynamicArray.getSize());
    }
}
