import java.util.Stack;

public class Infix_to_postfix{
    public static void main(String args[]){
        String infix = "A+(B*C-(D/E^F)*G)*H";
        System.out.println("infix Expression: " + infix);
        System.out.println("Postfix Expression: " + Infix_to_postfix(infix));    
    }
    
    private static int precedence(char op){
        switch(op){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    public static String Infix_to_postfix(String infix){
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < infix.length(); i++){
            char ch = infix.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                postfix.append(ch);
            }

            else if (ch == '('){
                stack.push(ch);
            }

            else if (ch == ')'){
                while (!stack.isEmpty() && stack.peek() != '('){
                    postfix.append(stack.pop());
                }
                stack.pop();
            }

            else{
                while(!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)){
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while(!stack.isEmpty()){
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

}