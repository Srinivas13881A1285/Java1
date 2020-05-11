import java.util.Arrays;

public class ReverseString {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        
        while(i < j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        
        
    }

    public void reverseString2(char[] s){
        int i = 0;
        int j = s.length - 1;

        while(i < j){
            s[i] ^= s[j];
            s[j] ^= s[i];
            s[i] ^= s[j];

            ++i;
            --j;
        }
        System.out.println(Arrays.toString(s));
    }

    public static void main(String[] args) {
        new ReverseString().reverseString2("Srinivas".toCharArray());
    }
}
