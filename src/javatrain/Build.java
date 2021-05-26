package javatrain;
//Do not need to import Book or Person because in same package.

public class Build {

	public static void main(String[] args) {
		Person Ray = new Person("Ray", 23, "Male", "mixed", "dev");
		Book Wizard = new Book("Wizard");
		System.out.println(Ray.name+Ray.job+Ray.sex+Ray.age+Ray.race);
		System.out.println(Wizard.title);

	}

}





