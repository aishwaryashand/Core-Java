class  P1
{
	public static void main(String[] args) 
	{
		int a=17,b=7,c=3,d=10;
		int e= a++ + --d;
		int f= e++ - b-- + c-- + c++;
		int k= f++ + e-- + a-- + b++ + d-- -d;
		System.out.println(k++ + f);
		System.out.println(f++ + f + b--);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(k);
	}
}
