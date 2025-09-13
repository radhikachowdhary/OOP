class SuperClass {
    int a, b;

    public void get(int x, int y) {
        a = x;
        b = y;
    }
}

// Subclass extending SuperClass
class SubClass extends SuperClass {
    int a, b;

    public void set() {
        this.a = super.a;
        this.b = super.b;
    }

    public void put() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

// Main class with main() method
public class Main {
    public static void main(String[] args) {
        SubClass ob1 = new SubClass();
        ob1.get(10, 20);
        ob1.set();
        ob1.put();
    }
}
