class NaturalNoCubeSumUpto100
{
	public static void main(String [] args)
	{
		int n = 100, sum = 0;
		for(int i = 1; i<=n; i++){
			sum += i*i*i;
		}
		System.out.println("The sum of square of Natural Number till " +n+ " are: " +sum);
	}
}