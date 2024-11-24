
// import java.util.Scanner;

// public class forloop {
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.println("enter the number=");
//         int n=sc.nextInt();
//         for(int i;i<=n;i++){
//             for(int j;j<=i;j++){
//                 System.out.println("x");

//             }
//             System.out.println("\n");

//         }
//     }
    
// }
import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        // Outer loop for the number of rows
        for (int i = n; i >= 1; i--) {
            // Inner loop for printing 'x' characters
            for (int j=1; j <= i; j++) {
                System.out.print("x ");
            }
            // Move to the next line after each row
                System.out.print("\n");
        }

        // Close the scanner
        sc.close();
    }
}
