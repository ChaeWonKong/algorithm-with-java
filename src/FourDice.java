import java.util.Scanner;

public class FourDice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int maxReward = 0;

        for (int i : new int[N]) {
            int[] dice = new int[4];
           for (int j = 0; j < 4; j++) {
               dice[j] = sc.nextInt();
           }
            int reward = calcReward(dice);
            maxReward = Math.max(reward, maxReward);
        }

        System.out.println(maxReward);
    }

    private static int calcReward(int[] dice) {
        int N = 6;
        int[] count = new int[N];
        int maxNumber = 0;

        for (int d : dice) {
            count[d - 1] += 1;
        }

        for (int i = 0; i < N; i++) {
            // TODO: Max Number 저장
            if (count[i] > 0) {
                maxNumber = Math.max(maxNumber, i + 1);
            }
            if (count[i] == 4) {
                return 50000 + (i + 1) * 5000;
            }
            if (count[i] == 3) {
                return 10000 + (i + 1) * 1000;
            }
            if (count[i] == 2) {
                for (int j = i + 1; j < N; j++) {
                    if (count[j] == 2) {
                        return 2000 + (i + 1) * 500 + (j + 1) * 500;
                    }
                }
                return 1000 + (i + 1) * 100;
            }
        }
        return maxNumber * 100;
    }
}
