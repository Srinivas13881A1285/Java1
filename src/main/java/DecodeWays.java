/**
 * @author Srinivas_Chintakindhi
 */


public class DecodeWays {
    public int numDecodings(String s) {
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;

        for (int i = 2; i <= s.length(); i++) {
            int oneDigit = Integer.valueOf(s.substring(i - 1, i));
            int twoDigits = Integer.valueOf(s.substring(i - 2, i));

            if (oneDigit >= 1)
                dp[i] += dp[i - 1];

            if (twoDigits >= 10 && twoDigits <= 26)
                dp[i] += dp[i - 2];

        }

        return dp[s.length()];
    }

    public static void main(String[] args) {
        int i = new DecodeWays().numDecodings("12321");
        System.out.println("i = " + i);
    }
}
