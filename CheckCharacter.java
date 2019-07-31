
	package exercise1;

	import java.util.Scanner;

	public class CheckCharacter {

		String cc=new String();
		char ch;		
		int vowel=0,consonant=0,space=0,dig=0;
			
		public void getInput()
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter a sentence: ");
			cc=scan.nextLine();
		}
		
		public void vowels()
		{
			for(int i=0;i<cc.length();i++)
			{
				ch=cc.charAt(i);
			
			if( ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowel++;
				//System.out.println(ch);
				
			}
			
			else if(ch>='0'&&ch<='9')
			{
				dig++;
			}
			else if(ch==' ')
			{
				space++;
			}
			else 
			{
				//System.out.println(input.charAt(i));
				consonant++;	
			}
			}
		}
		
		
		
		public void display()
		{
			System.out.println("************ OUTPUT ************");
			
			System.out.println("The total number of vowels in the sentence is: "+vowel);
			System.out.println("The total number of consonants in the sentence is: "+consonant);
			System.out.println("The total number of digits in the sentence is: "+dig);
			System.out.println("The total number of spaces in the sentence is: "+space);
		}
	}

