package main;

public class Interview1 {

    public static void main(String[] args) {
        String text = "12345";
        int num = Interview1.parseInt(text);
        System.out.println(num);
    }

    private static int parseInt(String text) {
        int sum = 0;
        int powerLevel = 0;
        for (int i = text.length() - 1; i >= 0; i--) {
            char c = text.charAt(i);
            sum += Math.pow(10, powerLevel) * ((int) c - (int) '0');
            powerLevel++;
        }
        return sum;
    }
}
