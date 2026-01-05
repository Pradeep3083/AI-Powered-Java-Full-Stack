package com.strings;

public class MethodsInString {
    public static void main(String[] args) {

        String s1 = "Pradeep";
        String s2 = "Pradeep Sai Lakshman Guniganti";

        // length()
        System.out.println(s1.length());
        System.out.println(s2.length());

        // charAt()
        System.out.println(s1.charAt(0));
        System.out.println(s2.charAt(2));

        // equals & equalsIgnoreCase
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        // contains()
        System.out.println(s2.contains(s1));
        System.out.println(s1.contains(s2));

        // indexOf & lastIndexOf
        System.out.println(s1.indexOf('P'));
        System.out.println(s1.lastIndexOf('P'));
        System.out.println(s2.indexOf("Sai"));

        // startsWith & endsWith
        System.out.println(s1.startsWith("Pra"));
        System.out.println(s2.startsWith(s1));
        System.out.println(s1.endsWith("eep"));

        // case conversion
        System.out.println(s1.toLowerCase());
        s2 = s2.toUpperCase();
        System.out.println(s2);

        // trim()
        String s3 = " Pradeep Sai Lakshman Guniganti ";
        System.out.println(s3.length());
        s3 = s3.trim();
        System.out.println(s3.length());

        // isEmpty & isBlank
        String s4 = " ";
        System.out.println(s4.isEmpty());
        System.out.println(s4.trim().isEmpty());
        System.out.println(s4.isBlank());

        // concat()
        System.out.println(s1.concat(" ".concat(s2)));
        System.out.println(s1);

        // compareTo()
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));

        String s5 = "Pradeep";
        String s6 = "Pradeep";
        System.out.println(s5.compareTo(s6));

        // replace()
        System.out.println(s5.replace('p', 'P'));
        System.out.println(s6.replace("Pradeep", "Pradeep Sai Lakshman Guniganti"));

        s6 = "Pradeep Sai Lakshman Guniganti";
        System.out.println(s6.replace(" ", "-"));

        // substring()
        String s7 = "Pradeep Sai Lakshman Guniganti";
        System.out.println(s7.substring(0, 7));   // Pradeep
        System.out.println(s7.substring(8));     // Sai Lakshman Guniganti

        // second last character
        System.out.println(s7.charAt(s7.length() - 2));
    }
}


/*


package com.strings;

public class MethodsInString {
	public static void main(String[] args) {
				   //012
		String s1 = "FLM";
		String s2 = "FLM Edutech";
		
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		System.out.println(s1.charAt(0));
		System.out.println(s2.charAt(2));
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s2.contains(s1));
		System.out.println(s1.contains(s2));
		
		System.out.println(s1.indexOf('F')); // first occurrence of the 
		System.out.println(s1.lastIndexOf('F'));
		
		System.out.println(s2.indexOf("Edu"));
		
		System.out.println(s1.startsWith("FL"));
		System.out.println(s2.startsWith(s1));
		
		System.out.println(s1.endsWith("LM"));
		
		System.out.println(s1.toLowerCase());
		s2 = s2.toUpperCase();
		System.out.println(s2);
		
		String s3 = "FLM";
		System.out.println(s3.length());
		s3.trim();
		System.out.println(s3.length());
		
		String s4 = " ";
		System.out.println(s4.isEmpty());
		System.out.println(s4.trim().isEmpty());		
		System.out.println(s4.isBlank());
		
		System.out.println(s1.concat(s2));		
		System.out.println(s1);
		
		System.out.println(s1.compareTo(s2));		
		System.out.println(s2.compareTo(s1));
		
		String s5 = "FLM";
		String s6 = "FLM";
		System.out.println(s5.compareTo(s6));
		
		System.out.println(s5.replace('M', 'A'));
		System.out.println(s6.replace("FLM", "FLM Edutech"));
		
		s6 = "FLM Edutech";
		System.out.println(s6.replace(" ", "-"));
		
		String s7 = "FLM Edutech";
		// substring
		System.out.println(s7.substring(0,3));
		System.out.println(s7.substring(4));
		
		System.out.println(s7.charAt(s7.length()-2));
		
	}
}


*/
