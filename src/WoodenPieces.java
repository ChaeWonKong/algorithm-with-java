import java.util.Arrays;
import java.util.Scanner;

public class WoodenPieces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 5;
        int[] unsorted = new int[N];
        for (int i = 0; i < N; i++) {
            unsorted[i] = sc.nextInt();
        }

        selectionSort(unsorted, N);
        sc.close();
    }

    private static void selectionSort(int[] arr, int n) {
        while (!isSorted(arr, n)) {
            for (int i = 0; i < n -1; i++) {
                int j = i + 1;
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    System.out.println(stringifyArray(arr));
                }
            }
        }
    }

    private static boolean isSorted(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static String stringifyArray(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int n : arr) {
            sb.append(n);
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}
