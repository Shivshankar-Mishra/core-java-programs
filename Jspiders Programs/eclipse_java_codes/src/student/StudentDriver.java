package student;

public class StudentDriver {
	public static void main(String[] args) {
		Student s1 = new Student("Chandan");
		Student s2 = new Student("Manish","B.tech","A","Prayagraj");
		Student s3 = new Student("Saurabh","B");
		Student s4 = new Student("Azad","15-AUG-1999");
		Student s5 = new Student("");
		Student s6 = new Student("Kori","01-JAN-1947","B.tech","Lalganj Ajhara");
		Student s7 = new Student("Ram","7000BC","RAM");
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		s5.display();
		s6.display();
		s7.display();
	}

}
