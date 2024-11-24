public class addtwonumber {
    public static void main(String[] args) {
        int [][] a={{1,2,3,},
                    {2,3,4}};
        int [][]b={{1,2,3},
                    {2,3,4}};
         int [][]result={{0,0,0},
                        {0,0,0}};
         for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i];j++){
               // System.out.format(" seting value for i=%d and j=%d",i.j);
              result[i][j]=a[i][j]+b[i][j];
              System.out.print(result[i][j]);
              
            }
         }
         System.out.print(" ");
    }
    
}
