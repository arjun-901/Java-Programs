class A{
    int a; String b; int c;

A()
{
    a=10; b="arjun"; c=200;
}
void show()
{
    System.out.println(a+" "+b+" "+c);
}

}
class B{
    public static void main(String[] args) {
        
        A OBJ = new A();
        OBJ.show();
    }
}