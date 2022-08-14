package searching.binarySearch.recursive;

public class BinarySearch {
    private int binarySearch(int[] arr, int left, int right, int element) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == element)
                return mid;
            if (arr[mid] > element)
                return binarySearch(arr, left, mid - 1, element);
            return binarySearch(arr, mid + 1, right, element);
        }
        return -1;
    }
}
