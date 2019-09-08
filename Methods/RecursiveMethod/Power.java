class Power 
{
	public static int Power(int base, int power)
	{
		if (power!=0)
		{
			return (base * Power(base,power-1));
		}
		else
			return 1;
	}
	public static void main(String[] args) 
	{
		int base=5;
		int power=5;
		int output=Power(base,power);
		System.out.print(output);
	}
}
