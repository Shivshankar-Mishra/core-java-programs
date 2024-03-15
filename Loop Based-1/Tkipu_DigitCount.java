import java.util.Scanner;
class Tkipu_DigitCount
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i=0,count=0;
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int digit=n;
		while(i<=n){
			if(n%10!=0){
				n=n/10;
				count++;
			}
			i++;
		}
		System.out.println("The Total number of digits in "+digit+" is: "+count);
	}
}