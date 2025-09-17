
@FunctionalInterface
interface I112 {				//FI with same functionality 
	void ao(int a, int b);		//with diff parameters
	//void ao(float a, float b);
	//void ao(char a, char b);
	//void ao(long a, long b);
}	

@FunctionalInterface				//Option #1: multiple FIs
interface I113 {						//wrong design, static code
	void ao(float a, float b);			//number of FIs are increased
}	

@FunctionalInterface
interface I114 {
	void ao(char a, char b);
}	

@FunctionalInterface
interface I115 {
	void ao(long a, long b);
}	


@FunctionalInterface		//Solution: generic FI
interface AO2<T> {			//with single AM with generic parameters
	void ao(T a, T b);
}	


class GenericFuncInterface{
	public static void main(String[] args) {
		AO2<Integer> 	a1 = (Integer i1, Integer i2) 	-> {System.out.println(i1 + i2);};		
		AO2<Float>		a2 = (Float i1, Float i2) 		-> {System.out.println(i1 + i2);};		
		AO2<String>		a3 = (String i1, String i2) 	-> {System.out.println(i1 + i2);};		
		
		a1.ao(10, 2);
		a2.ao(10.5F, 2.4F);
		a3.ao("H", "K");
	}
}