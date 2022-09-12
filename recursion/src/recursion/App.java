package recursion;

public class App {

    public static void main(String[] args) {
        solution(4);
    }

    //Stack Call Back (4,3,2,1,0 return)
    public static void solution(int N) {
        if (N <= 0) {
            return;
        }
        StringBuilder str = new StringBuilder();
        if (N % 2 == 0) {
            str.append(".Cordiality.");
        }
        if (N % 3 == 0) {
            str.append(".Test.");
        }
        if (N % 5 == 0) {
            str.append(".Coders.");
        }
        if (str.length() == 0) {
            System.out.println(N);
        } else {
            System.out.println(str.toString());
        }
        solution(N - 1);
    }
}
