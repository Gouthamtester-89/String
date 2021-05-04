package org.string;

public class StringMethods {

	public static void main(String[] args) {
		String s= "GreensTechnology";
		String s1= "Velmurugan";
		String s3 ="Java";
		String s4 = "Nisha";
		String s5= "velmurugan@gmail.com";
		String s6="Welcome to class java";
		String s7 = "Hai i am Nisha";
		String s8 = "";
		String s10 = "Welcome to class java";
		String s11 = "NISHANTHI";
		String s12 = "nishanthi";
		String s13 = "WelcometoGreensTechnology";
		// finding index//
		int indexOf = s.indexOf("o");
		//finding last index//
		int lastindexOf3 = s.lastIndexOf("o");
		int indexOf1 = s1.indexOf("n");
		System.out.println(indexOf);
		System.out.println(indexOf1);
		System.out.println(lastindexOf3);
		// Printing a particular character//
		char c = s13.charAt(18);
		System.out.println(c);
		// Finding string is present or not//
		boolean contains = s.contains("h");
		boolean contains1= s1.contains("u");
		boolean equalsnew = s5.equals("@");
		System.out.println(equalsnew);
		System.out.println(contains);
		System.out.println(contains1);
		boolean equals = s3.contains("Java");
		System.out.println(equals);
		//Converting into lower case//
		String u = s11.toLowerCase();
		System.out.println(u);
		// Converting into Upper Case//
		String v = s12.toUpperCase();
		System.out.println(v);

		// Finding particular string is present or not in Equalsignorecase//
		boolean equals1= s3.equalsIgnoreCase("java");
		System.out.println(equals1);
		boolean equals2= s4.equalsIgnoreCase("nisha");
		System.out.println(equals2);
		// Finding particular character in a string is present or not//
		boolean containsnew = s5.contains("@");
		System.out.println(containsnew);
		// Replacing String//
		String replace= s6.replace("java", "sql");
		System.out.println(replace);
		//Finding a string by checking with  beginning letter// 
		boolean s8new = s7.startsWith("welcome");
		boolean s9 = s6.endsWith("java");
		System.out.println(s8new);
		System.out.println(s9);
		// Finding a String which is empty or not//
		boolean empty = s6.isEmpty();
		boolean empty1 = s7.isEmpty();
		System.out.println(empty);
		System.out.println(empty1);
		// Generating Sub string //
		String substring = s10.substring(0,7);
		System.out.println(substring);


	}

}
