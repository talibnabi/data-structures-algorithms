package main.facebookInterviewSpiralMatrix;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        sprintSpiral(array);
    }

    private static void sprintSpiral(int[][] array) {
        int firstRow = 0;
        int lastRow = array.length - 1;
        int firstCol = 0;
        int lastCol = array[0].length - 1;
        while (firstRow < lastRow && firstCol < lastCol) {
            for (int i = firstCol; i <= lastCol; i++) {
                System.out.print(array[firstRow][i] + " ");
            }
            System.out.println();
            for (int i = firstRow + 1; i <= lastRow; i++) {
                System.out.print(array[i][lastCol] + " ");
            }
            System.out.println();
            for (int i = lastCol - 1; i >= firstCol; i--) {
                System.out.print(array[lastRow][i] + " ");
            }
            System.out.println();
            for (int i = lastRow - 1; i >= firstRow + 1; i--) {
                System.out.print(array[i][firstCol] + " ");
            }
            System.out.println();
            firstRow++;
            lastRow--;
            firstCol++;
            lastCol--;
        }
    }
}
