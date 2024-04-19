import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = in.nextInt();
        System.out.println("Enter the second number");
        int b = in.nextInt();
        if (a>b){
            System.out.println(a +" is the greatest");
        }
        else{
            System.out.println(b + " is the greatest");
        }
    }
}
