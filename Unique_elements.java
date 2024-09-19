// Write a java program to display unique elements in array

class Unique_elements {
    public static void main(String args[]) {
        int arr[] = {2, 4, 6, 7, 3, 2, 5, 6, 7};
        System.out.println("Unique elements in the array are:");
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;  
                }
            }
            if (isUnique) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
