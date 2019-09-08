class P3 
{
	void m1()
	{
		System.out.println("From m1()");
	}
	public void m2()
	{
		System.out.println("From m2()");
	}
	public int m3()
	{
		System.out.println("From m3()");
		return 10;
	}
	public static void main(String[] args) 
	{
		P3 obj=new P3();
		obj.m1();
		obj.m2();
		obj.m3();
		System.out.println(new P3().m3());
	}
}
