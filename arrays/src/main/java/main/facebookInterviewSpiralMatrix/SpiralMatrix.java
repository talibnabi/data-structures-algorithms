package main.facebookInterviewSpiralMatrix;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        sprintSpiral(array);
    }

    private static void sprintSpiral(int[][] array) {
        int firstRow = 0;
        int lastRow = array.length;
        int firstCol = 0;
        int lastCol = array[0].length;
        while (firstRow < lastRow && firstCol < lastCol) {
            //up
            for (int i = firstCol; i <= lastCol - 1; i++) {
                System.out.print(array[firstRow][i] + " ");
            }
            System.out.println();
            for (int i = firstRow + 1; i < lastRow; i++) {
                System.out.print(array[i][lastCol - 1] + " ");
            }
            System.out.println();
            for (int i = lastCol - 2; i > firstCol - 1; i--) {
                System.out.print(array[lastRow - 1][i] + " ");
            }
            System.out.println();
            for (int i = lastRow - 2; i > firstCol; i--) {
                System.out.print(array[i][firstCol] + " ");
            }
            firstRow++;
            lastRow--;
            firstCol++;
            lastCol--;
        }
    }
}
