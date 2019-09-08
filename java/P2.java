class P2 
{
	public static void main(String[] args) 
	{
		long a=1000000;
		byte b=(byte)a;  //narrowing
		short c=(short)a;  //narrowing
		int d=(int)a;  //narrowing
		float e=a;  //widening
		double f=a;  //widening
		char g=(char)a;  //narrowing
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}
}
