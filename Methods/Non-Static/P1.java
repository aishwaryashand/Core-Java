class P1 
{
	int a=10;
	int b=20;
	public static void main(String[] args) 
	{
		P1 obj=new P1();
		System.out.println(obj.a); //with the help of object reference creation
		System.out.println(obj.b); //with the help of object reference creation
		System.out.println(new P1().a); //nameless object creation
		System.out.println(new P1().b); //nameless object creation

	}
}
