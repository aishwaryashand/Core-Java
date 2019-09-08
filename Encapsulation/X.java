class X
{
	private int a;
	int geta()
	{
		return a;
	}
	void seta(int a)
	{
		this.a=a;
	}
}

class Y 
{
	public static void main(String[] args) 
	{
		X obj=new X();
		System.out.println(obj.geta()); //to read the private member of a class
		obj.seta(10); //to modify the value
		System.out.println(obj.geta());
	}
}
