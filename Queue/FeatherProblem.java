import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class FeatherProblem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> s = new Stack<>();//create a stack
        
        System.out.println("-----------Note: Number of Query is 10 it can't be change-----------");
        System.out.println("Enter a Query: ");
        String input = sc.nextLine();

        String queries [] = input.split(" "); //split using space

        for(int i = 0 ; i < 10 ; i++){
            String query = queries[i];

            if(query.startsWith("buy_")){
                s.push(query.substring(4));
            }

            int size = s.size();

            if(query.startsWith("fetch")){
                s.push(s.remove(0));
            }
        }
        System.out.println();
        for(int i=s.size()-1; i>=0;i--)  {
            System.out.println(s.get(i));
        }
    }
}



