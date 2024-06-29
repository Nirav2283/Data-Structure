import java.util.*;
public class Vowel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char s = sc.next().charAt(0);
        if(s=='a' || s == 'e' || s=='i' || s=='o' || s=='u' || s=='A' || s == 'E' || s=='I' || s=='O' || s=='U'){
            System.out.println("VOWEL");
        }else{
            System.out.println("Not Vowel");
        }

    }
}
