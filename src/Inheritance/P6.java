package Inheritance;

public class P6 {
	int a=10;
 	}

class P7 extends P6{
	public static void main(String[] args) {
		System.out.println(new  P6().a  +  " From first child");     
	}
}

class P8 extends P6{
	public static void main(String[] args) {
		System.out.println(new  P6().a  +  " From second child");     
	}
}