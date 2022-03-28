import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        in.close();

        sort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int low, int high) {
        // 탈출조건
        if(high - low < 2) {
            return;
        }
        int mid = (high + low) / 2;
        sort(arr, 0, mid);
        sort(arr, mid, high);
        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high){
        int[] temp = new int[high-low];
        int idx = 0, l = low, h = mid;

        while (l < mid && h < high) {
            if (arr[l] < arr[h]) {
                temp[idx++] = arr[l++];
            } else {
                temp[idx++] = arr[h++];
            }
        }

        while (l < mid) {
            temp[idx++] = arr[l++];
        }

        while(h < high) {
            temp[idx++] = arr[h++];
        }

        // 원배열의 일부를 정렬된 배열로 변경
        System.arraycopy(temp, 0, arr, low, high - low);
    }
}
