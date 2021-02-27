
public class T20Match extends Match{
	public  float calculateRunRate()
	   {
		   float runrate = ((float)getTarget()-(float)getCurrent_score())/((float)calculateBalls()/6);
		   return runrate;
	   }
	   public int calculateBalls()
	   {
		   int rem = (int)((20*6)-(getCurrent_over()*6));
		   return rem;
	   }
	   public void display(double reqRunrate, int balls)
	   
	   {
		   final int runs = getTarget()-getCurrent_score();
		   System.out.println("Need "+runs+" "+"in"+" "+balls+" "+"balls");
		   System.out.println("Required run rate is : "+reqRunrate);
	   }
}
