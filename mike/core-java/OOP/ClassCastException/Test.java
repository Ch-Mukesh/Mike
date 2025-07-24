class A {
	int x = 10;
}

class B extends A {
	int y = 20;
}

class C extends B {
	int z = 30;
}

class D {
	int d = 40;
}

public class Test {
	public static void main(String[] args) {
		
		// ✅ Upcasting
		A a = new B(); // Upcasting — valid
		System.out.println(a.x); // ✅ 10
		// System.out.println(a.y); ❌ CE: y is not in class A

		// ✅ Downcasting
		B b = (B) a; // Downcasting — valid because actual object is B
		System.out.println(b.x); // ✅ 10
		System.out.println(b.y); // ✅ 20

		// 🔁 Upcasting Rules (Assignment Compatibility / Implicit Cast)
		Object o1 = new Object();
		Object o2 = new A(); // A → Object
		Object o3 = new B(); // B → Object
		Object o4 = new C(); // C → Object
		Object o5 = new D(); // D → Object

		// ❌ Compile-Time Errors
		// A a1 = new Object(); // ❌ CE
		A a2 = new A();
		A a3 = new B();
		A a4 = new C();
		// A a5 = new D(); // ❌ CE

		// ❌ Compile-Time Errors
		// B b1 = new Object(); // ❌
		// B b2 = new A();      // ❌
		B b3 = new B();
		B b4 = new C();
		// B b5 = new D();      // ❌

		// ❌ Compile-Time Errors
		// C c1 = new Object(); // ❌
		// C c2 = new A();      // ❌
		// C c3 = new B();      // ❌
		C c4 = new C();

		// 🔁 Reassigning to superclass reference
		A a41;
		a41 = new A();
		a41 = new B();
		a41 = new C();

		// ✅ Member access
		A a51 = new B();
		System.out.println(a51.x); // ✅
		// System.out.println(a51.y); // ❌ CE: y is not in A

		// 🔁 Downcasting
		A a6 = new B();
		// B b52 = a6; // ❌ CE
		B b5 = (B) a6; // ✅ Valid downcast

		// ❌ Runtime Exception (ClassCastException)
		// C c5 = (C)a6; // ❌ RE
		// D d5 = (D)a6; // ❌ CE: incompatible types
		// D d6 = (C)a6; // ❌ CE

		// ✅ Safe Downcasting using actual type
		A a7 = new C();
		B b6 = (B)a7;
		C c6 = (C)a7;
		// D d6 = (D)a7; // ❌ CE

		// ✅ Object to subclass casting
		Object obj7 = new B();
		A a71 = (A)obj7;
		B b7 = (B)obj7;
		// C c7 = (C)obj7; // ❌ RE
		// D d7 = (D)obj7; // ❌ RE

		// ✅ Safe casting with instanceof
		A a8 = new C();
		if (a8 instanceof C) {
			C c8 = (C)a8;
			System.out.println(c8.x);
			System.out.println(c8.y);
			System.out.println(c8.z);
		}

		// ❌ Invalid direct cast
		// C c9 = (B)a8;  // ❌ CE
		// C c10 = (A)a8; // ❌ CE

		// ✅ Multiple cast operators
		A a11 = new C();
		B b11 = (B)(A)(C)(B)a11; // ✅ Valid multiple casts

		// ❌ Invalid casts
		// B b12 = (C)(A)(D)(C)(B)a11; // ❌ CE: D not related
		// B b14 = (B)(A)(Object)(D)(Object)(C)(B)a11; // ❌ RE

		// 🧠 Is casting required?
		B b13 = new B();
		Object o6 = b13;           // ✅ Upcast – no cast needed
		Object o7 = (Object)b13;   // ✅ Cast is optional

		// Method Overload Resolution
		m1(b13);                           // B param
		m1((A)b13);                        // A param
		m1((Object)b13);                   // Object param
		m1((A)(B)(Object)b13);             // Object param

		// 📌 Summary
		A a21 = new B(); // Upcasting
		System.out.println(a21.x);
		// System.out.println(a21.y); // ❌ CE

		B b21 = (B)a21; // Downcasting to access y
		System.out.println(b21.x);
		System.out.println(b21.y);

		// ❌ Unsafe cast (RE)
		// C c21 = (C)a21; // ❌ RE if actual object is not C

		if (a21 instanceof C) {
			C c22 = (C)a21;
			System.out.println(c22.x);
			System.out.println(c22.y);
			System.out.println(c22.z);
		}else System.out.println("hellloooooooo");

		// instanceof operator
		A a22 = new B();
		System.out.println(a22 instanceof Object); // true
		System.out.println(a22 instanceof A);      // true
		System.out.println(a22 instanceof B);      // true
		System.out.println(a22 instanceof C);      // false
		// System.out.println(a22 instanceof D);      // false

		Object a23 = new B();
		System.out.println(a23 instanceof Object); // true
		System.out.println(a23 instanceof A);      // true
		System.out.println(a23 instanceof B);      // true
		System.out.println(a23 instanceof C);      // false
		System.out.println(a23 instanceof D);      // false

		System.out.println(a23 instanceof B); // ✅

		// ❌ Invalid syntax
		// System.out.println(B instanceof a23); // ❌ CE

		// ✅ Casting directly with object
		B b8 = (B)new C(); // ✅
		// B b9 = (B)new A(); // ❌ RE
		// B b10 = (B)new D(); // ❌ CE
		// B b111 = (B)new Object(); // ❌ RE

		// instanceof with objects
		System.out.println(new C() instanceof B); // ✅ true
		System.out.println(new A() instanceof B); // ❌ false
		// System.out.println(new D() instanceof B); // ❌ false
	}

	// 👇 Method Overloads
	static void m1(Object obj) {
		System.out.println("Object-param method is executed with obj: " + obj);
	}

	static void m1(A a1) {
		System.out.println("A-param method is executed with a1: " + a1);
	}

	static void m1(B b1) {
		System.out.println("B-param method is executed with b1: " + b1);
	}
}
