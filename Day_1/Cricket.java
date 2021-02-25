import java.util.Scanner;
class Cricket
{   static void print_array(int x[],int y,int z)
	{
		int arr[] = new int[y];
		for(int i=1;i<y;i+=2)
		{
			if(x[i]>=z)
			{
				arr[i] = x[i-1];
			}
		}
		for(int j=0;j<y;j++)
		{
			if(arr[j]!=0)
			{
				System.out.println(arr[j]);
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int array[] = new int[size];
		for(int i=0;i<size;i++)
		{
			array[i] = sc.nextInt();
		}
		int score = sc.nextInt();
		print_array(array,size,score);
	}
}