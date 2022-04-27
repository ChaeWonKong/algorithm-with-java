import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findMaxSum(arr, N, M));
    }

    private static int findMaxSum(int[] arr, int N, int M) {
        int maxSum = 0;

        for (int i = 0; i < N - 2; i++) {
            if (arr[i] > M) {
                continue;
            }
            for (int j = i + 1; j < N - 1; j++) {
                if (arr[i] + arr[j] > M) {
                    continue;
                }
                for (int k = j + 1; k < N; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (arr[i] + arr[j] + arr[k] == M) {
                        return sum;
                    }
                   if (sum < M) {
                       maxSum = Math.max(maxSum, sum);
                   }
                }
            }
        }

        return maxSum;
    }
}
