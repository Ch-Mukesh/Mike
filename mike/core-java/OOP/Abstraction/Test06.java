abstract class D {
	//private abstract void m1();   ❌ illegal (private means "hidden", abstract means "must override")
	abstract void m2();            // ✅ (default abstract)
	protected abstract void m3();  // ✅
	public abstract void m4();     // ✅

	//static abstract void m5();    ❌ conflict (static method belongs to class, abstract needs overriding)
	//final abstract void m5();     ❌ conflict (final = cannot override, abstract = must override)
	//native abstract void m5();    ❌ conflict (native = implemented in C, abstract = no implementation)
	//transient abstract void m5(); ❌ not allowed
	//volatile abstract void m5();  ❌ not allowed
	//synchronized abstract void m5(); ❌ not allowed
	//strictfp abstract void m5();  ❌ not allowed

	abstract int m6();             // ✅ return int
	abstract int[] m7();           // ✅ return int[]
	abstract String m8();          // ✅ return String

	abstract void m9(int i);       // ✅ with param
	abstract void m10(int[] i);    // ✅ array param
	abstract void m11(String i);   // ✅ String param

	abstract void m12() throws IllegalArgumentException; // ✅ abstract method with exception
	abstract int m13(int i) throws Exception;            // ✅ with return + checked exception
};


abstract class A{ }	               // pri, def, prot, pub  // st, fi, ab, na, tr, vo, sy, sfp // interface
public abstract class Test06{ }   // default, public, final, abstract, strictfp
//final abstract class B{ }	       // ❌ illegal (final + abstract = conflict)
//abstract abstract class C{ }	   // ❌ redundant
//strictfp abstract class C{ }     // ✅ allowed (abstract + strictfp)



abstract class Example { 
	private Example(){}
}

// class Sample extends Example {  }//This part is showing a special case:
									// Example is abstract (so it can’t be instantiated).
									// Its constructor is private (so subclasses can’t call super()).
									// If you uncomment class Sample extends Example {}, it will not compile, because Sample cannot call Example’s private constructor.
