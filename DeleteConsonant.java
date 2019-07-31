package ArrayExercise2;
import java.util.Scanner;

public class DeleteConsonant {
	
	 char ch;
		
	public	void deleteconsonants(String input)
	{
		
		System.out.print(" OUPUT: ");
		for(int i=0;i<input.length();i++)
		{
			ch=input.charAt(i);
			if( ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.print(ch);
			}
		}
		
	}
}
