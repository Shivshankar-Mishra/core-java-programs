package copy_constructor;

public class SLDriver {
	public static void main(String[] args) {
		Shirt s1 = new Shirt(12,"full","Maroon","L");
		Shirt s2= new Shirt(s1);
		Laptop l1 = new Laptop("DELL Inspiron 3593","Intel Core i5","4GB","SSD + HDD","256GB + 1TB");
		Laptop l2 = new Laptop("ASUS Vivobook 15","Intel Core i5","8GB","SSD + HDD","256GB + 1TB");
		Laptop l3 = new Laptop("HP Pavellion","Intel Core i5","8GB","SSD + HDD","128GB + 1TB",l2);
		Laptop l4 =new Laptop(l1);
		Laptop l5 = new Laptop("HP Pavellion","Intel Core i5","8GB","SSD + HDD","128GB + 1TB");
		s1.display();
		l1.display();
		l2.display();
		l3.display();
		l4.display();
		l5.display();
		s2.display();
		
	}

}
