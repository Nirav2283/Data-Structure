import java.util.Scanner;
import java.util.Stack;

class Evaluation{

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

    
    public void postfixevaluation(String s){
        Stack<Integer> stack = new Stack<>();
        String ans = "";
        for(int i = 0 ; i < s.length() ; i++){
            char next = s.charAt(i);
            if(isDigit(next)){
                stack.push(Integer.parseInt(String.valueOf(next)));
            }
            else if(isOperator(next)){
                int op2 = stack.pop();
                int op1 = stack.pop();
                int result = apply(next, op1, op2);
                stack.push(result);
                

            }
        }
        System.out.println("ans of postfix expression is: "+stack.pop());
        
    }
}
public class EvaluationPostfix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Evaluation e = new Evaluation();
        System.out.println("Enter a Expression(with space): ");
        String postfix = sc.nextLine();
        e.postfixevaluation(postfix);

    }
}