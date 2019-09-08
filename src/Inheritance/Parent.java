package Inheritance;

public class Parent extends Object {
int a=10;
}
class Child extends Parent{
	int b=20;
	public static void main(String[] args) {
		Child child=new Child();
		System.out.println(child.a);
		System.out.println(child.b);
	}
}