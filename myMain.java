package oops;
class cat{
	boolean isFur;
	String name,breed;
	public void walk() {
		System.out.println("cat is walking");
		
	}
	public void eat() {
		System.out.println("cat is eating");
	}
}
public class myMain {

	public static void main(String[] args) {
		cat cat1 = new cat();
		cat cat2 = new cat();
		cat1.walk();
		cat2.eat();

	}

}
