// import java.util.Scanner;

// public class ifelsesprograms {
//     public static void main(String[] args) {
//         Scanner.sc = new Scanner(System.in);
//         System.out.println("enter the a=");
//         int a=sc.nextInt();
//         System.out.println("enter the b=");
//         int b=sc.nextInt();
//         if(a>b){
//             System.out.println("a is greater");
//         }
//         else{
//             System.out.println("b is greater");
//         }
//     }
    
// }
import java.util.Scanner;

public class IfElsePrograms {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        
        // Compare a and b
        if (a > b) {
            System.out.println("a is greater");
        } else if (b > a) {
            System.out.println("b is greater");
        } else {
            System.out.println("a and b are equal");
        }
        
        // Close the scanner
        sc.close();
    }
}

