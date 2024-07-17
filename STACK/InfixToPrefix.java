import java.util.Stack;
import java.util.Scanner;

class Prefix {
    public int InputPrecedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 2;

            case '*':
            case '/':
                return 4;

            case '^':
                return 5;

            case '(':
                return 9;

            case ')':
                return 0;

            default:
                return 7;

        }

    }

    public int StackPrecedence(char ch) {

        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 3;

            case '^':
                return 6;

            case '(':
                return 0;

            default:
                return 8;

        }

    }

    public String reverse(String s){
        String reverse = "";
        for(int i = s.length() - 1 ; i >= 0 ;i--){
            if(s.charAt(i) == ')'){
                reverse += '(';
            }else if(s.charAt(i) == '('){
                reverse += ')';
            }else{
                reverse += s.charAt(i);
            }
           
        }
        return reverse;

    }

    public int rank(char ch){
        switch (ch) {
            case '+':
            case '-':
                return -1;

            case '*':
            case '/':
                return -1;

            case '^':
                return -1;


            default:
                return 1;

        }

    }

    public void convert(String s){
        
        Stack<Character> stack = new Stack<>();
		String polish = "";
		int rank = 0;
        String rev_infix = reverse(s);
		stack.push('(');
        
		for(int i = 0 ; i < rev_infix.length() ; i++){
            
			char next  = rev_infix.charAt(i);
				
			if(stack.size() < 1)
			{
				System.out.println("Invalid String");
			}

			
			while(StackPrecedence(stack.peek()) > InputPrecedence(next))
			{
				char temp = stack.pop();
				polish = polish + temp;
				rank = rank + rank(temp);
				if(rank < 1)
				{
					
					System.out.println("Invalid String");
				
				}

			}
			if(StackPrecedence(stack.peek()) != InputPrecedence(next))
			{
				stack.push(next);
			}
			else
			{
				stack.pop();
			}

			
		}
		if(rank != 1)
		{
			System.out.println("Invalid String");
            
		
		}
		else
		{
			System.out.println(reverse(polish));
        
		}
        

    }
}

public class InfixToPrefix{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Prefix p = new Prefix();
        System.out.println("Enter a INFIX string (and add extra closing bracket after enter a Expression): ");
        String infix = sc.nextLine();
        System.out.println("Reverse of Infix is: "+p.reverse(infix));
        System.out.print("Prefix Expression is: ");
        p.convert(infix);

    }
}