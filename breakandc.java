public class breakandc{
    public static void main(String[] args) {
        int i=0;
        for(i=0;i<10;i++)
        {
            System.out.println(i);

            if(i==7)
            {
                System.out.println("end the loop");
                continue;
            }
        }

    }
}