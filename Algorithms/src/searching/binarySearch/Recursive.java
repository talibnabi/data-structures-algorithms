package searching.binarySearch;

public class Recursive {
    public static int binarySearchRecursive(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;

        if (target == arr[mid]) {
            return mid;
        } else if (target < arr[mid]) {
            return binarySearchRecursive(arr, start, mid - 1, target);
        } else {
            return binarySearchRecursive(arr, mid + 1, end, target);
        }
    }
}
