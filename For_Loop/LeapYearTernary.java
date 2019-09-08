class LeapYearTernary 
{
	public static void main(String[] args) 
	{
		long a,y=1500,c;
		if (y!=0)
		{
			a=(y%400==0)?(c=1):((y%100==0)?(c=0):((y%4==0)?(c=1):(c=0)));
			if (c==1)
			{
				System.out.println("It is a leap year.");
			}
			else
				System.out.println("It is not a leap year.");
		}
		else
		System.out.println("Zero does not exist.");
	}
}
