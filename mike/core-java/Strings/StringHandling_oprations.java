import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * What is the meaning of String handling?
 * 		- Performing different operations on String object is called String handling
 * 		- String class provides several methods to perform different operations on String object
 * 
 * String class methods?
 * 		1. public boolean 	isEmpty()		[6v]	//=>s.length()==0
 * 		2. public boolean 	isBlank()		[11v]	//=>s.trim().isEmpty()
 * 		3. public int 		legnth()
 * 
 * 		4. public String 	toString()			//overridden from Object class
 *      5. public int 		hashCode()    		//overridden from Object class
 *      6. public boolean 	equals(Object obj)	//overridden from Object class
 *      7. public boolean 	equalsIgnoreCase(String s)      
 * 
 * 		8. public int 		compareTo(String s)
 * 		9. public int 		compareToIgnoreCase(String s)
 * 
 * 		10. public boolean 	contentEquals(StringBuffer sb)	[1.4v]
 * 		    public boolean 	contentEquals(CharSequqence cs)	[5v]
 * 
 * 		11. public boolean  contains(String s)
 *          public boolean  matches(String regex)
 * 		12. public boolean  startsWith(String s)
 * 		13. public boolean  endsWith(String s)
 * 
 * 		14. public int		indexOf(int ch)
 * 		    public int		indexOf(String s)
 * 		    public int		indexOf(int ch, int fromIndex)
 * 		    public int		indexOf(String s, int fromIndex)
 * 
 * 		15. public int		lastIndexOf(int ch)
 * 		    public int		lastIndexOf(String s)
 * 		    public int		lastIndexOf(int ch, int fromIndex)
 * 		    public int		lastIndexOf(String s, int fromIndex)
 * 
 * 		16. public char		charAt(int index) throws SIOOBE
 * 		
 * 		17. public String   substring(int start) throws SIOOBE
 * 		    public String   substring(int start, int end) throws SIOOBE
 * 		    public CharSequence  subSequence(int start, int end) throws SIOOBE
 * 
 * 		18. public String[] split(String regex)
 * 				https://www.vogella.com/tutorials/JavaRegularExpressions/article.html
 * 
 * 		19. public char[] toCharArray()
 * 		20. public byte[] getBytes()
 * 		21. public static String valueOf(PDT/Object/char[]) (9 overloaded forms)
 *  	
 *  	22. public String concat(String s)
 *  	23. public static String join(String delimiter, String... strings)
 *  
 *  	24. public String toUpperCase()
 *  	    public String toLowerCase()
 *  
 *  	25. public String replace(char oldChar, char newChar)
 *  	    public String replace(String oldString, String newString)
 *  	    public String replaceAll(String regex, String newString)
 *  	    public String replaceFirst(String regex, String newString)
 *  
 *  	26. public String trim()
 *  		public String strip()
 *  		public String stripLeading()
 *  		public String stripTrailing()
 *  
 *  	27. Java 15v [Text blocks] -> https://openjdk.org/jeps/378
 *  		 In Java, a string literal can be represented in two
 *  		 	1. by using double " 
 *  			2. by using triple " [from Java 15v onwards, actually introduced in Java 13v]
 *  	
 *  		double " for one line string
 *  		triple " for multiple lines string
 *  
 *      28. public Stream<String> lines()		[11v]
 *      
 *      29. public IntStream      chars()
 *      30. public String         indent(int count)
 *      31. public String         repeat(int count)
 *      
 *      32. public String 		  intern()
 *  
 */

