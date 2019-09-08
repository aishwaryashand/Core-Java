package Polymorphism;

public class P1 {
	static void m1() {
		System.out.println("from m1 no arg");
	}
	static void m1(int a) {
		System.out.println("From m1 1 arg");
	}
	public static void main(String[] args) {
		m1();
		m1(10);
	}

}
