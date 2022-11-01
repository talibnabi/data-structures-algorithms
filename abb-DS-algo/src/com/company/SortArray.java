package com.company;


public class SortArray {

    public static void main(String[] args) {
        int[] arr = {34, 3, 23, 34, 5, 6, 3, 2, 1};
        Integer[] arr2 = {34, 3, 23, 34, 5, 6, 3, 2, 1};
        int[] sortedArr = sort(arr);
//        for (int i = 0; i < sortedArr.length; i++) {
//            System.out.println(arr[i]);
//        }

        Integer[] sortedArr2 = sort2(arr2);
        for (int i = 0; i < sortedArr2.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //bubble sort
    private static int[] sort(int[] arr) {
        boolean sorted = false;
        int temp = 0;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return arr;
    }

    //bubble sort
    private static Integer[] sort2(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }
}
