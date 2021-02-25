import java.util.Scanner;
 public class A
 {
     static int calc_count(int x[],int y,int z)
     {   int count=0;
         for(int i=0;i<y;i++)
         {
             if(x[i]==z)
             {
                 count++;
             }
         }
         return count;
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
         int element = sc.nextInt();
         int value = calc_count(array,size,element);
         System.out.println(value);
     }
 }