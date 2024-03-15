import java.util.Scanner;
class DigitGreaterEqual5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i=0;
		System.out.println("Enter The number: ");
		int n=sc.nextInt();
		int digit=n;
		while(n%10!=0){
			int a=n%10;
			n=n/10;
			if(a>=5){
				System.out.println(a+": is the number greater or equal to 5 in given digit: "+digit);
			}
		}
	}
}