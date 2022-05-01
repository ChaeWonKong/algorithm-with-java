import java.util.Scanner;

public class UpHill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findMaxUphill(arr, N));
    }

    private static int findMaxUphill(int[] arr, int N) {
        int maxUphill = 0;
        for (int i = 0; i < N-1; i++) {
            int j = i + 1;

            while (j < N && arr[j-1] < arr[j]) {
                maxUphill = Math.max(maxUphill, arr[j] - arr[i]);
                j += 1;
            }
        }
        return maxUphill;
    }
}
