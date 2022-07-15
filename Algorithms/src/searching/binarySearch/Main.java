package searching.binarySearch;

public class Main {
    //https://www.javatpoint.com/binary-search
    public static void main(String[] args) {
        int[] arr = {};
    }

    private static int binarySearchIterative(int[] a, int target) {
        int start = 0;
        int end = a.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (target == a[mid]) {
                return mid;
            } else if (target < a[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    private static int binarySearchRecursive(int[] a, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;

        if (target == a[mid]) {
            return mid;
        } else if (target < a[mid]) {
            return binarySearchRecursive(a, start, mid - 1, target);
        } else {
            return binarySearchRecursive(a, mid + 1, end, target);
        }
    }


}
