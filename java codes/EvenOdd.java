import java.util.Scanner;
public class EvenOdd{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value:");
		int a= sc.nextInt();
		if(a%2==0)
		{
			System.out.println("given value is even");
		}
		else
		{
			System.out.println("given value is odd");
		}
	}
}