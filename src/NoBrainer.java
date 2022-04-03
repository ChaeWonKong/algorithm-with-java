import java.util.Scanner;

public class NoBrainer {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int N = in.nextInt();

        for (int i = 0; i < N; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            if (a >= b) {
                System.out.println("MMM BRAINS");
            } else {
                System.out.println("NO BRAINS");
            }
        }

        in.close();
    }
}
