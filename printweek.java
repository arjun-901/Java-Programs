import java.util.Scanner;

public class printweek {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:

                System.out.println("wednesday");
                break;
            // Add remaining cases for the other days of the week
            default:
                System.out.println("Invalid number. Please enter a number between 1 and 7.");
                break;
        }

        sc.close(); // Close the scanner to avoid resource leak
    }
}