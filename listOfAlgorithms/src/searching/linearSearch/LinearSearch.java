package searching.linearSearch;

public class LinearSearch {

    public static int linearSearch(int[] arr, int len, int val) {
        for (int i = 0; i < len; i++) {
            if (arr[i] == val) {
                return i;
            }
        }
        return -1;
    }
}
