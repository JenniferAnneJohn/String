package ArrayExercise2;

import java.util.Scanner;

public class DeleteConsonantsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DeleteConsonant dc=new DeleteConsonant();
		String input=new String();
		System.out.println("**************** DELETE THE CONSONANTS ****************");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		 input=scan.nextLine();
		
		dc.deleteconsonants(input);
	}

}
