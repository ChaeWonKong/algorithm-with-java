import java.util.Arrays;
import java.util.Scanner;

public class NumberCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int[] numberCards = new int[M];

        for (int i = 0; i < M; i++) {
            numberCards[i] = sc.nextInt();
        }

        Arrays.sort(numberCards);

        int N = sc.nextInt();
        int[] res = new int[N];
//
        for (int j = 0; j < N; j++) {
            int target = sc.nextInt();
            res[j] = binarySearch(numberCards, target, 0, M-1);
        }

        System.out.println(Arrays.toString(res).replaceAll("[^0-9 ]",""));
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        //        정렬되어 있는 array arr에 대해 target을 찾고, 있으면 idx를, 없으면 -1을 반환
        int mid = (start + end) / 2;
        if (start <= end) {
            if (target == arr[mid]) {
                return 1;
            } else if (target < arr[mid]){
                return binarySearch(arr, target, start, mid-1);
            } else {
                return binarySearch(arr, target, mid+1, end);
            }
        }
        return 0;
    }
}
