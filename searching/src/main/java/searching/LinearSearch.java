package searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {10, 20, 63, 45, 43, 63};
        int size = array.length;
        int value = 63;

        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                System.out.println("Element found index is :" + i);
            } else {
                if (i == size - 1) {
                    System.out.println("Element not found.");
                }
            }
        }
    }
}
