import java.util.Scanner;

public class InningsMain
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Innings obj = new Innings();
		System.out.println("Enter Player Name: ");
		String name = sc.nextLine();
		obj.setTeammate(name);
		System.out.println("Enter Session: ");
		String session = sc.nextLine();
		obj.setInningname(session);
		System.out.println("Enter runs: ");
		int num = sc.nextInt();
		obj.setRuns(num);
		obj.display();
		
	}
}