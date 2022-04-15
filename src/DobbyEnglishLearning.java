import java.util.Objects;
import java.util.Scanner;

public class DobbyEnglishLearning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String line = sc.nextLine().toLowerCase();
            if (Objects.equals(line, "#")) {
                break;
            }
            char target = 'a';
            int count = 0;
            for (int i = 0; i < line.length(); i++) {
                if (i == 0) {
                    target = line.charAt(i);
                }
                else if (Objects.equals(target, line.charAt(i))) {
                    count += 1;
                }
            }

            System.out.printf("%c %d%n", target, count);
        }
    }
}
