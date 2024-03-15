class Divisible8Up200
{
	public static void main(String[] args)
	{
		int i=0;
		while(i<=200)
		{
			if(i%8==0){
				System.out.println("The Number "+i+" is Divisible by 8");
			}
			i++;
		}
	}
}