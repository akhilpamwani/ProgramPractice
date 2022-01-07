// Q2: Print the table of a number input by the user

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println("Printing the Table of Number That user had given " + (n * i));

        }
        sc.close();

    }
}
