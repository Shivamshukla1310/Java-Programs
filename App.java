
import java.util.Scanner;

class App {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    
        int ans;
        do { 
            System.out.println("Enter Your Number:");
            ans = scn.nextInt();
            switch (ans) {
                case 1:
                    System.out.println("Punjabi");
                    break;
                case 2:
                    System.out.println("Gujarati");
                    break;
                case 3:
                    System.out.println("Rajasthani");
                    break;
                default:
                    System.out.println("Galat  Entry sorry...");
            }
        } while(ans>=1 && ans<=3);
    }
}