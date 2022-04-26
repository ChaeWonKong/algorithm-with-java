import java.util.Scanner;

public class BanStudyAbroad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String ret = word.replaceAll("[CAMBRIDGE]", "");
        System.out.println(ret);
        sc.close();
    }
}
