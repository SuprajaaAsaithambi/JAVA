import java.util.Scanner;

public class greetings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String n = input.next();
        System.out.println("Welcome " + n);
    }
}
