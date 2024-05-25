//Program to demonstrate Methods in Strings
public class DemoString {

	public static void main(String[] args) {
		String s="Hello";
		String s1=" World";
		String s2=new String("hELLO ");
		System.out.println(s.charAt(3));
		System.out.println(s.codePointAt(2));
		System.out.println(s.codePointBefore(4));
		System.out.println(s.codePointCount(1, 4));
		System.out.println(s.compareTo(s1));
		System.out.println(s.compareToIgnoreCase(s2));
		System.out.println(s.concat(s1));
		System.out.println(s.contains("ello"));
		System.out.println(s.contentEquals("el"));
		System.out.println(s.endsWith("o"));
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s.hashCode());
		System.out.println(s.isBlank());
		System.out.println(s.isEmpty());
		System.out.println(s.indexOf("l"));
		System.out.println(s.lastIndexOf("l"));
		System.out.println(s.length());
		System.out.println(s.repeat(5));
		System.out.println(s1.replace("l","e"));
		System.out.println(s2.startsWith("h"));
		System.out.println(s2.strip());
		System.out.println(s1.stripIndent());
		System.out.println(s1.stripLeading());
		System.out.println(s2.stripTrailing());
		System.out.println(s1.substring(1));
		System.out.println(s1.substring(2, 4));
		
		
	}

}
