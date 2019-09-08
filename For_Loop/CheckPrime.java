class CheckPrime 
{
	public static void main(String[] args) 
	{
		int i=10;
		int temp=0;
		for (int j=2;j<i ;j++ )
		{
			if (i%j==0)
			{
				temp=temp+1;
			}
		}
		if (temp==0)
		{
			System.out.println("It is aPrime Number");
		}
		else 
		{
			System.out.println("It is not a Prime Number");
		}
	}
}
