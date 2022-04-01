import java.util.Scanner;

public class IsBigger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = false;
        while (true) {
            int a = in.nextInt();
            int b = in.nextInt();

            if (a == 0 && b == 0) {
                break;
            }

            System.out.println(isBigger(a, b));
        }
        in.close();
    }
    private static String isBigger(int a, int b) {
        if(a > b) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
