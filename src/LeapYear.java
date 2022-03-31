import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int result = isLeapYear(num);
        System.out.println(result);
    }

    private static int isLeapYear(int num){
        if (num % 400 == 0) {
            return 1;
        }
        if (num % 4 == 0 && num % 100 != 0) {
            return 1;
        }
        return 0;
    }
}
