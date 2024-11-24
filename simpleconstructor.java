class a{
    int a; String b;
    a()
    {
        a=10;
        b="arjun";

    }
    void show()
    {
        System.out.println(a+" "+b);
    }
}
class B{
    public static void main(String[] args) {
        
        a d=new a();
        d.show();
    }
}
