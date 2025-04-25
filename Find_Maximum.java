// So here we take a array with n elements so we check the array in left side and the greater value is to be repalaced if found any

// arr = [2,5,3,8,9,5,3,2]
// arr2 = [-1,2,3,3,8,9,9,9,9]

// so here the problem is like before 2 there where no number so we ste it -1 and then go further

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