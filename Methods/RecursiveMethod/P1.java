class P1 
{
	static void m1()
	{
		System.out.println("From m1()");
		m1();
	}
	public static void main(String[] args) 
	{
		System.out.println("From main");
		m1();
	}
}
