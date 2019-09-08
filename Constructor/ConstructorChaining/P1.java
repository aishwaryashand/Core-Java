class P1 
{
	P1()
	{
		this(10);
		System.out.println("0-arg constructor");
	}
	P1(int a)
	{
		System.out.println("1-arg constructor");
	}
	P1(int a, int b)
	{
		System.out.println("2-args constructor");
	}
	public static void main(String[] args) 
	{
		P1 obj= new P1();		
	}
}
