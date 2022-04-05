import java.util.Scanner;

public class MaxCharacter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] count = new int[26];
        StringBuilder res = new StringBuilder();
        int max = 0;

        while(in.hasNextLine()) {
            String str = in.nextLine();
            for (int i = 0; i < str.length(); i++) {
                int ascii = str.charAt(i);
                if (ascii >= 97) {
                    int idx = ascii-97;
                    count[idx] ++;
                    if (max < count[idx]) {
                        max = count[idx];
                    }
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] == max) {
                res.append((char)(i + 97));
            }
        }
        System.out.println(res);
    }
}