public class Test04_StringHandling_methods {
	public static void main(String[] args) {
		
		String s1 = ""; 	
		String s2 = " ";	
		String s3 = "\0";
		String s4 = "a";

//#1: finding empty or not
		System.out.println(s1.isEmpty() + " " + s2.isEmpty() + " " + s3.isEmpty() + " " + s4.isEmpty());
		
//#2: finding is blank or not [either empty or spaces or \t or \s]		
		System.out.println(s1.isBlank() + " " + s2.isBlank() + " " + s3.isBlank() + " " + s4.isBlank());
		//isEmpty() -> only empty(no characters) string
		//isBlank() ->  either empty/space(1-n)

		//for null character (\0 ror \u0000) 
		//both isEmpty() and isBlank() consider as
		//non-empty string returns false 
		
		
//#3: finding the length of the string		
		System.out.println(s1.length() + " " + s2.length() + " " + s3.length() );
		
		String[] sa = {"a", "b", "c"};
		System.out.println(sa.length);
		//System.out.println(sa.length()); //CE

		//System.out.println(s1.length); //CE
		System.out.println(s1.length()); 

		//System.out.println(sa[0].length); //CE
		System.out.println(sa[0].length()); 
		
//#4: printing String object content [toString() is overridden in String class]
		System.out.println(s1);	//""		
		System.out.println(s2);	//" "
		System.out.println(s3);	//"a"
		System.out.println(s4);	//"a"
				
//#5: retrieving hash code of String object
		System.out.println(s1.hashCode());	
		System.out.println(s2.hashCode());	
		System.out.println(s3.hashCode());	
		System.out.println(s4.hashCode());	
		
		s4 = "abc";			//s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]		
		System.out.println(s4.hashCode()); 	//96354
			// s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
			// 'a'*31^(n-1) + 'b'*31^(n-2) + 'c'*31^(n-3)
			// 97*31^(n-1) + 98*31^(n-2) + 99*31^(n-3)
			// 97*31^(3-1) + 98*31^(3-2) + 99*31^(3-3)
			// 97*31^(2) + 98*31^(1) + 99*31^(0)
			// 97*31*31 + 98*31 + 99*1
			//System.out.println(97*31*31 + 98*31 + 99*1);  //96354
		System.out.println();
		
//#6: comparing two strings for their equality
		//#1: by using == operator 		=> compares reference of the objects
		//#2: by using equals()	method	=> compares data of the String objects by case   
		//#3: by using equalsIgnoreCase()=> compares data of the String objects by ignoring case	
		s1 = "hkprogrammingworld";
		s2 = "hkprogrammingworld";
		s3 = "HKPROGRAMMINGWORLD";
		s4 = "hkProgrammingworld";
		
		System.out.println(s1 == s2);		//to know both ref vars 
		System.out.println(s1 == s3);		//are holding same object or not 
		System.out.println(s1 == s4);
		
		System.out.println(s1.equals(s2));		//for password comparison
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
//#7: Comparing two string objects with their content for equality without considering case
		System.out.println(s1.equalsIgnoreCase(s2)); //for user name comparison
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println();

//#8: Comparing two string objects with their content lexicographically, 
	//means finding their difference (return -ve or 0 or +ve)
		s1 = "a";
		s2 = "a";				//for sorting strings in array or in collection
		s3 = "b";
		s4 = "A";
		
		System.out.println(s1.compareTo(s2)); //0
		System.out.println(s1.compareTo(s3)); //-1
		System.out.println(s1.compareTo(s4)); //32
		
//#9: Comparing two string objects with their content lexicographically without considering case
		System.out.println(s1.compareToIgnoreCase(s4)); //32
		System.out.println();
		
//#10: Comparing String object content with StringBuffer object content
		StringBuffer sb1 = new StringBuffer("a");
		System.out.println(s1.equals(sb1));
		System.out.println(s1.contentEquals(sb1));
		System.out.println(s4.contentEquals(sb1));
		//System.out.println(s4.contentEqualsIngnoreCase(sb1));
		System.out.println(s4.toLowerCase().contentEquals(sb1));
		
		//Comparing String object content with StringBuilder object content
		StringBuilder sb2 = new StringBuilder("b");
		System.out.println(s3.contentEquals(sb2));
		
		//System.out.println(sb1.contentEquals(s1));
		//System.out.println(sb2.contentEquals(s1));
		System.out.println(s1.contentEquals(s2));
		System.out.println();
		
//#11: Searching the given argument String available in this string or not		
		s1 = "abc bbc cbe";
		System.out.println(s1.contains("a"));
		System.out.println(s1.contains("A"));
		System.out.println(s1.contains("b"));
		System.out.println(s1.contains("abc"));
		System.out.println(s1.contains("cbe"));
		System.out.println();

//#12: Checking whether this String object starts with the argument string or not		
		System.out.println(s1.startsWith("a"));
		System.out.println(s1.startsWith("A"));
		System.out.println(s1.startsWith("b"));
		System.out.println(s1.startsWith("c"));
		System.out.println(s1.startsWith("abc"));
		System.out.println(s1.startsWith("cbe"));
		System.out.println();
		
//#13: Checking whether this String object ends with the argument string or not				
		System.out.println(s1.endsWith("a"));
		System.out.println(s1.endsWith("A"));
		System.out.println(s1.endsWith("c"));
		System.out.println(s1.endsWith("C"));
		System.out.println(s1.endsWith("cbe"));
		System.out.println(s1.endsWith("ebc"));
		System.out.println();
		
//#14: Searching for given substring and returning its first occurrence index
		//    0123456789....... 
		s1 = "Java Hari Krishna. Hari Hari teaches FSJD. Hari has 20+ yrs exp";
		System.out.println(s1.equals("Hari"));
		System.out.println(s1.contains("Hari"));
		System.out.println(s1.indexOf("Hari"));
		System.out.println(s1.indexOf("hari"));
		System.out.println(s1.indexOf("Hari", 6));
		
//#15: Searching for given substring and returning its last occurrence index
		System.out.println(s1.lastIndexOf("Hari"));
		System.out.println(s1.lastIndexOf("Hari", 42));
		System.out.println();
		
//16: Retrieving each character from this string object [index>=0 && <length()]
		//    012345678910.....
		s1 = "Java Hari Krishna";
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(6));
		System.out.println(s1.charAt(11));
		//System.out.println(s1.charAt(-1)); //RE: SIOOBE
		//System.out.println(s1.charAt(17)); //RE: SIOOBE
		System.out.println();
		
