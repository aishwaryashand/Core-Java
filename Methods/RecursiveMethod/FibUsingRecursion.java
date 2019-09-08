class FibUsingRecursion 
{
	static int a=0;
	static int b=1;
	static void fib(int count)
	{
		if (count>0)
		{
			int c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
			fib(count-1);
		}
	}
	public static void main(String[] args) 
	{
		//int count=10;
		System.out.print(a+" "+b);
		//fib(count);
		fib(10);
	}
}
