
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
       // int a=1;
       System.out.println("enter the age =");
        Scanner sc=new Scanner(System.in);
        int age = sc.nextInt();
        if(age>18)
        {
            System.out.println("your are vote");
        }
        else{
            System.out.println("your are note note");
        }
    }
    
}