		//for(int i=0; i<s1.length(); i++) {		//all characters
		//for(int i=0; i<=s1.length(); i++) {		//all characters + SIOOBE
		//for(int i=0; i<=s1.length()-1; i++) {		//all characters
		for(int i=0; i<s1.length()-1; i++) {		//all characters-1
			System.out.println(s1.charAt(i));
		}
		System.out.println();

//17# Retrieving substring from this string		
		System.out.println(s1.substring(0));
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(1));
		
		System.out.println(s1.substring(0,3));
		System.out.println(s1.substring(0,4));
		System.out.println();
		
//18: Splitting the current string into tokens on the given delimiter
		s1 = "abc bbc cbc";
		String[] tokens = s1.split(" "); //regex -> regular expression
		System.out.println(tokens[0]);
		System.out.println(tokens[1]);
		System.out.println(tokens[2]);
		
		System.out.println(Arrays.toString(tokens));
		
		tokens = s1.split("c");
		System.out.println(Arrays.toString(tokens));
		
		s1 = "1@b#2a%7*c!p6e";
		System.out.println(s1);
		tokens = s1.split("abc");
		System.out.println(Arrays.toString(tokens));

		tokens = s1.split("[abc]"); //regex
		System.out.println(Arrays.toString(tokens));

		tokens = s1.split("[a-z]"); //regex
		System.out.println(Arrays.toString(tokens));
		
		tokens = s1.split("[a-d[m-p]]"); //regex
		System.out.println(Arrays.toString(tokens));
		
		tokens = s1.split("[a-dm-p]"); //regex
		System.out.println(Arrays.toString(tokens));
		
		s1 = "abc123";
		System.out.println(Arrays.toString(s1.split(".")));
	
		s1 = "abc";
		System.out.println(Arrays.toString(s1.split("a")));

		s1 = "abc";
		System.out.println(Arrays.toString(s1.split("c")));
		
		s1 = "abc";
		System.out.println(Arrays.toString(s1.split("abc")));
		
//19# Converting String into char[]
		char[] ch = s1.toCharArray();
		System.out.println(Arrays.toString(ch));

//20# Converting String into byte[]
		byte[] ba = s1.getBytes();
		System.out.println(Arrays.toString(ba));
		
//21# Converting Primitive Values and object to String
		String stringIntValue = String.valueOf(50);
		System.out.println(stringIntValue);
		System.out.println();
		
//22#: concatenating Strings
		s1 = "Java";
		s1.concat("Hari");
		System.out.println(s1); //Java
		System.out.println();
		
		s2 = s1.concat("Hari");
		System.out.println(s1);
		System.out.println(s2);
		
		s1 = s1.concat("Hari");
		System.out.println(s1);
		
		s3 = s1.concat("Krishna");
		System.out.println(s1);
		System.out.println(s3);
		
		s4 = s1.concat(""); //current string object data is not changed
		System.out.println(s1 == s4);	//true	

		s4 = s1.concat(" "); //current string object data is changed
		System.out.println(s1 == s4);	//false	
		System.out.println();
		
		String fullName;
		
		String fn = "Hari";
		String sn = "Krishna";
		String srn = "Java";
		
		fullName = fn + sn + srn;				System.out.println(fullName);
		fullName = fn.concat(sn).concat(srn);	System.out.println(fullName);
		
		fullName = fn +" "+ sn +" "+ srn;		System.out.println(fullName);
		fullName = fn.concat(" ").concat(sn).concat(" ").concat(srn);	System.out.println(fullName);

		fullName = String.join(" ", fn, sn, srn); System.out.println(fullName); 
		fullName = String.join(",", fn, sn, srn); System.out.println(fullName); 
		fullName = String.join("_", fn, sn, srn); System.out.println(fullName); 
		fullName = String.join("*", fn, sn, srn); System.out.println(fullName); 
		fullName = String.join("", fn, sn, srn); System.out.println(fullName); 
		
		System.out.println();
		
