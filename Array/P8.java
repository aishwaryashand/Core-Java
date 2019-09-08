class P8 
{
	void m1()
	{
		int a[]={1,2,3,4};
		m2(a);
	}
	void m2(int a[])
	{
		for (int i=0;i<a.length ;i++ )
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) 
	{
		P8 obj=new P8();
		obj.m1();
	}
}
