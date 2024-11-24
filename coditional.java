
import java.util.Scanner;

public class coditional{
    public static void main(String[] args) {
        System.out.println("------------------the marks of student----------------------");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter math marks =");
        int math=sc.nextInt();
        System.out.println("enter english marks =");
        int english =sc.nextInt();
        System.out.println("enter hindi marks =");
        int hindi =sc.nextInt();
        int sum=math+english+hindi;
        System.out.println("sum is all subject"+sum);
        int p=(sum*100)/300;
        System.out.println("the pracentage is :"+p);
        if(p>=44 && math>=33 && english>=33 && hindi>=33)
        {
            System.out.println("coratulation you are pramoted");

        }
        else{
            System.out.println("faild!");
        }

    }
}
