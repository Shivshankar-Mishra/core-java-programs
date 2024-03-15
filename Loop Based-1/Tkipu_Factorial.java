import java.util.Scanner;
class Tkipu_Factorial
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i=1,fact=1;
		System.out.println("Enter The digit: ");
		int n=sc.nextInt();
		if(n==0 && n==1){
			System.out.println("Factorial is : 1");
		}
		else{
			while(i<=n){
				fact= fact*i;
				i++;
			}
		}
		System.out.println("Factorial Of Number "+n+" is: "+fact);
	}
}