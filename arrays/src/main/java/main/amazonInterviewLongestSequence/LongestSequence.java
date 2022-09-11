package main.amazonInterviewLongestSequence;

import java.util.ArrayList;
import java.util.List;

public class LongestSequence {
    private static final int[] array = {1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1};

    public static void main(String[] args) {
        System.out.println(longestSequence());
    }

    private static int longestSequence() {
        List<Integer> integerList = getList(array);
        System.out.println(integerList);
        int totalNum = 0;
        for (int i = 0; i < integerList.size(); i++) {
            int numSum = integerList.get(i);
            if ((i + 1) < integerList.size()) {
                numSum += 1;
            }
            if ((i + 2) < integerList.size()) {
                numSum += integerList.get(i + 2);
            }
            if (numSum > totalNum) {
                totalNum = numSum;
            }
        }
        return totalNum;
    }

    private static List<Integer> getList(int[] array) {
        int sequenceOnesTotal = 0;
        List<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                sequenceOnesTotal++;
                if (sequenceOnesTotal > 0 && i == array.length - 1) {
                    nums.add(sequenceOnesTotal);
                }
            } else {
                if (sequenceOnesTotal > 0) {
                    nums.add(sequenceOnesTotal);
                }
                nums.add(array[i]);
                sequenceOnesTotal = 0;
            }
        }
        return nums;
    }
}
