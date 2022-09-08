package main;

public class Interview2 {


    public static void main(String[] args) {
        int area = largestContainer(new int[]{1, 2, 3, 4, 5});
        System.out.println(area);
    }

    private static int largestContainer(int[] array) {
        int maxArea = Integer.MIN_VALUE;
        int begin = 0;
        int end = array.length - 1;
        while (begin < end) {
            int width = end - begin;
            int height = Math.min(array[begin], array[end]);
            int area = width * height;
            maxArea = Math.max(maxArea, area);
            if (array[begin] < array[end]) {
                begin++;
            } else {
                end--;
            }
        }
        return maxArea;
    }
}
