import java.util.Scanner;
public class average {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("enter the number");
            int a = in.nextInt();
            int f = 0;
            while (a>0){
                f=f+a/a;
                a--;
            }
            System.out.println("enter the number");
            int b = in.nextInt();
            int g=0;
            for (int i=0;i<=b;i++){
                g = g+i/b;
            }
            System.out.println("Factorial is "+ f);
            System.out.println("Factorial is "+ g);
        }
    }


