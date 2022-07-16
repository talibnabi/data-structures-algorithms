package searching.zAlgorithm;

import static searching.zAlgorithm.ZAlgorithm.search;

public class Main {
    //https://www.scaler.com/topics/data-structures/z-algorithm/
    //https://www.geeksforgeeks.org/z-algorithm-linear-time-pattern-searching-algorithm/

    public static void main(String[] args) {
        String text = "GEEKS FOR GEEKS";
        String pattern = "GEEK";

        search(text, pattern);
    }

}
