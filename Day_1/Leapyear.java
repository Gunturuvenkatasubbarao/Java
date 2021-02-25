import java.util.*;
import java.io.*;
 class Leapyear
 {

    
     public static void main(String []args)
     {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        Leapyear obj = new Leapyear();
        if(year<0)
        {
            System.out.println("Invalid");
        }
        else
        {
            int x=obj.calc_year(year);
            if(x==1)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
        
     }
      public int calc_year(int x)
     {
         if(x%4==0 || x%400==0)
         {
             return 1;
         }
         return 0;
     }
}