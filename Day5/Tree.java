import java.util.Scanner;
import java.util.TreeSet;
public class Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		TreeSet<String> ts = new TreeSet<String>();
		int size = sc.nextInt();
		for(int i=0;i<size;i++)
		{
			ts.add(sc.next());
		}
		for(String i:ts)
		{
			System.out.println(i);
		}
		

	}

}