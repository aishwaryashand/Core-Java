class P1
{
	void m1()
	{
		System.out.println("From m1 no args");
	}
	void m1(int a)
	{
		System.out.println("From m1 1 args");
	}
	void m1(int a,int b)
	{
		System.out.println("From m1 2 args");
	}
	public static void main(String[] args) 
	{
		System.out.println("From main");
		P1 obj=new P1();
		P1 obj=new P1(10);
		P1 obj=new P1(20,30);
	}
}
