class F 
{
	public static void main(String[] args) 
	{
		System.out.println("Press 1 to order bhindi.");
		System.out.println("Press 2 to order paneer.");
		System.out.println("Press 3 to order aloo.");
		System.out.println("Press 4 to order thali of Rs90.");
		System.out.println("Press 5 to order thali of Rs60.");
		System.out.println("\n");
		int choice=3;
		switch(choice)
		{
			case 1: System.out.println("You've ordered bhindi.");
					break;
			case 2: System.out.println("You've ordered paneer.");
					break;
			case 3: System.out.println("You've ordered aloo.");
					break;
			case 4: System.out.println("You've ordered thali of Rs90.");
					break;
			case 5: System.out.println("You've ordered thali of Rs60.");
					break;
			default: System.out.println("We don not serve such food.");
					break;
		}
	}
}