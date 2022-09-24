package main;

public class Knapsack {
    public static void main(String[] args) {
        //input
        int[] set = {1, 5, 6, 9, 10};
        int myBasket = 6;
        //solution
        //possibility 2^5
        for (int i = 0; i < (1 << set.length); i++) {
            StringBuilder packet = new StringBuilder();
            int sum = 0;
            for (int j = 0; j < set.length; j++) {
                if ((i & (1 << j)) > 0) {
                    packet.append(set[j]).append(" ");
                    sum += set[j];
                }
            }
            if (sum == myBasket) {
                System.out.println(packet);
            }
        }
    }
}
