package main.main;

public class BigTechInterQuestionFirst {
    private static String text = "12345";

    public static void main(String[] args) {
//        int number = Integer.parseInt(text);
//        System.out.println(number);
        System.out.println(parseInt(text));
    }

    private static int parseInt(String text) {
        int sum = 0;
        int powLevel = 0;
        for (int i = text.length() - 1; i >= 0; i--) {
            char c = text.charAt(i);
            sum += Math.pow(10, powLevel) * ((int) c - (int) '0');
            powLevel++;
        }
        return sum;
    }
}

