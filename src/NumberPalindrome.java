import java.util.Scanner;
import java.util.stream.Stream;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int num = in.nextInt();
            if (num == 0) {
                break;
            }
            int[] arr = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
            System.out.println(isPalindrome(arr));
        }
        in.close();
    }

    private static String isPalindrome(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int j = n - i - 1;
            if (i >= j) {
                break;
            }

            if (arr[i] != arr[j]) {
                return "no";
            }
        }
        return "yes";
    }
}
