class Fact 
{
	int fact(int n)
	{
		int result;
		if (n==0||n==1)
		{
			return 1;
		}
		result =fact(n-1)*n;
		return result;
	}
	public static void main(String[] args) 
	{
		Fact rfact= new Fact();
		System.out.println(rfact.fact(5));
	}
}
