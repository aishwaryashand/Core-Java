class P7 
{
	public static void main(String[] args) 
	{
		int i=0;
		while (i<=100)
		{
			if (i%10==7)
			{
				i++;
				continue;
			}
			else if (i>69 && i<80)
			{
				i++;
				continue;
			}
			else
			{
				System.out.println(i);
			}
		i++;
		}
	}
}
