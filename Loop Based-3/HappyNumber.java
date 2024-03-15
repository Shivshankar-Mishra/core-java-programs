import java.util.Scanner;
class HappyNumber
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to check: ");
		int n = sc.nextInt();
		int digit = n, a = 0, sum = 0;
		do{
			while(digit > 0){
				a = digit % 10;
				sum += a * a;
				digit /= 10;
			}
			if(sum == 1 || sum == 4 || sum == 0){
				break;
			}
			else{
				digit = sum;
				sum = 0;
			}
		}while(digit != 1);
		if(sum == 1){
			System.out.println(n + " is a Happy Number");
		}
		else{
			System.out.println(n + " is not a Happy Number");
		}
	}
}