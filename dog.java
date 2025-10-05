public class Dog {
    // Instance variables
    private String name;
    private int age;
    private String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    // Method to make the dog bark
    public void bark() {
        System.out.println(name + " says: Woof! Woof!");
    }

    // Method to get the name of the dog
    public String getName() {
        return name;
    }

    // Method to set the name of the dog
    public void setName(String name) {
        this.name = name;
    }

    // Method to get the age of the dog
    public int getAge() {
        return age;
    }

    // Method to set the age of the dog
    public void setAge(int age) {
        this.age = age;
    }

    // Method to get the breed of the dog
    public String getBreed() {
        return breed;
    }

    // Method to set the breed of the dog
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a Dog object
        Dog myDog = new Dog("Buddy", 3, "Labrador");

        // Call the bark method
        myDog.bark();

        // Get and print dog's name, age, and breed
        System.out.println("Name: " + myDog.getName());
        System.out.println("Age: " + myDog.getAge());
        System.out.println("Breed: " + myDog.getBreed());
    }
}
