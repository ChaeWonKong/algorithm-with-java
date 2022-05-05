import java.util.Scanner;

public class Fbi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = 5;
        String[] arr = new String[N];
        final String NOT_FOUND = "HE GOT AWAY!";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLine();
        }

        sc.close();

        for (int j = 0; j < N; j++) {
            int idx = arr[j].indexOf("FBI");
            if (idx >= 0) {
                sb.append(j+1);
                sb.append(" ");
            }
        }

        String res = sb.toString().trim();
        if (res.length() == 0) {
            System.out.println(NOT_FOUND);
        } else {
            System.out.println(res);
        }
    }
}
