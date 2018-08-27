import java.util.Scanner;

public class Fibonacci {
  private static long calc_fib(int n) {
    if (n <= 1)
      return n;

    return calc_fib(n - 1) + calc_fib(n - 2);
  }

  private static long calcFibList(int n) {
    long[] sums = new long[n + 1];

    sums[0] = 0;
    sums[1] = 1;

    for (int i = 2; i <= n; i++) {
      sums[i] = sums[i-1] + sums[i-2];
    }

    return sums[n];
  }

  private static void runTests() {
    System.out.println("running tests..");

    // assert calcFibList(7) == calc_fib(7) : "4 wrong ";
    System.out.println("calcFibList(7)" + calcFibList(7));
    System.out.println("calc_fib" + calc_fib(7));

    // assert calcFibList(7) == 21 : "7 wrong " + calcFibList(7);  
    // assert calcFibList(0) == 0 : "0 wrong " + calcFibList(0);
    // assert calcFibList(11) == 144 : "11 wrong " + calcFibList(11);

    System.out.println("tests passed");
  }

  public static void main(String args[]) {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();

    // System.out.println(calc_fib(n));
    // runTests();
     System.out.println(calcFibList(n));
  }
}
