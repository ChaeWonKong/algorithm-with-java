import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxReward = 0;

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int[] counts = new int[6];
            for (int j = 0; j < 3; j++) {
                int num = sc.nextInt();
                counts[num-1] += 1;
            }

            for (int k = 0; k < 6; k++) {
                int tempMax = 0;
                if (counts[k] == 3) {
                    int reward = 10000 + (k + 1) * 1000;
                    maxReward = Math.max(reward, maxReward);
                    break;
                } else if (counts[k] == 2) {
                    int reward = 1000 + (k + 1) * 100;
                    maxReward = Math.max(reward, maxReward);
                    break;
                } else {
                    if (counts[k] > 0) {
                        tempMax = Math.max(tempMax, (k + 1));
                    }
                }
                maxReward = Math.max(tempMax * 100, maxReward);
            }
        }

        System.out.println(maxReward);
        sc.close();
    }
}
