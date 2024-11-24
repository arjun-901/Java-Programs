
import java.util.Scanner;

public class araeofatriangle {
    static int logic(int l, int w)
    {
       int area;
       area = l*w;
       return (area);
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int a = sc.nextInt();
        System.out.println("enter a number :");
        int b = sc.nextInt();
        
        //int a=10;
        //int b= 20;
        int c;
        c=logic(a,b);
        System.out.println(c);
        
    }
}

