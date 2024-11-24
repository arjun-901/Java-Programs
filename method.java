public class method {

    static int logic(int x, int y)
    {

      int z;
      if(x>y)
      {
        z=x+y;
      }
      else{
        z=(x+y)*5;

      }
      return z; 

    }
    public static void main(String[] args) {
        int a=2;
        int b= 3;
        int c;
        c=logic(a, b);
         int e=4;
         int f=3;
        int g;
        g=logic(e,f);
        System.out.println(c);
        System.out.println(g);
    }
    
}

