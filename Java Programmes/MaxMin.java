import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++){
            numbers[i] = scanner.nextInt();
        }
        int minPosition = 0;
        int maxPosition = 0;
        int minValue = numbers[0];
        int maxValue = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
                minPosition = i;
            }
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
                maxPosition = i;
            }
        }
        System.out.println("Position of the smallest number  is: " + (minPosition + 1));
        System.out.println("Position of the largest number is: " + (maxPosition + 1));
        scanner.close();
    }
}