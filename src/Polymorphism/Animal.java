package Polymorphism;

public class Animal {
	void talk() {
		System.out.println("Animals can talk");
	}
}
class Dog{
	void talk() {
		System.out.println("Dogs can bark too.");
	}
}
class Cat {
	void talk() {
	System.out.println("Meow Meow!!");
	}
}
class Driver{
	public static void main(String[] args) {
		Animal animal=new Animal();
		animal.talk();
		Dog dog=new Dog();
		dog.talk();
		Cat cat=new Cat();
		cat.talk();
	}
}
