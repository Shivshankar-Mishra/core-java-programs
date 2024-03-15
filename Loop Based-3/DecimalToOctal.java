import java.util.Scanner;
class DecimalToOctal
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Decimal Number: ");
		int Decimal = sc.nextInt();
		int digit = Decimal, Octal = 0, base = 1;
		while(digit > 0){
			int a = digit % 8;
			Octal += a * base;
			base *= 10;
			digit /= 8;
		}
		System.out.println("Octal Of Decimal: " + Decimal + " is in Octal: " + Octal);
	}
}