class P1 
{
	P1()
	{
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
		System.out.println("Main Begins");
		P1 obj= new P1();
		P1 obj1= new P1(10);
		P1 obj2= new P1(30,20);
		System.out.println("Main Ends.");
	}
}
