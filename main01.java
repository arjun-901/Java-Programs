 class student {
    string  name;
    int rollnumber;
    student(String name, int rollnumber){
        this.name = name;
        this.rollnumber = rollnumber;
    }
    
}
public class main01 {
    public static void main(String[] args) {
        student s =new student("alice",101);
        System.out.println("name :"+s.name+"rollnumber :");
    }
}
