class A {
    int a, b;

    // Constructor
    // default constractor
    A() {
        a = 10;
        b = 20;
    }

    // Instance method
    void display() {
        System.out.println(a + " " + b);
    }
}

class defaut_constractor{
    public static void main(String[] args) {
        // Correct object creation
        A obj = new A();

        // Calling the display method on the object
        obj.display();
    }
}