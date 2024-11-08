package week05;
import java.util.Scanner;

public class RndomCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num 1 :");
        int a = scanner.nextInt();
        System.out.println("Enter num 2 :");
        int b = scanner.nextInt();

        try{
            int c = a/b;
            System.out.println(c);
        }catch (ArithmeticException exception){
            System.out.println("An error occured while trying to divide by zero");
        }
    }
}
