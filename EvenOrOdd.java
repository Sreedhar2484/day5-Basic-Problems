
import java.util.Scanner;

public class EvenOrOdd {

    // Main Driver Method
    public static void main(String[] args) {
        // Declaring and initializing integer variable
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        // Checking if number is even or odd number
        // via remainder
        if (num % 2 == 0) {
            System.out.println("Entered Number is Even");
        }

        else {
            System.out.println("Entered Number is Odd");
        }
    }
}