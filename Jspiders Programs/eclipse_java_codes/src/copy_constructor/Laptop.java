package copy_constructor;

public class Laptop {
	String name;
	String processor;
	String RAM;
	String storage_type;
	String size;
	
	Laptop(){}
	Laptop(Laptop l){
		this.name=l.name;
		this.processor=l.processor;
		this.RAM=l.RAM;
		this.storage_type=l.storage_type;
		this.size=l.size;
	}
	Laptop(String name,String processor, String RAM, String storage_type, String size, Laptop l){
		
		this.name=name;
		this.processor=processor;
		this.RAM=RAM;
		this.storage_type=storage_type;
		this.size=size;
		this.name=l.name;
		this.processor=l.processor;
		this.RAM=l.RAM;
		this.storage_type=l.storage_type;
		this.size=l.size;
		
	}
	Laptop(String name,String processor, String RAM, String storage_type, String size){
		this.name=name;
		this.processor=processor;
		this.RAM=RAM;
		this.storage_type=storage_type;
		this.size=size;
	}
	public void display() {
		System.out.println("Name of Laptop is: "+name);
		System.out.println("Laptop has processor: "+processor);
		System.out.println("Laptop has RAM: "+RAM);
		System.out.println("Laptop has Storage Type: "+storage_type);
		System.out.println("Laptop has Storage Size: "+size);
		System.out.println("=======================");
	}
}
