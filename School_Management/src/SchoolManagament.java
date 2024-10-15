
public class SchoolManagament {
	public static void main(String args[]) {
		Student std1 = new Student();
		std1.firstname = "hitesh";
		std1.lastname = "patil";
		std1.age = 20;
		std1.adress = "pune";
		std1.classname = "2nd";
		Student.Collegename = "Singhgad";

		System.out.println(std1.firstname);
		System.out.println(std1.lastname);
		System.out.println(std1.age);
		System.out.println(std1.adress);
		System.out.println(std1.classname);
		System.out.println(Student.Collegename);

		Student std2 = new Student();
		std2.firstname = "vivek ";
		std2.lastname = "patil";
		std2.age = 24;
		std2.adress = "pune";
		std2.classname = "3rd";

		Student.Collegename = "GHRCEM";

		System.out.println(std2.firstname);
		System.out.println(std2.lastname);
		System.out.println(std2.age);
		System.out.println(std2.adress);
		System.out.println(std2.classname);
		System.out.println(Student.Collegename);

	}

}
