import java.util.Scanner;

/**
 * @author Srinivas_Chintakindhi
 */

public class SameStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tCases = scanner.nextInt();
        for (int i = 0; i < tCases; i++) {
            String s = scanner.next();
            String t = scanner.next();
            System.out.println(sameStrings(s, t));
        }
    }

    private static String sameStrings(String s, String t) {
        int[] tc = new int[26];
        int[] sc = new int[26];

        for (char c : s.toCharArray()) {
            sc[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            tc[c - 'a']++;
        }

        for (int j = 0; j < 26; j++) {
            if (Math.abs(tc[j] - sc[j]) % 2 != 0) {
                return "NO";
            }
        }
        return "YES";
    }
}
