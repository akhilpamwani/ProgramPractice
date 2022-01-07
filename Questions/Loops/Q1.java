// Q1: Print the Sum of First n natural Numbers



import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int s=0;
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number");
        n=sc.nextInt();
        for (int i = 0; i <=n; i++) {
            s=s+i;

            
        }
        System.out.println("Sum of Natural Number  ="+s);
        sc.close();
    }
}
