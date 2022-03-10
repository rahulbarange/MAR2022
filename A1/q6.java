import java.util.*;
public class q6
{
   public static void main(String args[])
   {   int i;
       for(i=1;i!=0;i++){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number:");
	   int a= sc.nextInt();
	   if (a % 400 == 0||a % 4 == 0&& a % 100 != 0)		// a%4==0 )
       System.out.println(+a+" is leap year");
      
       else
       System.out.println(+a+" is not leap year");
	   }
   }
}

