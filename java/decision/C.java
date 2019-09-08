import java.util.Scanner;
class C 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if (n%10==3)
		{
			System.out.println("Number ends with 3");
		}
		else
		{
			System.out.println("Number does not ends with 3");
		}
	}
}
