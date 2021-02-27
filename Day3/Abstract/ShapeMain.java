import java.util.Scanner;
public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("Enetr the Shape");
         System.out.println("Circle");
         System.out.println("Square");
         String option = sc.nextLine();
         if(option.equals("circle"))
         {
        	 Circle obj = new Circle();
        	 System.out.println("Enter the Radius: ");
        	 int radius = sc.nextInt();
        	 obj.setValue(radius);
        	 double res=obj.calculateArea(radius);
        	 System.out.println("Area of a Circle:"+res);
         }
         else
         {
        	 Square obj = new Square();
        	 System.out.println("Enter the Side: ");
        	 int side = sc.nextInt();
        	 obj.setValue(side);
        	float res =  obj.calculateArea(side);
        	System.out.println("Area of a Squareis:"+res);
         }
         sc.close();
	}

}
