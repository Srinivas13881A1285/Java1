/**
 * @author Srinivas_Chintakindhi
 */

public class PowerwithoutMulandDivOps {
    public int pow(int a,int b){
        if(b == 0)
            return 1;

        int answer = a;
        int increment = a;

        for (int i = 0; i < b - 1; i++) {
            for (int j = 0; j < a -1 ; j++) {
                answer += increment;
            }
            increment = answer;
        }

        return answer;
    }

    public static void main(String[] args) {
        int pow = new PowerwithoutMulandDivOps().pow(4, 3);
        System.out.println("pow = " + pow);
    }
}
