import java.util.*;
class Arithmetic
{
	public static void main(String [] args)	
{
	int x,y,z;
	Scanner sc= new Scanner(System.in);
        System.out.println("Enter X Value");
        x=sc.nextInt();	
        System.out.println("Enter y Value");
	y=sc.nextInt();
        System.out.println("Enter z Value");
	z=sc.nextInt();
	int M=Arithmetic_Operation(x,y,z);
	if(M==-1)
	{
	System.out.println("Invalid input");
	}
	else
	{
		System.out.println(M);
	}
}
	static int Arithmetic_Operation(int x,int y,int z)
	{
	int K=0; 
	if((x>=32767 || x<0) || (y>=32767 || y<0) || (z>4 || z<0))
	{
		K=-1;
	}
	else
	{
		switch(z)
		{
		case 1:
			K=x+y;
			
			break;
		case 2:
			K=x-y;
			
			break;
		case 3:
			K=x*y;
			
			break;
		case 4:
			K=x/y;
			break;
		}
		
	}
	return K;
	}
}