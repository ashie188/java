public // Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Create an instance of Dog
        Dog myDog = new Dog();

        // Call methods from both classes
        myDog.eat(); // Inherited method
        myDog.bark(); // Method from Dog class
    }
}
 {
    
}
