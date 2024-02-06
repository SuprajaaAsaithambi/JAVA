import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int a = in.nextInt();
        int f = 1;
        while (a>0){
            f=f*a;
            a--;
        }
        System.out.println("enter the number");
        int b = in.nextInt();
        int g=1;
        for (int i=1;i<=b;i++){
             g = g*i;
        }
        System.out.println("Factorial is "+ f);
        System.out.println("Factorial is "+ g);
    }
}
