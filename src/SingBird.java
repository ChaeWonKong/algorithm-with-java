import java.util.Scanner;

public class SingBird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = countSeconds(sc.nextInt());
        sc.close();
        System.out.println(result);
    }

    private static int countSeconds(int n) {
        int count = 0;
        int r = n;
        while (r > 0) {
            int i = 0;
            while (r > i) {
                i += 1;
                r -= i;
                count ++;
            }
        }
        return count;
    }
}
