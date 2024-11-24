public class arrayif {
    public static void main(String[] args) {
        int []a={2,3,4,5,6,7,8,9};
        int num=10;
        boolean isin=false;
        for(int element:a)
        {
            if(num==element){
                isin=true;
                break;
            }


        }
        if(isin){
            System.out.println("the element present in the array");
        }
        else{
            System.out.println("the element is not present in the array");
        }
    }
    
}
