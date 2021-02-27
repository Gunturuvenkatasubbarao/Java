import java.util.*;
public class MacthMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Match Format: ");
		System.out.println("1.ODI");
		System.out.println("2.TEST");
		System.out.println("3.T20");
		int choice = sc.nextInt();
		System.out.println("Enter Current Score:");
		int current_score = sc.nextInt();
		System.out.println("Enter Current Over: ");
		int current_over = sc.nextInt();
		System.out.println("Enter Target: ");
		int target = sc.nextInt();
		if(choice==1)
		{
			ODIMatch obj = new ODIMatch();
			obj.setCurrent_over(current_over);
			obj.setCurrent_score(current_score);
			obj.setTarget(target);
			int balls = obj.calculateBalls();
			float runrate = obj.calculateRunRate();
			obj.display((double)runrate, balls);
			
		}
		else if(choice==2)
		{
			TestMatch obj = new TestMatch();
			obj.setCurrent_over(current_over);
			obj.setCurrent_score(current_score);
			obj.setTarget(target);
			int balls = obj.calculateBalls();
			float runrate = obj.calculateRunRate();
			obj.display((double)runrate, balls);
			
		}
		else
		{
			T20Match obj = new T20Match();
			obj.setCurrent_over(current_over);
			obj.setCurrent_score(current_score);
			obj.setTarget(target);
			int balls = obj.calculateBalls();
			float runrate = obj.calculateRunRate();
			obj.display((double)runrate, balls);
			
		}
		
		sc.close();

	}



}