//23# converting characters case to upper case and lower case
		
		s1 = "javaharikrishna";
		s1.toUpperCase();
		System.out.println(s1); 
		
		s2 = s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s2);
		
		s1 = s1.toUpperCase();
		System.out.println(s1);
		System.out.println();
	//==================================	
		s1.toLowerCase();
		System.out.println(s1);
		
		s2 = s1.toLowerCase();
		System.out.println(s1);
		System.out.println(s2);
		
		s1 = s1.toLowerCase();
		System.out.println(s1);
	//==================================	
		s2 = s1.toLowerCase();
		System.out.println(s1 == s2);

		s1 = s1.toUpperCase();
		s2 = s1.toUpperCase();
		System.out.println(s1 == s2);
	//==================================	
		s1 = "1@2";
		s2 = s1.toLowerCase();
		s3 = s1.toUpperCase();
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println();
		
//#24: removing leading and trailing spaces in this string
		s1 = " abc bbc cbc   ";
		s2 = s1.trim();
		
		System.out.println(s1.length() + "->" + s1 +".");
		System.out.println(s2.length() + "->" + s2 +".");

		s3 = s1.replace(" ", "");
		System.out.println(s3.length() + "->" + s3 +".");
		
		s2 = s1.trim();
		s3 = s1.strip();										//11
		System.out.println(s2.length() + "->" + s2 +".");
		System.out.println(s3.length() + "->" + s3 +".");
		
		s3 = s1.stripLeading();
		System.out.println(s1.length() + "->" + s1 +".");
		System.out.println(s3.length() + "->" + s3 +".");
		System.out.println();

		s3 = s1.stripTrailing();
		System.out.println(s1.length() + "->" + s1 +".");
		System.out.println(s3.length() + "->" + s3 +".");
		System.out.println();
		
//24# replacing character(s) in this string
		s1 = "abc 123 cbc";

		System.out.println(s1);
		s1.replace('b', 'x');
		System.out.println(s1);
		
		s2 = s1.replace('b', 'x');
		System.out.println(s1);
		System.out.println(s2);

		s1 = s1.replace('b', 'x');
		System.out.println(s1);

		//=================================
		s1 = "abc 123 cbc abc xyz";

		System.out.println(s1);
		s2 = s1.replace("abc", "pqr");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		//=================================
		
		System.out.println(s1);
		s2 = s1.replaceAll("abc", "mno");
		System.out.println(s1);
		System.out.println(s2);

		System.out.println(s1);
		s2 = s1.replaceAll("[abc]", "mno");
		System.out.println(s1);
		System.out.println(s2);

		System.out.println(s1);
		s2 = s1.replaceAll("[0-9]", "mno");
		System.out.println(s1);
		System.out.println(s2);
		//========================================
		System.out.println(s1);
		s2 = s1.replaceFirst("abc", "mno");
		System.out.println(s1);
		System.out.println(s2);

		System.out.println(s1);
		s2 = s1.replaceFirst("[abc]", "mno");
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1);
		s2 = s1.replaceFirst("[0-9]", "mno");
		System.out.println(s1);
		System.out.println(s2);
	//================================================
		s1 = "   abc bbc cbc  ";
		System.out.println("==========");
		System.out.println(s1.length());
		s1.trim();
		System.out.println(s1.length());
		
		s2 = s1.trim();
		System.out.println(s1.length());
		System.out.println(s2.length());

		s1 = s1.trim();
		System.out.println(s1.length());

		System.out.println("==========\n");
	//================================================
		s1 = "\u0000 \0  abc bbc cbc  \u0020 \s";
		System.out.println(s1.length());
//		s1.strip();
//		System.out.println(s1.length());
		s2 = s1.strip();
		System.out.println(s1.length());
		System.out.println(s2.length());

		s2 = s1.trim();
		System.out.println(s1.length());
		System.out.println(s2.length());
