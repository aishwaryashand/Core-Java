import java.util.Scanner;
class D
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char input=sc.next().charAt(0);
		if (input=='a' || input=='e' || input=='i' || input=='o' || input=='A' || input=='E' || input=='I' || input=='O' || input=='U')
		{
			System.out.println("Input provided is a vowel");
		}
		else if ((input>='a'&&input<='z')||(input>='A'&&input<='Z'))
		{
			System.out.println("Input provided is a consonant");
		}
		
		else
		{
			System.out.println("Input provided is a special character");
		}
		
	}
}
