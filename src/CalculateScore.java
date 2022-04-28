import java.util.Arrays;
import java.util.Scanner;

public class CalculateScore {
    public static void main(String[] args) {
        final int N = 8;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] index = selectionSort(arr);
        int ret = sum(Arrays.copyOfRange(arr, 0, 5));

        System.out.println(ret);
        System.out.println(Arrays.toString(index).replaceAll("[^0-9 ]",""));
    }

    private static int sum(int[] arr) {
        int total = 0;
        for (int n : arr) {
            total += n;
        }
        return total;
    }

    private static int[] selectionSort(int[] arr) {
        final int size = arr.length;
        int[] index = new int[size];

        for (int k = 0; k < size; k++) {
            index[k] = k + 1;
        }

        for (int i = 0; i < size - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1;  j < size; j++) {
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }
            int arrTmp = arr[i];
            int resTmp = index[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = arrTmp;
            index[i] = index[maxIdx];
            index[maxIdx] = resTmp;
        }
        int[] tmp = Arrays.copyOfRange(index, 0, 5);
        Arrays.sort(tmp);

        return  tmp;
    }
}
