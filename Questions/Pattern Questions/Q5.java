// Q: Print the Inverted Half Pyramid (rotated by 180 deg)
/** 
 *      #
 *     ##
 *    ### 
 *   ####
 * ######
 *    
*/


public class Q5 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i<=n; i++) {
                // Outer Loop 
            
            for (int j = 1; j<=n-i; j++) {
                 // Spaces
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                 // Innner Loop
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
