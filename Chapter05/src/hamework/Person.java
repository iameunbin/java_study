package hamework;

public class Person {
	int age;
	String name;
	boolean is_married;
	int child;
	
	public static void main(String[] args) {
		Person man = new Person();
		
		man.age = 40;
		man.name = "James";
		man.is_married = true;
		man.child = 3;
		
		System.out.println(man.age);
		System.out.println(man.name);
		System.out.println(man.is_married);
		System.out.println(man.child);
	}
}
