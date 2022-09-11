package main.oneDimensionArray;

public class OneDimension {
    /*
    1.search ->O(n)
    2.access ->O(1)
    3.insert ->O(n)
    4.delete ->O(n)
    * */
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 20;
        array[1] = 14;
        array[2] = 43;
        array[3] = 1;
        array[4] = 90;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        Student[] students = new Student[4];
        students[0] = new Student("Alisa", 19);
        students[1] = new Student("Narmina", 20);
        students[2] = new Student("Kamil", 18);
        students[3] = new Student("Narmin", 15);
        for(int i=0;i<students.length;i++){
            System.out.println(students[i].toString());
        }
    }
}
