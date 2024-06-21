import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer to find its factorial: ");
        int n = scanner.nextInt();
        
        // Check if the number is non-negative
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = calculateFactorial(n);
            System.out.println("Factorial of " + n + " = " + factorial);
        }
        
        scanner.close();
    }
    
    // Recursive function to calculate factorial
    public static long calculateFactorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n * factorial(n-1)
        return n * calculateFactorial(n - 1);
    }
}
