import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        int MAX_NUMBER = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        int minOdd = MAX_NUMBER;
        int sumOdd = 0;

        for (int i = 0; i < 7; i++) {
            int num = sc.nextInt();
            if (num % 2 == 1) {
                sumOdd += num;
                minOdd = Math.min(minOdd, num);
            }
        }
        sc.close();

        if (minOdd == MAX_NUMBER) {
            System.out.println(-1);
        } else {
            System.out.println(sumOdd);
            System.out.println(minOdd);
        }
    }
}
