
import java.util.Scanner;
public class EvenSubstrings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum;
        String stringOfNum;

        int n = s.nextInt();
        stringOfNum = s.next();
        sum = 0;


        for(int i = 0; i < n; i++){
            if((stringOfNum.charAt(i)-48)%2==0){
                sum += i+1;
            }
        }

        System.out.println(sum);
    }
}
