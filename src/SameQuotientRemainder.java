import java.util.Scanner;

public class SameQuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(sumAllSameQuotientRemainderNumbers(N));
    }

    private static long sumAllSameQuotientRemainderNumbers(int n) {
        long sum = 0;
        for (long i = 1; i < n; i++) {
            sum += ((n + 1) * i);
        }
        return sum;
    }
}
