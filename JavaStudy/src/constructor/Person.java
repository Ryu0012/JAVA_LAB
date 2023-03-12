package constructor;

public class Person {
	int age;
	String name;
	boolean marry;
	int child;

	public static void main(String[] args) {
		Person man = new Person();
		man.age = 40;
		man.name = "James";
		man.marry = true;
		man.child = 4;
		System.out.println(man.age);
		System.out.println(man.name);
		System.out.println(man.marry);
		System.out.println(man.child);
	}

}
