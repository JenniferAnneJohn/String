package ArrayExercise2;

public class DeleteVowels {

	char ch;
	public void deleteVowels(String input)
	{
		
		System.out.print("OUPUT: ");
		for(int i=0;i<input.length();i++)
		{
			ch=input.charAt(i);
			
			if( ch!='a'&&ch!='e'&& ch!='i'&& ch!='o'&&ch!='u'&&ch!=' '&&ch!=',')
			{
				
				System.out.print(ch);
			}
		}
}
}
