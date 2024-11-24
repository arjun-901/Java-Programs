class Superkeyword {
    // int a = 10;
    void show(){
        System.out.println("my name is arjun maurya");
    }
}

class B extends Superkeyword {
    // int a = 20;

    void show() {
        super.show();

        System.out.println("i am belong to basti");
    //     // `a` refers to the `a` in class `B`
    //     System.out.println(a);
    //     // `super.a` refers to the `a` in class `Superkeyword`
    //     System.out.println(super.a);
    }
}

public class C {
    public static void main(String[] args) {
        B r = new B();
        r.show();
    }
}

