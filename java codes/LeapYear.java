import java.util.Scanner;
public class LeapYear{
public static void main(String[] args){
Scanner year= new Scanner(System.in);
int value,a;
System.out.println("enter the Year:");
value= year.nextInt();
if(value%4==0)
{
 if(value%400==0){  
		System.out.println("year is leap year");
 	if(value%100==0)
	{
	  System.out.println("year is century year");
  	}  
 }
else{
	System.out.println("year is not leap year");
  }
}
  }
}