package main;

public class Interview2 {


    public static void main(String[] args) {
//        int area = largestContainer(new int[]{1, 2, 3, 4, 5});
//        System.out.println(area);
        int longest = longestOnes(new int[]{0, 1, 1, 0, 1, 0, 1});
        System.out.println(longest);
    }

    private static int longestOnes(int[] array) {
        int longestOne = Integer.MIN_VALUE;
        int beforeZero = 0;
        int afterZero = 0;
        for (int j = 0; j < array.length - 1; j++) {
            if (array[j] == 1) {
                afterZero++;
                if (j == array.length - 1) {
                    longestOne = Math.max(longestOne, afterZero + beforeZero + 1);
                }
            } else {
                int len = afterZero + beforeZero + 1;
                longestOne = Math.max(longestOne, len);
                beforeZero = afterZero;
                afterZero = 0;
            }
        }
//        longestOne = Math.max(longestOne, afterZero + beforeZero + 1);
        return longestOne;
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
