import java.util.*;

public class Swap_number {
  static void swap(double a , double b){
    double temp = a;
    a = b;
    b = temp ;

    System.out.println("First number is: "+a);
    System.out.println("Second Number is: "+b);
  
  
  }
    public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter number a: ");
      double a =  sc.nextDouble();
      System.out.println();
      double b = sc.nextDouble();
      swap(a,b);

    }
}
