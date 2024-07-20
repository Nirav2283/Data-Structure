import java.util.Stack;
import java.util.Scanner;

class Nirav{

    public boolean isDigit(int n){
       return n >= '0' && n <= '9' ; 
    }

    public boolean isOperator(char ch){
        return (ch == '+' || ch == '-' || ch == '*' ||ch == '/' ||ch == '^');
    }

    public int apply(char operator , int operand1 , int operand2){
        switch(operator){
            case '+':
               return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
            case '^':
                return operand1 ^ operand2;
            default:
                return -1;
                
        }
    }

    
    public void prefixevaluation(String s){
        Stack<Integer> stack = new Stack<>();
        String ans = "";
        for(int i = s.length() - 1 ; i >= 0 ; i--){
            char next = s.charAt(i);
            if(isDigit(next)){
                stack.push(Integer.parseInt(String.valueOf(next)));
            }
            else if(isOperator(next)){
                int op2 = stack.pop();
                int op1 = stack.pop();
                int result = apply(next, op2, op1);

                stack.push(result);

            }
        }
        System.out.println("ans of prefix expression is: "+stack.pop());
        
    }
}

public class EvaluationPrefix {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Nirav n = new Nirav();
        System.out.println("Enter a Expression(with space): ");
        String prefix = sc.nextLine();
        n.prefixevaluation(prefix);

    }
}
