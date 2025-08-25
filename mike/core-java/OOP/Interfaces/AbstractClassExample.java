
// Abstract class demonstration
abstract class Vehicle {
    // Abstract class with an abstract method
    abstract void start();

    // Abstract class with a concrete method
    void stop() {
        System.out.println("Vehicle has stopped");
    }
}

// Concrete class Car extends Vehicle and provides implementation for start method
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car has started");
    }
}

class Motorcycle extends Vehicle {
    @Override
    void start() {
        System.out.println("Motorcycle has started");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        // Working with abstract class and its concrete subclass
        Vehicle myCar = new Car();
        myCar.start();   // Output: Car has started
        myCar.stop();    // Output: Vehicle has stopped

        Vehicle myBike = new Motorcycle();
        myBike.start();  // Output: Motorcycle has started
        myBike.stop();   // Output: Vehicle has stopped


        Car c = new Car();
        c.start(); // Output: Car has started
    }
}

