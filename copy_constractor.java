class A{
    int a,b;
    A(){
        a=20;
        b=30;
        System.out.println(a+" "+b);

    }
    A(A ref){
        a=ref.a;
        b=ref.b;
        System.out.println(a+" "+b);


    }


}
public class copy_constractor {
    public static void main(String[] args) {
        A r1=new A();
        A r2=new A(r1);


        
    }
    
}
