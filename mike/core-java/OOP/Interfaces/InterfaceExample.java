// Defining an interface Animal
interface Animal {
    // Constants in interface are implicitly public static final
    int MAX_AGE = 100; // This is a constant that cannot be modified
    // int MIN_AGE; // This leads to compile time error

    // Abstract method (no body), classes implementing this interface must provide an implementation
    void sound();

    // Default method with an implementation, available to all implementing classes
    default void sleep() {
        System.out.println("Animal is sleeping");
    }

    // Static method, accessible through the interface itself, not inherited by implementing classes
    static void showInfo() {
        System.out.println("This is an Animal interface");
    }

    // Private method (Java 9+), only used internally within the interface
    private static void privateHelper() {
        System.out.println("This is a private helper method inside the interface");
    }

    // Default method can call private methods (as they belong to the interface)
    default void usePrivateHelper() {
        privateHelper();
    }
}

// Defining another interface Movable, which demonstrates multiple inheritance in interfaces
interface Movable {
    // Abstract method to be implemented by any class that implements this interface
    void move();
}

// Defining an abstract class that implements the Animal interface and provides some implementation
abstract class AnimalImpl implements Animal {
    // Abstract class can have both abstract and concrete methods
    void eat() {
        System.out.println("Animal is eating");
    }
    
    // Abstract class can implement some methods from the interface
    // but must still provide abstract methods for others to implement
}

// Concrete class Dog extends the abstract class AnimalImpl and implements Animal
class Dog extends AnimalImpl implements Movable {
    @Override
    public void sound() {
        // Implementing the abstract method from Animal interface
        System.out.println("Dog barks");
    }

    @Override
    public void move() {
        // Implementing the abstract method from Movable interface
        System.out.println("Dog is running");
    }

    // Optionally, overriding the default sleep method
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}

// Another concrete class that implements both Animal and Movable interfaces
class Cat implements Animal, Movable {
    @Override
    public void sound() {
        // Implementing the abstract method from Animal interface
        System.out.println("Cat meows");
    }

    @Override
    public void move() {
        // Implementing the abstract method from Movable interface
        System.out.println("Cat is walking");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        // Demonstrating Interface implementation with Dog class
        Dog dog = new Dog();
        dog.sound();        // Output: Dog barks
        dog.move();         // Output: Dog is running
        dog.sleep();        // Output: Dog is sleeping
        dog.eat();          // Output: Animal is eating
        dog.usePrivateHelper(); // Calling the default method which uses the private method

        // Showing static method from the interface
        Animal.showInfo();  // Output: This is an Animal interface

        // Demonstrating Interface implementation with Cat class
        Cat cat = new Cat();
        cat.sound();        // Output: Cat meows
        cat.move();         // Output: Cat is walking
        cat.sleep();        // Output: Animal is sleeping (default method from interface)

        // Showing that interface constants are accessible from implementing classes
        System.out.println("Max age of Animal: " + Animal.MAX_AGE);  // Output: Max age of Animal: 100

        // Uncommenting the below line will give a compile-time error because Animal interface cannot be instantiated directly
        // Animal a = new Animal(); // Error: Animal is abstract; cannot be instantiated
    }
}

