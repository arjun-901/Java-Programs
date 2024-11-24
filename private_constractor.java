public class private_constractor {
    int a;
    int b;
    private private_constractor(){
        a=10;
        b=20;
        System.out.println(a+" "+b);
    }
 
    public static void main(String[] args) {
        private_constractor r1=new private_constractor();
      
    }
    
}
