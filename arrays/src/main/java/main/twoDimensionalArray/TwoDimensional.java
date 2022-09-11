package main.twoDimensionalArray;

public class TwoDimensional {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        arr[0][0] = 23;
        arr[0][1] = 34;
        arr[0][2] = 10;
        arr[1][0] = 22;
        arr[1][1] = 12;
        arr[1][2] = 99;
        arr[2][0] = 9;
        arr[2][1] = 18;
        arr[2][2] = 14;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
//                if (i == j) {
//                    System.out.print(arr[i][j] + " ");
//                }
            }
            System.out.println();
        }
    }
}
