import java.util.Scanner;
class G 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		switch(ch)
		{
			case 'a': System.out.println("Choice entered is a vowel.");
					break;
			case 'A': System.out.println("Choice entered is a vowel.");
					break;
			case 'e': System.out.println("Choice entered is a vowel."); 
					break;
			case 'E': System.out.println("Choice entered is a vowel."); 
					break;
			case 'i': System.out.println("Choice entered is a vowel."); 
					break;
			case 'I': System.out.println("Choice entered is a vowel."); 
					break;
			case 'o': System.out.println("Choice entered is a vowel.");
					break;
			case 'O': System.out.println("Choice entered is a vowel.");
					break;
			case 'u': System.out.println("Choice entered is a vowel.");
					break;
			case 'U': System.out.println("Choice entered is a vowel.");
					break;
			default: System.out.println("Choice entered is a consonant.");
		}
	}
}