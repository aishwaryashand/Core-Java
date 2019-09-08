class bike 
{
	public static void main(String[] args) 
	{
		int name= 'harley davidson';
		int speed=50;
		switch (name)
		{
		case 'harley davidson':System.out.println("Your bike is ready, you can now start riding your harley davidson");
		case 'harley davidson':System.out.println("Your bike is of 749 cc of engine.");
		case 'harley davidson':System.out.println("Your bike has 47.6 PS @ 8000 rpm of power.");
		case 'harley davidson':System.out.println("You have a very beautiful black colour bike.");
		default : System.out.println("Sorry, donot have any information on such bike.");
		}
		switch (speed)
		{
		case 1: while (speed<=50)
		{
			System.out.println("You're riding at a very slow speed, but you can get a very good average meanwhile.");
			break;
		}
		case 2: while (speed>50 && speed<=80)
		{
			System.out.println("You're riding it at a moderate speed.");
			break;
		}
		case 3: while (speed>80 && speed<=120)
		{
			System.out.println("You're riding at a high speed, slow down if required.");
			break;
		}
		case 4: while (speed>120)
		{
			System.out.println("You're riding at a very high speed, watch out to avoid mishappening.");
			break;
		}
		
		}
	}
}
