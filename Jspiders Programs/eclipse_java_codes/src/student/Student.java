package student;

public class Student {
	int id;
	String name;
	String dob;
	String course;
	String section;
	String address;
	long mob;
	Student(){
		}
	Student(String name){
		this();
		this.name=name;
	}
	Student(String name, String dob){
		this(name);
		this.dob=dob;
	}
	Student(String name, String dob, String course){
		this(name,dob);
		this.course=course;
	}
	Student(String name, String dob, String course, String section){
		this(name,dob,course);
		this.section=section;
	}
	Student(String name, String dob, String course, String section, String address){
		this(name,dob,course,section);
		this.address=address;
	}
	Student(String name, String dob, String course, String section, String address, long mob){
		this(name,dob,course,section,address);
		this.mob=mob;
	}
	
	public void display() {
		System.out.println("Name of Student: "+ name);
		System.out.println("DOB of Student: "+ dob);
		System.out.println("Course of Student: "+ course);
		System.out.println("Section of Student: "+ section);
		System.out.println("Address of Student: "+ address);
		System.out.println("Mob of Student: "+ mob);
		System.out.println("==========================================");
	}

}
