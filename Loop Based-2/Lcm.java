import java.util.Scanner;
class Lcm
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int a = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int b = sc.nextInt();
		System.out.println("Enter Thired Number: ");
		int c = sc.nextInt();
		for(int i = 1; i > 0; i++){
			if((i % a == 0) && (i % b == 0) && (i % c == 0)){
				System.out.println("Lcm Of " + a + ", " + b + " and " + c + " is: " + i);
				break;
			}
		}
	}
}