class Oddnumber{
    public static void main(String[]args)
    {
        System.out.println("the odd number are");
        int sum=0,count=0;
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                
                 count++;
                 sum=sum+i;

                System.out.println(i);
            }
          
            
        }
        System.out.println(" the sum of odd number ="+" "+sum);
        System.out.println("the total numbers of "+" "+ count);


    }
}