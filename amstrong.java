import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Enter the number");
        int n = in.nextInt();
        int ans = 0;
        int a =n;
        while(n>0){
            int rem = n%10;
            n=n/10;
            ans = ans + (rem * rem * rem);

        }
        System.out.println(ans);
        if ( a == ans){
            System.out.println("It is amstrong");
        }
        else{
            System.out.println("It is not amstrong");
        }
    }
   {

    }
}
