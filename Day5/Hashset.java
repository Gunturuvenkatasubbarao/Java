import java.util.HashSet;
import java.util.Scanner;
public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for(int i=0;i<size;i++)
		{
			hs.add(sc.next());
		}
		System.out.println(hs.size());

	}

}