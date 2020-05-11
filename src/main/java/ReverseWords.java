import java.util.Arrays;

/**
 * @author Srinivas_Chintakindhi
 */

public class ReverseWords {
    public static void main(String[] args) {
        String str = "Srinivas is good programmer";
        String result = "";
        String word = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            word = str.charAt(i) + word;

            if ((str.charAt(i) != ' ' && i == 0) || str.charAt(i) != ' ' && str.charAt(i - 1) == ' ') {
                result = result + word;
                word = "";
            }
        }

        System.out.println("result = " + result);

        reverseWords("He is very good at programming");
    }

    public static void reverseWords(String str) {
        String result = "";
        String word = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            if (str.charAt(i) != ' ') {
                word = str.charAt(i) + word;
            } else {
                word = word + str.charAt(i);
            }

            if (str.charAt(i) == ' ' || i == 0) {
                result = result + word;
                word = "";
            }
        }

        System.out.println("result = " + result);

        String[] s = str.split(" ");
        int i = 0, j = s.length - 1;

        while(i < j){
            String temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }


    }
}

//            if(curr !=' ')
//                word = curr + word;
//            else if( curr ==' ' && str.charAt(i - 1)!=' '){
//                word = curr + word;
//                result = result + word;
//                word = "";
//            }
