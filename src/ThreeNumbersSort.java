import java.util.Scanner;

public class ThreeNumbersSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = 3;
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        in.close();

        sort(arr);

        String[] res = new String[N];

        for (int i = 0; i < N; i++) {
            res[i] = Integer.toString(arr[i]);
        }
        System.out.println(String.join(" ", res));
    }

    private static void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
