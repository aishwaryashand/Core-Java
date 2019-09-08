package Inheritance;

public class Parent2 {
	Parent2(){
		System.out.println("Parent class no-arg");
	}
	Parent2(int b){
		System.out.println("Parent class 1-arg");
	}
}
class Child2 extends Parent2{
	Child2(){
		this(10);
		System.out.println("Child class no-arg");
	}
	Child2(int a){
		super(10);
		System.out.println("Child class 1-arg");
	}
	public static void main(String[] args) {
		new Child2();
	}
}
