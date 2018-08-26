import java.util.*;
import java.io.*;
import java.lang.Math;

public class MaxPairwiseProduct {
    static int getMaxPairwiseProduct(int[] numbers) {
        int maxProduct = 0;
        int n = numbers.length;

        for (int first = 0; first < n; ++first) {
            for (int second = first + 1; second < n; ++second) {
                maxProduct = Math.max(maxProduct, numbers[first] * numbers[second]);
            }
        }

        return maxProduct;
    }

    static long getFastMaxPairwiseProduct(long[] numbers) {
        long firstMax = 0;
        int firstMaxIndex = 0;

        long secondMax = 0;

        long n = numbers.length;

        for (int first = 0; first < n; ++first) {

            if (numbers[first] > firstMax) {
                firstMax = numbers[first];
                firstMaxIndex = first;
            }
        }

        for (int second = 0; second < n; ++second) {

            if (numbers[second] > secondMax && firstMaxIndex != second) {
                secondMax = numbers[second];
            }
        }

        return firstMax * secondMax;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        long[] numbers = new long[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextLong();
        }
        System.out.println(getFastMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }

}