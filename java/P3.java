class P3
{
	public static void main(String[] args) 
	{
		float a=100.0f;
		byte b=(byte)a; //narrowing
		short c=(short)a;  //narrowing
		int d=(int)a;  //narrowing
		long e=(long)a;  //narrowing
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
