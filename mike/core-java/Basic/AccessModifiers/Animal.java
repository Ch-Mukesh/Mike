// src/
// └── com/
//     └── animals/
//         ├── Animal.java          // package: com.animals
//         └── Dog.java             // package: com.animals
//     └── zoo/
//         └── Zookeeper.java       // package: com.zoo



// package com.animals;

// public class Animal {
//     public String publicName = "Public Animal";
//     protected String protectedName = "Protected Animal";
//     String defaultName = "Default Animal"; // No modifier = package-private
//     private String privateName = "Private Animal";

//     public void publicMethod() {}
//     protected void protectedMethod() {}
//     void defaultMethod() {} // package-private
//     private void privateMethod() {}
// }



// package com.animals;

// public class Dog {
//     public void testAccess() {
//         Animal a = new Animal();
//         System.out.println(a.publicName);     // ✅ public: accessible
//         System.out.println(a.protectedName);  // ✅ protected: accessible (same package)
//         System.out.println(a.defaultName);    // ✅ default: accessible (same package)
//         // System.out.println(a.privateName); // ❌ private: not accessible
//     }
// }



// package com.zoo;

// import com.animals.Animal;

// public class Zookeeper {
//     public void testAccess() {
//         Animal a = new Animal();
//         System.out.println(a.publicName);     // ✅ public: accessible
//         // System.out.println(a.protectedName); // ❌ protected: not accessible here
//         // System.out.println(a.defaultName);   // ❌ default: not accessible
//         // System.out.println(a.privateName);   // ❌ private: not accessible
//     }
// }




// src/
// └── com/
//     └── animals/
//         └── Animal.java               // Base class
//     └── zoo/
//         └── Lion.java                // Subclass of Animal



// package com.animals;

// public class Animal {
//     public String publicName = "Public Animal";
//     protected String protectedName = "Protected Animal";
//     String defaultName = "Default Animal"; // package-private
//     private String privateName = "Private Animal";

//     public void publicMethod() {}
//     protected void protectedMethod() {}
//     void defaultMethod() {}               // package-private
//     private void privateMethod() {}
// }




// package com.zoo;

// import com.animals.Animal;

// public class Lion extends Animal {
//     public void accessTest() {
//         System.out.println(publicName);        // ✅ public: accessible
//         System.out.println(protectedName);     // ✅ protected: accessible via inheritance
//         // System.out.println(defaultName);    // ❌ default: not accessible (different package)
//         // System.out.println(privateName);    // ❌ private: never accessible

//         // publicMethod();                     // ✅ public: accessible
//         // protectedMethod();                  // ✅ protected: accessible
//         // defaultMethod();                    // ❌ default: not accessible
//         // privateMethod();                    // ❌ private: not accessible
//     }
// }



// Animal a = new Animal();
// // a.protectedName; // ❌ Not allowed outside package, even in subclass if accessed via object.


// this.protectedName;  // ✅ allowed


// a.protectedName;     // ❌ NOT allowed


// | Modifier    | Same Class | Same Package | Subclass (Same Pkg) | Subclass (Diff Pkg)   | Non-Subclass (Diff Pkg) |
// | ----------- | ---------- | ------------ | ------------------- | --------------------- | ----------------------- |
// | `public`    | ✅          | ✅            | ✅                   | ✅                     | ✅                       |
// | `protected` | ✅          | ✅            | ✅                   | ✅ *(via inheritance)* | ❌                       |
// | *(default)* | ✅          | ✅            | ✅                   | ❌                     | ❌                       |
// | `private`   | ✅          | ❌            | ❌                   | ❌                     | ❌                       |
