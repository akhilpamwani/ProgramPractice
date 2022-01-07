// Q:Print the Half Pyramid Patern
/** 1
 *  12
 *  123
 *  1234 
 *  12345
 * */ 
public class Q6 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n; i++) {
             // Outer Loop
            for (int j = 1; j<=i; j++) {
                 // Inner Loop
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
