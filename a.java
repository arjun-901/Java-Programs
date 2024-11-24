class A{
      
    int x; int y;
    A(int a, int b)
    {
       x=a; y=b;
    }
    A(int a, String b)
    {
        System.out.println(a+" "+b);
    }
    A(String l,int m)
    {
        System.out.println(l+" "+m);
    }
    void show()
    {
        System.out.println(x+" "+y);
    }
}
class w{
    public static void main(String[] args) {
        
        A obj=new A(10,20);
        obj.show();
        A obje = new A(30,"arjun");
        A r =new A("maurya",60);        
    }
}