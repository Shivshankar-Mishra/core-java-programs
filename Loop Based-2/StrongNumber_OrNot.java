import java.util.Scanner;
class StrongNumber_OrNot
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt(), a = 0, sum = 0;
		int digit = n;
		while(digit >0){
			a = digit % 10;
			int fact = 1;
			if(a == 0){
				fact *= 1;
			}
			for(int i = 1; i <= a; i++){
				fact *= i;
			}
			sum += fact;
			digit /= 10;
		}
		if(n == sum){
			System.out.println(n + " is a Strong Number");
		}
		else{
			System.out.println(n + " is not a Strong Number");
		}
	}
}