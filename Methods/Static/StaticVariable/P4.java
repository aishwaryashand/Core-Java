class P4 
{
	public static void A(int n)
	{
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ; j++)
			{
				if (i==0 || i==n/2 || j==0 || j==n-1)
				{
					System.out.print("*"+" ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		A(5);
	}
}
