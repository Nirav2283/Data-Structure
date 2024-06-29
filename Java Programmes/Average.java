import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        double avg = 0;
        for(int i = 1 ; i <= n ; i++){
            sum = sum + i;
        }
        avg = (double) sum/n;
        System.out.println(avg);
    }
}
