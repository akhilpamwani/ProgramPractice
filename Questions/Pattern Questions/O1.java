// Nested Loop= are the loops in which the another loop is running.

// Q1:Print the Solid Rectangle Pattern
/*** 
 *  #####
 *  #####
 *  #####
 *  #####
 **/
public class O1 { 
    public static void main(String[] args) {

        int n=5,m=4;
        // Outer Loop
        for (int i = 0; i <=n; i++) {
            // Inner Loop
            for (int j = 0; j < m; j++) {
                System.out.print("#");
            }
            System.out.println(" ");
        }
        
    }
}
