import java.util.Scanner;


public class EmployeeMain
{
	public static void main(String args[])
	{
		Employee obj = new Employee();
		obj.setName("Subbarao");
		obj.setAddress("Martur");
		obj.setMobile("6580964571");
		System.out.println(obj.getName());
		System.out.println(obj.getAddress());
		System.out.println(obj.getMobile());
	}
}
