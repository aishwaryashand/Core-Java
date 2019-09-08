package Polymorphism;

public class P2 {
	public static void m1() {
		System.out.println("from P2 m1");
	}
}
class P3 {
	public static void m1() {
		System.out.println("From P3 class m1");
	}
	public static void main(String[] args) {
		new P2().m1();
		m1();
	}
}