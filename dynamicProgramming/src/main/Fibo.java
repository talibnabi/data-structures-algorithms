package main;

public class Fibo {
    /*                    fib(5)
                     /                \
               fib(4)                fib(3)
             /        \              /       \
         fib(3)      fib(2)         fib(2)   fib(1)
        /    \       /    \        /      \
  fib(2)   fib(1)  fib(1) fib(0) fib(1) fib(0)
  /     \
fib(1) fib(0)
*/
    public static void main(String[] args) {
        System.out.println(fib(9));
    }

    private static int fib(int x) {
        if (x <= 1) {
            return x;
        }
        return fib(x - 1) + fib(x - 2);
    }
}
