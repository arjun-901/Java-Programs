class A1{

    int add(){


        int a=10; int b=20; int c;
        c=a+b;
        return c;
    }
    void add(int x,int y){
        int c;
        c=x+y;
        System.out.println(c);
    }
    void add(double x,int y){
        double c;
        c=x+y;
        System.out.println(c);
    }
    public static void main(String[] args) {
        
        A1 r=new A1();
        int add=r.add();   r.add(22,33);
        r.add(44.4,54);
        System.out.println(add);

    }
}
