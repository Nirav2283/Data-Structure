import java.util.*;
public class AngramGame {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of word: ");
        int n = sc.nextInt();
        System.out.println("Enter a words: ");
        String s [] = new String[n];

        for (int i = 0 ; i < n ; i++){
            s[i] = sc.next();
        }

        int range = (n-1) - 0 + 1;
        int num = (int)(Math.random() * range);

        System.out.println("The Random word is: " + s[num]);

        System.out.println("Enter a Anagram Word Of this Word: ");

        String str = sc.next();
        boolean flag = false;

        for(int i = 0 ; i < s[num].length() ; i++){
            flag = false;
            for(int j = 0 ; j < str.length() ; j++){
                if(s[num].charAt(i) == str.charAt(j)){
                    flag = true;
                }

            }
            if(!flag){
                break;
            }
        }

        if(flag){
            System.out.println("It is an Anagram");
        }else{
            System.out.println("It is not an Anagram");
        }




    }
}
