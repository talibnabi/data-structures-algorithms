package main.amazonInterviewLongestSequence;

import java.util.ArrayList;
import java.util.List;

public class LongestSequence {

    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0};//input
        //first convert the problem
        List<Integer> list = new ArrayList<Integer>();
        int sequenceOnesTotal = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                sequenceOnesTotal++;
                if (i == arr.length - 1) {
                    list.add(sequenceOnesTotal);
                }
            } else {
                if (sequenceOnesTotal > 0) {
                    list.add(sequenceOnesTotal);
                }
                list.add(arr[i]);
                sequenceOnesTotal = 0;
            }
        }
        System.out.println(list);
    }
}
