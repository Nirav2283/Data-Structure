import java.util.Scanner;

public class SumMtoN {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first Number: ");
        int m = sc.nextInt();
        System.out.println("Enter a Second Number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = m ; i <= n ;i++){
            sum = sum + i;

        }
        System.out.println("Sum of the Number between "+m+" and "+n+" is: "+sum);
    }
}
