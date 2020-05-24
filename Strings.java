package introduction;

public class Strings {

	public static void main(String[] args) {
		String name ="Garvit";//string "garvit " in string pool area not in heap area
		String work="                                               hello from the other side         ";
		String lastName= new String("Chaudhary");//object created and string "chaudhary "in both heap area and string pool
		System.out.println(name.charAt(0));
		System.out.println(name.length());
		System.out.println(lastName.substring(1, 5));
		System.out.println(lastName.contains("Chau"));
		System.out.println(name.toLowerCase());
		System.out.println(lastName.toUpperCase());
		System.out.println(name.indexOf("z"));
		System.out.println(work.trim());
		

	}

}
