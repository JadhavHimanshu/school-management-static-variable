
public class collegemanagemenNew {
	public static void main(String args[]) {
		studentNew std1 = new studentNew();

		std1.firstname = "aditya";
		std1.lastname = "pawar";
		std1.age = 21;
		std1.adress = "wagholi";
		std1.classname = "2nd";
		studentNew.collegename = "jspm";

		System.out.println(std1.firstname);
		System.out.println(std1.lastname);
		System.out.println(std1.age);
		System.out.println(std1.adress);
		System.out.println(std1.classname);
		System.out.println(studentNew.collegename);

		studentNew std2 = new studentNew();
		std2.firstname = "raghav";
		std2.lastname = "patil";
		std2.age = 23;
		std2.adress = "pune";
		std2.classname = "3rd";
		studentNew.collegename = "Raisoni";

		System.out.println(std2.firstname);
		System.out.println(std2.lastname);
		System.out.println(std2.age);
		System.out.println(std2.adress);
		System.out.println(std2.classname);
		System.out.println(studentNew.collegename);

	}

}
