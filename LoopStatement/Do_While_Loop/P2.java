class P2 
{
	public static void main(String[] args) 
	{
		int i=10;
		do
		{
			if (i%2==0 && i%3==0 && i%6!=0)
			{
				System.out.println(i);
			}
			i++;
		}
		while (i<=100);
	}
}
