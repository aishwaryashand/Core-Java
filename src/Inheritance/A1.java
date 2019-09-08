package Inheritance;

public class A1 {
	A1(){
		System.out.println("From A1 no-arg");
	}
	A1(int a) {
		System. out.println("From A1 1-arg");
	}
}
class A2 extends A1{
	A2(){
		//by default super(); get executed by compiler
		System.out.println("From A2 no-arg");
	}
	A2(int a){
		//super(a);
		System.out.println("From A2 1-arg");
	}
	public static void main(String[] args) {
		new A2(1);
	}
}
