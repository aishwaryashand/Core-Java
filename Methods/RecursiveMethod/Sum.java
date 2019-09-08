class Sum 
{
	static int a=0;
	static int b=1;
	static void sum(int count)
	{
		if (count>0)
		{
			int c=a+b;
			a=b;
			b=a;
			System.out.print(" "+c);
			sum(count-1);
		}
	}
	public static void main(String[] args) 
	{
		//int count=10;
		System.out.print(a+" "+b);
		//fib(count);
		sum(10);
	}
}
