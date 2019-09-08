package Inheritance;

public class Base {
	String name;
	Base(){
		//this(" ");
		System.out.println("No arg base class");
	}
	Base(String name){
		this.name=name;
		System.out.println("1-arg base class");
	}
}
class Derived extends Base{
	Derived(){
		System.out.println("No-arg derived class");
	}
	Derived(String name){
		//super(name);
		System.out.println("1-arg derived class");
	}
	public static void main(String[] args) {
		new Derived("jj");
		//new Derived();
	}
}
