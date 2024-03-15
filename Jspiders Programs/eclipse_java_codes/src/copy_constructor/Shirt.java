package copy_constructor;

public class Shirt {
	int button;
	String type;
	String color;
	String size;
	
	Shirt(){}
	Shirt(Shirt s){
		this.button=s.button;
		this.type= s.type;
		this.color=s.color;
		this.size=s.size;
	}
	Shirt(int button, String type, String color, String size){
		this.button=button;
		this.type= type;
		this.color=color;
		this.size=size;
	}
	public void display() {
		System.out.println("Shirt has number of buttons: "+button);
		System.out.println("Shirt has slives: "+type);
		System.out.println("Color of Shirt is: "+color);
		System.out.println("Size of Shirt is: "+size);
		System.out.println("=======================");
	}
	
}
