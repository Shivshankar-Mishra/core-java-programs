class NaturalNoSumUpto100
{
	public static void main(String [] args)
	{
		int n = 100, sum = 0;
		for(int i = 1; i<=n; i++){
			sum += i;
		}
		System.out.println("The total sum of " +n+ " natural numbers are: " +sum);
	}
}