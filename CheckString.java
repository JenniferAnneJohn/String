package exercise1;
import java.util.Scanner;
public class CheckString {

		String cs=new String();
		String check;
		
		public void getInput()
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter your sentence: ");
			cs=scan.nextLine();
			System.out.println("Enter word to check: ");
			check=scan.nextLine();
		}
		
		public void check()
		{
			System.out.println("************* CHECKING A WORD *************");
			
			System.out.println("######### OUTPUT #########");
			
			boolean a=cs.contains(check);
			System.out.print("The word "+check+" is in the given sentence: ");
			System.out.println(a);
			}
	}


