import java.util.Scanner;

class Stack {
    int top;
    int max;
    int s[];

    public Stack(int size){
        max = size;
        s = new int[max];
        top = -1;


    }

    public void push(int x) {

        if (top >= max - 1) {
            System.out.println("stack overflow!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            return;
        }
        s[++top] = x;

    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1");
            return -1;
        }
        top--;
        return s[top + 1];
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack Underflow!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        System.out.println();
        System.out.println("Stack elements are: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(s[i]);
        }
    }

    public void peep(int i) {
        if (top - i + 1 <= -1) {
            System.out.println("Stack underflow!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        } else {
            System.out.println("Element at position "+ i + " is: "+ s[top - i + 1]);
          
        }
    }

    public void change(int j, int k) {
        if (top - j + 1 <= -1) {
            System.out.println("Stack underflow!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        } else {
            s[top - j + 1] = k;
            System.out.println("The new element at position "+ j + " is: "+k);
        }
    }

}

public class StackDemo {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of stack: ");
        int size = sc.nextInt();

        Stack stack = new Stack(size);
        System.out.println();
       

       

        while (true) {
            System.out.println();
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. DISPLAY");
            System.out.println("4. PEEP");
            System.out.println("5. CHANGE");
            System.out.println("6. EXIT");
            System.out.println();
            System.out.print("Enter a choice: ");
            
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Enter a value to Push: ");
                    int x = sc.nextInt();
                    stack.push(x);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.display();
                    break;
                
                case 4:
                    System.out.println("Enter a position of element to peep: ");
                    int i = sc.nextInt();
                    stack.peep(i);
                    break;

                case 5:
                    System.out.println("Enter a position of element which you want to change: ");
                    int j = sc.nextInt();
                    System.out.println("Enter a new Value of the element: ");
                    int k = sc.nextInt();
                    stack.change(j, k);
                    break;

                case 6:
                    System.out.println("Exited sucessfully.......");
                    sc.close();
                    return;

                default :
                    System.out.println("Invalid choice!! try again!!");
                    
            }

        }

    }
}

