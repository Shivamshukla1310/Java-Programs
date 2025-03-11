import java.util.Stack;

public class Infix_to_postfix{
    private static int precedence(chr op){
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
        StrinfBuilder postfix = new StrinfBuilder();
        Stack<Character> stack = new Stack<>();

        for(int i = 0; j < infix.length(); i++){
            char ch = infix.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                postfix.append(ch);
            }

            else if (ch == ("(")){
                stack.push(ch);
            }

            else if (ch == (")")){
                while (!stack.isEmpty() && stack.peek() != ("(")){
                    postfix.append(stack.pop());
                }
                stack.pop()
            }
        }
    }
}