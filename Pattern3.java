import java.util.Scanner;

class Pattern3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Num: ");
        int a = sc.nextInt();
        int b = 1;
        for(int i = 1; i <= a; i++){
            for(int j = 1; j <= i; j++){
                System.out.print((b) + " ");
                if(b == 1){
                    b -= 1;
                }
                else{
                    b +=1;
                }
            }
        System.out.println();
        }
    }
}