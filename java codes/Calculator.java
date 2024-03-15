import java.util.Scanner;
public class Calculator{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("1: Addition");
System.out.println("2: Substraction");
System.out.println("3: Multiplication");
System.out.println("4:  Division");
System.out.println("5: Reminder");
System.out.println("What you want to do select value:");
int ch,a,b,c;
ch= sc.nextInt();
switch(ch)
{
	case 1: System.out.println("Enter two values:");
		  a= sc.nextInt();
  		  b= sc.nextInt();
		  c= a+b;
		  System.out.println(c);
		  break;
	case 2: System.out.println("Enter two values:");
		  a= sc.nextInt();
  		  b= sc.nextInt();
		  c= a-b;
		  System.out.println(c);
		  break;
	case 3: System.out.println("Enter two values:");
		  a= sc.nextInt();
  		  b= sc.nextInt();
		  c= a*b;
		  System.out.println(c);
		  break;
	case 4: System.out.println("Enter two values:");
		  a= sc.nextInt();
  		  b= sc.nextInt();
		  c= a/b;
		  System.out.println(c);
		  break;
	case 5: System.out.println("Enter two values:");
		  a= sc.nextInt();
  		  b= sc.nextInt();
		  c= a%b;
		  System.out.println(c);
		  break;
	default: System.out.println("Invalid number");
	
}

}
}