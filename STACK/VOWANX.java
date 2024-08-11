import java.util.Stack;
public class VOWANX{
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String s = "bcadage";
        String ans = "";

        for(int i = s.length() - 1 ; i >= 0  ; i--){
            char c = s.charAt(i);
            stack.push(c);            
        }
        StringBuffer sb = new StringBuffer("");
        while(!stack.isEmpty()){
            char p = stack.pop();
            if(p == 'a' || p == 'e' || p == 'i' || p == 'o' || p == 'u'){
                sb.reverse();
                sb.append(p);
            }else{
                sb.append(p);
            }
        }

        System.out.println(sb);
    }
}