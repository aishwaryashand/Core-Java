class P3 
{
	static int i=23;
	static int j;
	static void A()
	{
		b();
		System.out.println(i++);
	}
	static int b()
	{
		j=++i + j + i;
		System.out.println(j);
		return 10;
	}
	static
	{
		i+=i++ + i;
		System.out.println(i);
	}
	static
	{
		int k=i+j;
		System.out.println(k);
		A();
	}
	public static void main(String[] args) 
	{
		System.out.println("From main");
		A();
		b();
	}
}