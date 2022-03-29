import java.util.Scanner;

public class ConvertHexadecimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String hexadecimal = in.next();
        in.close();
        int result = decimalConverter(hexadecimal);
        System.out.println(result);
    }

    private static int decimalConverter(String hexadecimal) {
        int n = hexadecimal.length();
        int res = 0;

        for (int i = 0; i < n; i++) {
            String from = String.valueOf(hexadecimal.charAt(i));
            switch (from) {
                case "A":
                     res += 10 * Math.pow(16, n - i - 1);
                     break;
                case "B":
                    res += 11 * Math.pow(16, n - i - 1);
                    break;
                case "C":
                    res += 12 * Math.pow(16, n - i - 1);
                    break;
                case "D":
                    res += 13 * Math.pow(16, n - i - 1);
                    break;
                case "E":
                    res += 14 * Math.pow(16, n - i - 1);
                    break;
                case "F":
                    res += 15 * Math.pow(16, n - i - 1);
                    break;
                default:
                    res += Integer.parseInt(from) * Math.pow(16, n - i - 1);
                    break;
            }
        }
        return res;
    }
}
