import java.util.*;

class Tower_Water{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num: ");
        int n  = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                if(arr[i] > arr[j]){
                    arr[i] = arr[j];
                }
            }
        }

        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
}