import java.util.Scanner;
class TkipuFactorNumber
{
	public static void main(String [] args)
	{
		int i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n= sc.nextInt();
		while(i<=n/2){
			if(n%i==0){
				System.out.println("The Factor of Number "+n+" is: "+i);
			}
			i++;
		}
	}
}