import java.util.Objects;
import java.util.Scanner;

public class OctopusNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String octNum = sc.nextLine();
            if (Objects.equals(octNum, "#")) {
                sc.close();
                break;
            }
            System.out.println(convertOctopusNumberToDecimal(octNum));
        }
    }

    private static int convertOctopusNumberToDecimal(String octNum) {
        int n = octNum.length();
        int decimal = 0;

        for (int i = 0; i < n; i++) {
            char target = octNum.charAt(i);
            double mul = Math.pow(8, n - i - 1);
//            switch (target) {
//                case '-' -> decimal += (0 * mul);
//                case '\\' -> decimal += (1 * mul);
//                case '(' -> decimal += (2 * mul);
//                case '@' -> decimal += (3 * mul);
//                case '?' -> decimal += (4 * mul);
//                case '>' -> decimal += (5 * mul);
//                case '&' -> decimal += (6 * mul);
//                case '%' -> decimal += (7 * mul);
//                case '/' -> decimal -= mul;
//
//            }
        }
        return decimal;
    }
}
