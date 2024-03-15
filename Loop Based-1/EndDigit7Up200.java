class EndDigit7Up200
{
	public static void main(String[] args)
	{
		int i = 0;
		while(i<=200){
			if(i%10==7){
				System.out.println("The Number which ends with 7 is: "+i);
			}
			i++;
		}
	}
}