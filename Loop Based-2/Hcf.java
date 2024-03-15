import java.util.Scanner;
class Hcf
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int a = sc.nextInt(), d = 1;
		System.out.println("Enter Second Number: ");
		int b = sc.nextInt();
		System.out.println("Enter Thired Number: ");
		int c = sc.nextInt();
		for(int i = 1; i > 0; i++){
			if((a % i == 0) && (b % i == 0) && (c % i == 0)){
				d = i;
			}
		}
		System.out.println("Hcf Of " + a + ", " + b + " and " + c + " is: " + d);
	}
}