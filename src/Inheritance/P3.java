package Inheritance;

public class P3 {
	int a=10;
}

class P4 extends P3{
	int b=20;
}

class P5 extends P4{
	int c=30;
	public static void main(String[] args) {
		P3 obj=new P3();
		System.out.println(obj.a);
		P4 obj1=new P4();
		System.out.println(obj1.b);
		P5 obj2=new P5();
		System.out.println(obj2.c);
				
	}
}