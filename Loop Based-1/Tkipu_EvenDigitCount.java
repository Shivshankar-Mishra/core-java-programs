import java.util.Scanner;
class Tkipu_EvenDigitCount
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int i=0,count=0;
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int digit=n;
		while(n%10!=0){
				int a=n%10;
				n=n/10;
				if(a%2==0){
					System.out.println("The even digit of "+digit+" is: "+a);
					count++;
				}
				i++;
		}
		if(count==0){
			System.out.println("There is not any even digit in the Number: "+digit);
		}
		else{
			System.out.println("The Total number of Even digits in "+digit+" is: "+count);
		}
	}
}