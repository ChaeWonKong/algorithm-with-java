import java.util.Objects;
import java.util.Scanner;

public class TotalVowels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            String s = in.nextLine();

            if(Objects.equals(s, "#")) {
                break;
            }
            System.out.println(countVowels(s.toCharArray()));
        }

        in.close();
    }

    private static int countVowels(char[] arr) {
        int count = 0;
        char[] vowels = {'a', 'i', 'o', 'u', 'e', 'A', 'I', 'O', 'U', 'E'};

        for (char s : arr) {
            for (char vowel : vowels) {
                if (Objects.equals(s, vowel)) {
                    count += 1;
                }
            }
        }

        return count;
    }
}
