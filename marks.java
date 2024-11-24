
import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        System.out.println("the student marks for cbsc board out of 100");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the math marks out of 100 = ");
        int a=sc.nextInt();
        System.out.println("enter the science marks out of 100 = ");
        int b=sc.nextInt();
        System.out.println("enter the hindi marks out of 100 = ");
        int c=sc.nextInt();
        System.out.println("enter the english marks out of 100 = ");
        int d=sc.nextInt();
        System.out.println("enter the art marks out of 100 = ");
        int e=sc.nextInt();
        int sum = a+b+c+d+e;
        System.out.println("the obtain mark is ="+sum);
        int p= (sum*100)/500;
        System.out.println("the student presentage is :"+p+"%");

    }
    
}
