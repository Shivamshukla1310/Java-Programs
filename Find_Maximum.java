import java.util.*;
class Find_Maximum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr2[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Num" + i + ":");
            arr[i] = sc.nextInt();
        }
        arr2[0] = -1;
        for(int i = 1; i < n; i++){
            int max = arr[0];
            for(int j = 1; j < i; j++){
                if(arr[j] > max){
                    max = arr[j];
                }
            }
            arr2[i] = max;
        }
        
        System.out.println("This are elements:");
        for(int i = 0; i < n; i++){
            System.out.println(arr2[i]);
        }
    }
}