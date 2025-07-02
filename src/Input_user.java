package src;
import java.util.Scanner;

public class Input_user {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();
        System.out.println("Hello, "+ name + "! Your are " + age + " years old.");
        scanner.close();


    }
}
