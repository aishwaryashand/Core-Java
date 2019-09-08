package Inheritance;

public class P1 {
	int a=10;
}

class P2 extends P1{
	public static void main(String[] args) {
		P2 child =new P2();
		System.out.println("From child class");
		System.out.println(child.a);		
	}
}