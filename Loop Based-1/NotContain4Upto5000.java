class NotContain4Upto5000
{
	public static void main(String[] args)
	{
		for(int i=1; i<=5000; i++){
			if(i%10==4){
				continue;
			}
			else{
				int a=i;
				a=a/10;
				if(a%10==4){
					continue;
				}
				else if(a%10!=4){
					a=a/10;
					if(a%10==4){
						continue;
					}
					else if(a%10!=4){
						a=a/10;
						if(a%10==4){
							continue;
						}
						else if(a%10!=4){
							System.out.println(i);
						}
					}
				}
			}
		}
	}
}