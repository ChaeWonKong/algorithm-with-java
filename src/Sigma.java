import java.util.Scanner;

public class Sigma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        sc.close();

        System.out.println(sumNumbersBetween(a, b));
    }

    private static long sumNumbersBetween(long a, long b) {
        if (a < b) {
            long tmp = a;
            a = b;
            b = tmp;
        }
        return (a * (a+ 1) - b * (b - 1)) / 2;
    }
}
