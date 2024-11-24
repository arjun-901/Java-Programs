 class privateconstractor {

    int a; double b; String c;
    private privateconstractor(){

        a=20; b=30.56; c="i love my india";
        System.out.println(a+" "+b+" "+c);

    }
    public static void main(String[] args) {
        privateconstractor r=new privateconstractor();
    }
    
}
