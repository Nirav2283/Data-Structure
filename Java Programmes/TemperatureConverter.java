import java.util.Scanner;

public class TemperatureConverter {

   
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

   
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        int choice = scanner.nextInt();
        
        double temperature;
        
        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            temperature = scanner.nextDouble();
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.printf("%.2f Celsius = %.2f Fahrenheit\n", temperature, fahrenheit);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            temperature = scanner.nextDouble();
            double celsius = fahrenheitToCelsius(temperature);
            System.out.printf("%.2f Fahrenheit = %.2f Celsius\n", temperature, celsius);
        } else {
            System.out.println("Invalid choice. Please choose 1 or 2.");
        }
    }
}
