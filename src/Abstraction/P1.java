package Abstraction;

abstract class P1 {
	abstract public void dance();	//abstract method
}

abstract class P2 extends P1{
	public void eat() {	//concrete method
		System.out.println("Hello, you're always eating.");
	}
}
class Demo{
	public static void main(String[] args) {
		P2 obj;	//reference variable for the abstract class
	}
}