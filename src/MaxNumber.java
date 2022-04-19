import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int maxIdx = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > arr[maxIdx]) {
                maxIdx = i;
            }
        }
        System.out.println(arr[maxIdx]);
        System.out.println(maxIdx + 1);
    }
}
