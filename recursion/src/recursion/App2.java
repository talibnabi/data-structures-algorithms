package recursion;

public class App2 {
    public static void main(String[] args) {
        int[] A = {2,-1, 3, -1, 5};
        int result = solution(A);
        System.out.println(result);
    }

    private static int length(int[] A, int index) {
        if (A[index] == -1) {
            return 1;
        }
        return 1 + length(A, A[index]);
    }

    private static int solution(int[] A) {
        return length(A, 0);
    }
}
