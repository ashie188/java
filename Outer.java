// Outer class
class Outer {
    private int outerVar;

    // Constructor for Outer class
    public Outer(int outerVar) {
        this.outerVar = outerVar;
    }

    // Method in Outer class
    void outerMethod() {
        System.out.println("Outer method");
    }

    // Inner class
    class Inner {
        void innerMethod() {
            System.out.println("Inner method");
            System.out.println("Outer variable: " + outerVar); // Inner class can access outer class variable
        }
    }
}

public class outer {
    public static void main(String[] args) {
        // Create an instance of Outer class
        Outer outerObject = new Outer(10);

        // Create an instance of Inner class using the outer class instance
        Outer.Inner innerObject = outerObject.new Inner();

        // Call methods of both inner and outer classes
        innerObject.innerMethod();
        outerObject.outerMethod();
    }
}
