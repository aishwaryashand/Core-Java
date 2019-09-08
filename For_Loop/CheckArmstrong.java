class CheckArmstrong 
{
	public static void main(String[] args) 
	{
		int num=371;
		int number;
		int total=0;
		int temp;
		number=num;
		while (number!=0)
		{
			temp=number%10;
			total=total+temp*temp*temp;
			number=number/10;
		}
		if (total==num)
		{
			System.out.println(num+" is an Armstrong Number");
		}
		else
			System.out.println(num+" is not an Armstrong Number");
	}
}
