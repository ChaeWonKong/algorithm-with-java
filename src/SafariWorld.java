import java.util.Scanner;

public class SafariWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        System.out.println(absDiff(m, n));
    }

    private static long absDiff(int a, int b) {
        return Math.abs((long) a - (long) b);
    }
}
