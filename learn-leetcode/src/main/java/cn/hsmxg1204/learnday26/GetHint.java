package cn.hsmxg1204.learnday26;

/**
 * TODO
 *
 * @author gxming
 * @description
 * @date 2021-11-08 10:11
 */
public class GetHint {
    public static String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] numbers = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            // 求公牛数
            if (s == g) {
                bulls++;
            } else {

                // 求奶牛数
                if (numbers[s - '0'] > 0) {
                    cows++;
                }
                if (numbers[g - '0'] < 0) {
                    cows++;
                }
                numbers[s - '0']--;
                numbers[g - '0']++;
            }
        }

        return bulls + "A" + cows + "B";
    }

    public static void main(String[] args) {
        System.out.println(getHint("1807", "7810"));

        System.out.println(getHint("1123", "0111"));
    }
}
