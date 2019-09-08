package Abstraction;

abstract class Fruit {
	abstract public void ripe();
}

abstract class Mango extends Fruit{
	public void grown() {
	}
}

class Alphonso extends Mango{
	public void ripe() {
		System.out.println("Sweet");
	}
}

class Demo1{
	public static void main(String[] args) {
		Alphonso obj=new Alphonso();
		obj.ripe();
	}
}