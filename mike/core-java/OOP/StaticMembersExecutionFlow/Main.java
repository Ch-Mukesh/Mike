// Parent class
class Parent {
    // Static variables and methods
    static int staticVar = 10;
    static void staticMethod() {
        System.out.println("Parent static method called.");
        System.out.println("Parent static variable: " + staticVar);
    }
    
    // Non-static variables and methods
    int nonStaticVar = 20;
    
    void nonStaticMethod() {
        System.out.println("Parent non-static method called.");
        System.out.println("Parent non-static variable: " + nonStaticVar);
    }

    // Constructor
    Parent() {
        System.out.println("Parent Constructor called.");
        staticVar = 30; // Static variables can be accessed in constructor
        nonStaticVar = 40; // Non-static variables can also be accessed here
    }
}

// Child class
class Child extends Parent {
    // Static variables and methods
    static int staticVar = 50;
    static void staticMethod() {
        System.out.println("Child static method called.");
        System.out.println("Child static variable: " + staticVar);
    }
    
    // Non-static variables and methods
    int nonStaticVar = 60;
    
    void nonStaticMethod() {
        System.out.println("Child non-static method called.");
        System.out.println("Child non-static variable: " + nonStaticVar);
    }

    // Constructor
    Child() {
        // super(); // Calls Parent constructor
        System.out.println("Child Constructor called.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Static method calls
        System.out.println("Calling static method of Parent:");
        Parent.staticMethod(); // Parent's static method
        
        System.out.println("\nCalling static method of Child:");
        Child.staticMethod(); // Child's static method
        
        // Non-static method calls (via objects)
        System.out.println("\nCreating Parent object:");
        Parent parentObj = new Parent(); // Creates Parent object
        
        System.out.println("\nCreating Child object:");
        Child childObj = new Child(); // Creates Child object

        parentObj.nonStaticMethod(); // Parent's non-static method
        childObj.nonStaticMethod();  // Child's non-static method
        
        // Accessing static variables (via class name and instance)
        System.out.println("\nAccessing static variables via class names:");
        System.out.println("Parent staticVar: " + Parent.staticVar);
        System.out.println("Child staticVar: " + Child.staticVar);

        // Accessing non-static variables (via instance)
        System.out.println("\nAccessing non-static variables via objects:");
        System.out.println("Parent nonStaticVar: " + parentObj.nonStaticVar);
        System.out.println("Child nonStaticVar: " + childObj.nonStaticVar);
    }
}
