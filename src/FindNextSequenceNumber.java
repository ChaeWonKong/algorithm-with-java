import java.util.Scanner;

public class FindNextSequenceNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        System.out.println(findNextSequenceNumber(arr, N));
    }

    private static int findNextSequenceNumber(int[] arr, int n) {
        int idx = 0;
        if (arr[idx + 2] - arr[idx + 1] == arr[idx + 1] - arr[idx]) {
          int diff = arr[idx + 1] - arr[idx];
          return arr[n-1] + diff;
        } else {
          int mul = arr[idx + 1] / arr[idx];
          return arr[n-1] * mul;
        }
    }
}
