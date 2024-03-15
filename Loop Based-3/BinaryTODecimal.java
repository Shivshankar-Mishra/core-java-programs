import java.util.Scanner;
class BinaryTODecimal
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Binary Number: ");
		int Binary = sc.nextInt();
		int Decimal = 0, digit = Binary, base = 1, val = 0;
		while(digit > 0){
			val = digit % 10;
			Decimal += val * base;
			base *= 2;
			digit /= 10;
		}
		System.out.println("Binary Number: " + Binary + " is in Decimal: " + Decimal);
		
	}
}