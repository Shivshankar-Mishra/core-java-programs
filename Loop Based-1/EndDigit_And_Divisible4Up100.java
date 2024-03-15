class EndDigit_And_Divisible4Up100
{
	public static void main(String[] args)
	{
		int i = 0,count = 0;
		while(i<=100){
			if(i%10==4 && i%4==0){
				System.out.println("Count:"+count+" The Number which ends with 7 and Divisible by 7 is: "+i);
				count++;
			}
			i++;
		}
	}
}