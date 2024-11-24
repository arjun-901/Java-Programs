class SimpleInheritance { // Superclass
   int roll;
   int marks;
   String name;
   
   void displayDetails() {
       System.out.println("These are your details:");
   }
}

class arjun extends SimpleInheritance { // Subclass
   void display() {
       roll = 1;
       name = "Arjun";
       marks = 11;
       System.out.println(roll + " " + name + " " + marks);
   }
   
   public static void main(String[] args) {
       arjun r = new arjun();
       r.displayDetails();
       r.display();
   }
}
