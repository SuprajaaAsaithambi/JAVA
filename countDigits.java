import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c =0;
        while(n>0){

            c++;
            n=n/10;


        }
        System.out.println(c);
    }
}
