import java.util.Scanner;
class TkipuCountFactorNumber
{
	public static void main(String [] args)
	{
		int i=1,count=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n= sc.nextInt();
		while(i<=n/2){
			if(n%i==0){
				System.out.println("Count: "+count+" The Factor of Number "+n+" is: "+i);
				count++;
			}
			i++;
		}
	}
}