//		
//		System.out.println("==========");
		
		//trim() -> removes L&T space characters and null characters(\0 or \u0000)

		//strip() -> removes only L&T space characters, can not remove null characters(\0 or \u0000) 
		//           the space character we can place either 
		//				1. directly by pressing space bar on keyboard or 
		//				2. by using esc seq characters \s
		//				3. by using UNICODE character \u0020
		
		//both methods does not remove middle spaces
		
		//================================================	
		s1 = "   Hari Krishna  ";
		System.out.println(s1.length());

		s2 = s1.stripLeading();
		System.out.println(s2.length());

		s2 = s1.stripTrailing();
		System.out.println(s2.length());
		System.out.println();
		//================================================	
		
		s1 = "  \0   NiT \u0000  \s";
		System.out.println(s1.length());

		s2 = s1.trim();
		System.out.println(s2.length());

		s2 = s1.strip();
		System.out.println(s2.length());
		
		s2 = s1.stripLeading();
		System.out.println(s2.length());

		s2 = s1.stripTrailing();
		System.out.println(s2.length());
		
	//================================================	
		//s1 = 'abc'; //CE:
		
		s1 = "abc";			//for one line string use " "
							//for multiple lines string use triples "
		s2 =
			"""  					
			abc	
			bbc
			cbc	
			""";
					//we call this triple quote a Text Blocks
		
		s1 = "SELECT * FROM employee WHERE eno=101";	

		s2 = 
			"SELECT * "			+ 
			"FROM employee "	+
			"WHERE eno=101 " 	+
			"AND ename = 'HK' ";

		s2 = 
			"""
			SELECT *
			FROM   employee
			WHERE  eno = 101
			AND    ename = 'HK'	
			""";	

		s2 = 
			"""
			<HTML>
			
			  <HEAD>
				  <TITLE>Text Blocks</TITLE>
			  </HEAD>
			  
			  <BODY>
				  <H1> 
				  I, Text Block, made multi-line String easy to write and read.
			  </BODY>
			  
			</HTML>	
			""";	

		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		
		Stream<String> lines = s2.lines();						//11v
		lines.forEach(line -> System.out.println(line));
		
		s1 = "abc";
		IntStream chars = s1.chars();							//9v
		chars.forEach(System.out::print);
		System.out.println();
		
		 s3 = s1.indent(3);										//12
		 System.out.println(s1);
		 System.out.println(s3);
		 	System.out.println();
		 	
		 s3 = s2.indent(3);										//12
		 System.out.println(s2);
		 System.out.println(s3);
		 
		 String repeat = s1.repeat(3);							//11
		 System.out.println(s1);
		 System.out.println(repeat);
		 System.out.println();
		 
		//============================================= 
		 //pooling means create a string object only once and reuse it
		 //when same state(content) string object is repeated.
		 
		 //Hence the two referenced variable point to same string object
		 //which is created in string constant pooled area(SCPA)
		 
		 //we can generate String object in 5 ways
			 //1. by using String literal
			 //2. by using new kw and constructor
			 //3. by using concatenation operation (+) 
			 //4. by using String class mutator methods and factory methods
			 //5. by using reading from keyboard
		 
		 //By default only the String literal object(compilation time constant) 
		 //comes under pooling. Means String literal object is 
		 //created only once, added to pool and reused every time 
		 //when it is repeated in the program.
		 
		 //The string object created in other 4 approaches 
		 //will not comes under pooling, every time new object is created.
		 
		 //if we want add the String objects to the pool and reuse string objects 
		 //those are the created 
		 	  //either by new kw and constructor or by using + operator 
			 //or by String class mutator methods or factory methods and
		 	 //by reading from keyboard
		 //we must use String class predefined method intern()
		 
		 //intern() method is used for 
		 	//1. Retrieving the String object from the pool if it is already available
		 	//2. If it is not available, adds this string object to the pool and returns to our program

		 s1 = "abc";
		 s2 = "abc";
		 System.out.println(s1 == s2);
		 
		 s3 = new String("abc");
		 s4 = new String("abc");
		 System.out.println(s3 == s4);
		 System.out.println(s1 == s4);

		 
		 String s5 = new String("abc").intern();
		 System.out.println(s1 == s5);
		 System.out.println(s5 == s3);
		 System.out.println(s5 == s4);

		 
		 String s6 = (s1 + " bbc").intern();
		 String s7 = (s1 + " bbc").intern();
		 System.out.println(s6 == s7);
		 
		 String s8 = "abc bbc";
		 System.out.println(s6 == s8);
		 
		 String s9 = s1.toUpperCase();
		 String s10 = s1.toUpperCase();
		 System.out.println(s9 == s10);
		 System.out.println(s9.equals(s10));

		 String s11 = s1.toUpperCase().intern();
		 String s12 = s1.toUpperCase().intern();
		 System.out.println(s11 == s12);
		 System.out.println(s11.equals(s12));
		 
		//=============================================
		 
	}
}