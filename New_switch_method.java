import java.util.Scanner;

class New_switch_method{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = switch(str.toLowerCase())
        {
            case "sunday" -> "Wake Up At 7 Am";

            default -> "Wake up at 6 Am";
        };
        System.out.println(result);
    }
}