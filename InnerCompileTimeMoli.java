class A{
    void Dog(){
        System.out.println("the Dog is a good animal");
    }
    void Cat(){
        System.out.println("the cat is a good animal");
    }
}
// this is a program for run time polymorphis
class B extends A{
    @Override
    void Dog(){
    System.out.println("the dog is not good animal");
    }
    @Override
    void Cat(){
        System.out.println("the cat is not a good animals");
    }
}
class InnerCompileTimeMoli {
    public static void main(String[] args) {
        B r= new B();
        r.Cat();
        r.Dog();
        

    
}