package Inheritance;

public class P9 {
	int a=10;
}
class P13{
	int e=50;
}
class P10 extends P9{
	int b=20;
	public static void main(String[] args) {
		System.out.println(new P9().a + new P10().b + " From first child");
	}
}

class P11 extends P9{
	int c=30;
	public static void main(String[] args) {
		System.out.println(new P9().a + new P11().c + " From second child");
	}
}

class P12 extends P10{
	int d=40;
	public static void main(String[] args) {
		System.out.println(new P12().d + new P10().b + " P10's child");
	}
}