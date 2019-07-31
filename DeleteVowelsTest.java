package ArrayExercise2;

import java.util.Scanner;

public class DeleteVowelsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DeleteVowels dc=new DeleteVowels();
		
		String input=new String();
		System.out.println("**************** DELETE THE VOWELS ****************");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		input=scan.nextLine();
		dc.deleteVowels(input);
	}
}
