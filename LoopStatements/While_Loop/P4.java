class P4
{
	public static void main(String[] args) 
	{
		int i=1;
		while (i<=700)
		{
			if (i%2==0 && i%3==0 && i%6!=0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}