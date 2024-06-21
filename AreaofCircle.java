import java.util.Scanner;
public class AreaofCircle {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double r = sc.nextInt();
        double area = 3.14 * r * r;
        System.out.println("Area of the circle is: "+area);

    }
}
