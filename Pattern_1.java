/*import java.util.Scanner;

class Pattern_1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Num: ");
		int a = sc.nextInt();

		first_pattern(a);

		for(int i = 0; i<=a; i++){
			for(int j = 0; j <= i; j++){
				System.out.print((char)('A' + j));
				System.out.print("");
			}
			System.out.println();
		}		
	}
}*/


import java.util.Scanner;

class Pattern_1 {

    public static void printRow(int j) {
        if (j < 0) return;
        printRow(j - 1);
        System.out.print((char) ('A' + j) + " ");
    }

    public static void printPattern(int i, int n) {
        if (i >= n) return;
        printRow(i);
        System.out.println();
        printPattern(i + 1, n);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num: ");
        int a = sc.nextInt();
        sc.close();
        printPattern(0, a);
    }
}
