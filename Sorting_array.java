// 1. To sort numeric array in ascending and descending order

class Sorting_array {

    public static void main(String args[]) {
        int ascending[] = {2, 4, 1, 8, 3, 9, 7, 6};
        for (int i = 0; i < ascending.length - 1; i++) {
            for (int j = 0; j < ascending.length - 1 - i; j++) {
                if (ascending[j] > ascending[j + 1]) {
                    int temp = ascending[j];
                    ascending[j] = ascending[j + 1];
                    ascending[j + 1] = temp;
                }
            }
        }
        System.out.println("Ascending:");
        for (int i = 0; i < ascending.length; i++) {
            System.out.print(ascending[i] + " ");
        }
        int descending[] = {2, 4, 1, 8, 3, 9, 7, 6};
        for (int i = 0; i < descending.length - 1; i++) {
            for (int j = 0; j < descending.length - 1 - i; j++) {
                if (descending[j] < descending[j + 1]) {
                    int temp = descending[j];
                    descending[j] = descending[j + 1];
                    descending[j + 1] = temp;
                }
            }
        }
        System.out.println("\nDescending:");
        for (int i = 0; i < descending.length; i++) {
            System.out.print(descending[i] + " ");
        }
    }

}
