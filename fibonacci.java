import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = input.nextInt();
        int b= 0;
        int c= 1;
        int count =2;
        while (count < a){
            int temp=b+c;
            b=c;
            c=temp;
            count++;
            System.out.println(b);

        }
    }
}
