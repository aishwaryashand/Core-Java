class P2 
{
	static int count=0;
	static void m1()
	{
		count++;
		if (count<=10)
		{
			System.out.println(count);
			m1();
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("From main");
		m1();
	}
}
