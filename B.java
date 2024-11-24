
class B
{
    int a; String b;

     B()
    {
        a=20; b="arjun";
        System.out.println(a+" "+b);

    }
      B(B ref)
    { 
       a=ref.a;
       b=ref.b;
       System.out.println(a+" "+b);
      
    }

}
class C
{
    public static void main(String[] args) {
        
        B r=new B();
       B r3= new B(r);

    }
}