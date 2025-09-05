
public class Test01_StringOperations {
	public static void main(String[] args) {
		
	//========================= String literal ======================================================
		//System.out.println(hari);  //it is not a string, its a word, represents variable name
		System.out.println("hari");  //Now it is a string or a string literal
		String	str1 = "hari";  	//object, which is an instance of j.l.String class
		String	str2 = "hari@1";  	//object, which is an instance of j.l.String class
		
	//========================== #1: Checking characters in string =====================================================
		
		String s1 = "";		//empty string
		String s2 = " ";	//blank string
		String s3 = "  ";	//blank string
		String s4 = "abc";	//characters string
		
		System.out.println(s1.isEmpty() + " "  + s1.isBlank() + " " + s1.length());
		System.out.println(s2.isEmpty() + " "  + s2.isBlank() + " " + s2.length());
		System.out.println(s3.isEmpty() + " "  + s3.isBlank() + " " + s3.length());
		System.out.println(s4.isEmpty() + " "  + s4.isBlank() + " " + s4.length());
		System.out.println();
		
	//============================ #2: Comparing String ======================================================	
		
		//hash code number formula for the given string is
			//s[0]*31^(n-1) + s[1]*31^(n-2) + ......
		s1 = "";
		s2 = "a";
		s3 = "A";
		s4 = "0";
		System.out.println(s1.hashCode());  
		System.out.println(s2.hashCode()); //'a'*31^(1-1) -> 'a'*1 -> 97*1 -> 97
		System.out.println(s3.hashCode()); //'A'*31^(1-1) -> 'A'*1 -> 65*1 -> 65
		System.out.println(s4.hashCode()); //'0'*31^(1-1) -> '0'*1 -> 48*1 -> 48
		
		s1 = "ab";
		System.out.println(s1.hashCode()); 	//'a'*31^(2-1) + 'b'*31^(2-2) 
											//'a'*31^1     + 'b'*31^0  	
											//97*31        + 98*1  	
											//97*31        + 98*1  	
											//3007		   + 98
											//3105
		System.out.println();
		
		//comparing string by reference
		s1 = "a";
		s2 = "a";
		s3 = "A";
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println();
		
		s1 = new String("a");
		s2 = new String("a");
		s3 = new String("A");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println();

		//comparing string objects with their content
		s1 = new String("a");
		s2 = new String("a");
		s3 = new String("A");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		//comparing string objects with their content without case
		s1 = new String("a");
		s2 = new String("a");
		s3 = new String("A");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		//comparing string objects lexicographically (finding the difference)
		s1 = "a";
		s2 = "b";
		System.out.println(s1.compareTo(s2));
		
		s1 = "ab";
		s2 = "ac";
		System.out.println(s1.compareTo(s2));
		
		s1 = "ab";
		s2 = "ab";
		System.out.println(s1.compareTo(s2));
		
		s1 = "abc";
		s2 = "acf";
		System.out.println(s1.compareTo(s2));
		
		s1 = "abc";
		s2 = "abcdef";
		System.out.println(s1.compareTo(s2));
		
		s1 = "Abc";
		s2 = "abc";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println();
		//============== searching substring =======================================
		
		s1 = "java hari krishna";
		System.out.println(s1.contains("hari"));
		System.out.println(s1.contains("krish"));
		System.out.println(s1.contains("avaj"));
		System.out.println(s1.contains("Java"));
		//System.out.println(s1.containsIgnoreCase("Java"));
		
		System.out.println(s1.startsWith("java"));
		System.out.println(s1.startsWith("hari"));
		
		System.out.println(s1.endsWith("na"));
		System.out.println(s1.endsWith("krishna"));
		System.out.println(s1.endsWith("java"));

		System.out.println(s1.startsWith("java hari krishna"));
		System.out.println(s1.endsWith("java hari krishna"));
		System.out.println();
		//======================= retrieving index of substring or char ====================================
		s1 = "java hari krishna, hari java krishna";
		System.out.println(s1.contains("hari"));
		System.out.println(s1.indexOf("hari"));
		System.out.println(s1.lastIndexOf("hari"));

		System.out.println(s1.indexOf("Hari"));
		
		System.out.println(s1.indexOf("j"));
		System.out.println(s1.indexOf("j", 1));
		System.out.println();
	//=============================retrieving characters from this string =====================================================
	//        0123456789-------	
		s1 = "Java Hari Krishna";	//rule is index>=0 && <length()
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(5));
		//System.out.println(s1.charAt(25));
		//System.out.println(s1.charAt(-1));
		System.out.println(s1.length());
		//System.out.println(s1.charAt(17));
		System.out.println(s1.charAt(16));
	}
}