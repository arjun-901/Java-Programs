class multilevel{
    //super class
    int a,b,c;
   
    void add(){
        a=40; b=20;
        c=a+b;
        System.out.println("the sum is this number"+c);
    }
    void sub(){
        a=50; b=20;
        c=a-b;
        System.out.println("the suptraction is this number"+c);
    }
    
}
class D extends multilevel{
    void mul(){
        a=2; b=20;
        c=a*b;
        System.out.println("the multiplication is this number"+c);
    }
    void div(){
        a=80; b=20;
        c=a/b;
        System.out.println("the division is this number"+c);
    }
    
    
}
class E extends D{
    void mod(){
        a=55; b=20;
        c=a%b;
        System.out.println("the mod is this number"+c);
    }
    

}
class F{
    public static void main(String[] args) {
        E r=new E();
        r.add(); r.sub(); r.mul(); r.div(); r.mod();
        
    }
}