import java.util.Scanner;
class OctalTODecimal
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Octal Number: ");
		int Octal = sc.nextInt();
		int Decimal = 0, digit = Octal, base = 1, val = 0;
		while(digit > 0){
			val = digit % 10;
			Decimal += val * base;
			base *= 8;
			digit /= 10;
		}
		System.out.println("Octal Number: " + Octal + " is in Decimal: " + Decimal);
		
	}
}