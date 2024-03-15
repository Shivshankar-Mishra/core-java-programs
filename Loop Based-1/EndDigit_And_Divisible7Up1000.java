class EndDigit_And_Divisible7Up1000
{
	public static void main(String[] args)
	{
		int i = 0;
		while(i<=1000){
			if(i%10==7 && i%7==0){
				System.out.println("The Number which ends with 7 and Divisible by 7 is: "+i);
			}
			i++;
		}
	}
}