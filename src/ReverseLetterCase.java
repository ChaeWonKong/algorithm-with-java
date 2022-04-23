import java.util.Scanner;

public class ReverseLetterCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(reverseLetterCase(sc.nextLine()));
        sc.close();
    }

    private static String reverseLetterCase(String s) {
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char target = s.charAt(i);
            if (Character.isLowerCase(target)) {
                result[i] = Character.toUpperCase(target);
            } else {
                result[i] = Character.toLowerCase(target);
            }
        }
        return new String(result);
    }
}
