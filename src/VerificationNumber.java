import java.util.Scanner;
import java.lang.Math;

public class VerificationNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int N = 5;
        int total = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        for (int j = 0; j < N; j++) {
            total += Math.pow(arr[j], 2);
        }

        System.out.println(total % 10);
    }
}
