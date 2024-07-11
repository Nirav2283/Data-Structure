import java.util.*;

public class ValidParenthesis {

    private char[] stack;
    private int top;

    
    public ValidParenthesis(int size) {
        stack = new char[size];
        top = -1;
    }

    
    public void push(char c) {
        stack[++top] = c;
    }

    
    public char pop() {
        if (top == -1) {
            return '\0'; 
        }
        return stack[top--];
    }

   
    public boolean isEmpty() {
        return top == -1;
    }

    public String isValid(String s) {
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (isEmpty()) {
                    return "Not Valid";
                }
                char p = pop();
                if ((c == ')' && p != '(') ||
                    (c == '}' && p != '{') ||
                    (c == ']' && p != '[')) {
                    return "Not Valid";
                }
            }
        }
        return isEmpty() ? "Valid" : "Not Valid";
    }

    public static void main(String[] args) {
        Scanner nv = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = nv.next();

        ValidParenthesis stack = new ValidParenthesis(s.length());

        System.out.println("String "+s+" is: "+stack.isValid(s));
    }
}
