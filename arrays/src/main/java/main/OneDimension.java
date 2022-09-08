package main;


import java.util.Arrays;

public class OneDimension {
    // 1.search   O(n)
    // 2.access   O(1)
    // 3.insert   O(n)
    // 4.delete   O(n)
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 20;
        numbers[1] = 5;
        numbers[2] = 10;
        numbers[3] = 6;
        numbers[4] = 11;
        for (int number : numbers) {
            System.out.println(number);
        }

        Student[] students = new Student[4];
        students[0] = new Student("Alisa", 12);
        students[1] = new Student("Rahim", 43);
        students[2] = new Student("Rahim2", 43);
        students[3] = new Student("Asli", 13);
        students[2] = new Student("Aslan", 23);
        for(int i=0;i<students.length;i++){
            System.out.println(students[i].toString());
        }
//        int[] arr = new int[3];
//        arr[0] = 2;
//        arr[1] = 4;
//        arr[2] = 6;
//        System.out.println(Arrays.toString(Arrays.stream(arr).toArray()));
//        arr[2]=34;
//        System.out.println(Arrays.toString(Arrays.stream(arr).toArray()));
    }
}
