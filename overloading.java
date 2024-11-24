 class Rectangle {
    int length;
    int width;

     Rectangle() {
        length = 0;
        width = 0;
    }
    
    Rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    
}
public class overloading{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
         Rectangle r2= new Rectangle();
         System.out.println("rectangle 1 :length"+r1.length+"width"+r1.width);
         System.out.println("rectangle 2 :length"+r2.length+"width"+r2.width);
    }    
}
