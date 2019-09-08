class P2 
{
	static int i=10;
	static void m1()
	{
		System.out.println("From m1()");
	}
	static void m2()
	{
		System.out.println("From m2()");
	}
	static
	{
		System.out.println(i);
	}
	static
	{
		System.out.println("From SIB-1");
	}
	static
	{
		m1();
		System.out.println("From SIB-2");
	}
	public static void main(String[] args) 
	{
		System.out.println("From main");
		m2();
		m1();
	}
}
