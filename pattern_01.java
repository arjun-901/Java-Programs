
import java.util.Scanner;

public class pattern_01 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number for print pattern=");
        int n=sc.nextInt();
         for( int i=1;i<=n;i++)// rows
         {
            for( int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
         }
    }
    
}
