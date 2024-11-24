class h_inheritance {//super
    void input(){
        System.out.println("enter your name");
    }
}
class A extends h_inheritance{
    void show()
    {
        System.out.println("my name is arjun mauray");
    }

}
class B extends h_inheritance{
    void display(){
        System.out.println("my name is  ankush raja");
    }
}
class C{
    public static void main(String[] args) {
        
        A r= new A();
        B r2=new B();
        r.input(); r.show();
        r2.input(); r2.display();
    }
}

