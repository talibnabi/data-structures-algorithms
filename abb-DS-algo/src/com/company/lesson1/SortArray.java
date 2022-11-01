package com.company.lesson1;

import java.util.Arrays;

public class SortArray {
    //Big O notation

    /*sort algorithm
     * the best complexity-->O(n)
     * the worst complexity-->O(n*n)
     *
     * */


    //O(log n)   O(nlog n)
    public static void main(String[] args) {
        int[] arr = {34, 3, 23, 34, 5, 6, 3, 2, 1};
        Integer[] arr2 = {34, 3, 23, 34, 5, 6, 3, 2, 1};

//        System.out.println(Arrays.toString(sort2(arr2)));
        System.out.println(Arrays.toString(sort3(arr2)));
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
        //O(n*n*4)
        for (int i = 0; i < arr.length; i++) {//O(n)
            for (int j = i + 1; j < arr.length; j++) {//O(n)
                if (arr[i] > arr[j]) {//O(1)
                    int temp = arr[i];//O(1)
                    arr[i] = arr[j];//O(1)
                    arr[j] = temp;//O(1)
                    /*O(3)*/
                }
            }
        }
        return arr;
    }


    //bubble sort
    private static Integer[] sort3(Integer[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {//O(n)
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i = -1;
                /*O(4)*/
            }
        }
        return arr;
    }

    //O(1) x=a[i]
    //O(n) for(x:a) a.length=n
    //O(2) x=a[1]  y=a[7]
    //O(n+m) for(x:a)  for(y:b) a.length=n  b.length=m


    //how to implement SORT O(n*log n)
    /*whole complexity
    1.divide in a halves : log n
    2.merge  N-for every iteration
    */

    private static int[] merge(int[] data, int left, int middle, int right) {

        throw new IllegalArgumentException("not implementation");
    }

    private static void split(int[] arr, int left, int right) {
        if (left < right) {//still have a data
            int middle = (left + right) / 2;
            split(arr, left, right);
            split(arr, left + 1, right);
            merge(arr, left, middle, right);
        }
    }

    private static void mergeSort(int[] arr) {
        split(arr, 0, arr.length);
    }
}
