import java.util.Scanner;
public class Highest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three values: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b){
			if(a>c){
				System.out.println(a+" is the largest value");
			}
			else
			{
				System.out.println(c+" is largest value");
			}
		}
		else{
				if(b>c)
				{
					System.out.println(b+" is largest value");
				}
				else{
					System.out.println(c+" is largest value");
				}
			}
	}
}