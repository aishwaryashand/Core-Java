package Inheritance;

public class Parent1 {
	int a=10;
	int b=20;
}
class Child1 extends Parent1{
	int a=100;
	int b=200;
	void add(int a,int b) {
		System.out.println(a+b);//actual arguments
   		System.out.println(this.a+this.b);//same class arguments
   		System.out.println(super.a+super.b);//parent class
   	}
	public static void main(String[] args) {
		new Child1().add(1000,2000);
	}
}
