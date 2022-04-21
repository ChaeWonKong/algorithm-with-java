import java.util.HashMap;
import java.util.Scanner;

public class MaxFrom2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 9;
        int[][] arr = new int[9][9];

        HashMap<String, Integer> maxPos = new HashMap<>(2);
        maxPos.put("i", 0);
        maxPos.put("j", 0);
        int maxNumber = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int target = sc.nextInt();
                arr[i][j] = target;
                if (target > maxNumber) {
                    maxPos.put("i", i + 1);
                    maxPos.put("j", j + 1);
                    maxNumber = target;
                }
            }
        }
        sc.close();

        System.out.println(maxNumber);
        System.out.printf("%d %d", maxPos.get("i"), maxPos.get("j"));
    }
}
