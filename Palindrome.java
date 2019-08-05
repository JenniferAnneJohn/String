package exercise1;
import java.util.Scanner;

public class Palindrome {
		
	String a,b="";
	
	public void getInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a word: ");
		a=scan.next();
	}

	public void process()
	{
		int wordsize=a.length();
		//System.out.println("The size of the word is: "+wordsize);
		for(int i=a.length()-1;i>=0;i--)
		{
		b=b+a.charAt(i);
		}
		System.out.println("The word in the reverse order is: "+b);
	}
	void check()
	{
		if(a.equals(b))
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
	}	
}
