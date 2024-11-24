class A{
    int length,width;
    A(int x,int y){
        length=x;
        width=y;
    }
    int display(){
        int area;
        area=length*width;
        return(area);
    }

    
}
class parametries_cconstractor{
    public static void main(String[] args) {
        A r1=new A(12,30);
        int area1=r1.display();
        System.out.println(area1);
    }
    
}
