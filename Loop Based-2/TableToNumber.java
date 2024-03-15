import java.util.Scanner;
class TableToNumber
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			int table = 0;
			System.out.println("Table Of " + i + " is: ");
			for(int j = 1; j <= 10; j++){
				table = i * j;
				System.out.println(i + " * " + j + " : " + table);
			}
			System.out.println("");
		}
	}
}