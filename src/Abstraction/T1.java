package Abstraction;

abstract class T1 {
	abstract public void test();
}

abstract class T2 extends T1{
	public void test() {
		System.out.println("From T2 class");
	}
}

abstract class T3 extends T2{
	abstract public void test2();
}

abstract class T4 extends T3{
	public void test() {
		System.out.println("From T4 class");
	}
}

class T5 extends T4{
	public void test2() {
		System.out.println("From T5 class");
	}
}

class T6 extends T2{
	public void test() {
		System.out.println("From T6 class");
	}
}

class Demo2{
	public static void main(String[] args) {
		T1 obj1;
		T2 obj2;
		T3 obj3;
		T4 obj4;
		T5 obj5;
		T6 obj6;
	}
}

class Demo3{
	public static void main(String[] args) {
		T6 obj=new T6();
		T1 obj1=obj;
		obj1.test();
		T2 obj2=(T2) obj1;
		obj2.test();
	}
}

class Demo4{
	public static void main(String[] args) {
		T5 obj=new T5();
		T1 obj1=obj;
		obj1.test();
		obj1.test1();
	}
}