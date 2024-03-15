class NotContain4Upto5000LL
{
	public static void main(String[] args)
	{
		for(int i=1; i<=5000; i++){
			int a=i;
			boolean contain=false;
			while(a>0){
				if(a%10==4){
					contain=true;
					break;
				}
				a=a/10;
			}
			if(!contain){
				System.out.println(i);
			}
		}
	}
}