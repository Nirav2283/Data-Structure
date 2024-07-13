

import java.util.Stack;
import java.util.Scanner;

class Postfix1{
    public boolean isOperator(char ch){
        return (ch == '+' || ch == '-' || ch == '*' ||ch == '/' ||ch == '^' );
    }

    public int prec(char ch){
        switch(ch){
            case '^':
            return 3;

            case '*':
            case '/':
            return 2;

            case '+':
            case '-':
            return 1;

            default:
            return -1;
        }
    }

    public void converter(String s){
        Stack<Character> stack = new Stack<>();
        String polish = "";
        stack.push('(');
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);

            if(c >= 'A' && c <= 'Z' || c >='a' && c <= 'z'){
                polish = polish + c;
            }
            else if(c == '('){
                stack.push(c);
            }
            else if(c == ')'){
                while(stack.peek() != '('){
                    char temp = stack.pop();
                    polish = polish + temp;
                }
                stack.pop();
            }
            else if(isOperator(c)){
                while(prec(stack.peek()) >= prec(c)){
                    polish = polish + stack.pop();
                }
                stack.push(c);
            }
        }

        while(!stack.isEmpty()){
            polish = polish + stack.pop();
        }
        System.out.println(polish);
    }

}




public class InfixToPostfixShort {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Postfix1 p = new Postfix1();
        System.out.print("Enter a String (and Put closing bracket after expression): ");
        String s1  = sc.nextLine();
        System.out.println("Postfix Expression is: ");
        p.converter(s1);

        
    }
}
