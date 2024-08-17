import java.util.Scanner;

public class IT24101660Lab4Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Use the ternary operator to check if the number is positive, negative, or zero
        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";

        // Print the result
        System.out.println("The number is: " + result);
    }
}
