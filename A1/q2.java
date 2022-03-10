import java.util.*;
public class q2
{
   public static void main(String args[])
   {  Scanner sc = new Scanner(System.in);
      int n=sc.nextInt(),fact=1;
    for(int i=n;i<=1;i++)
	{
		
		fact=fact*i;
	}
	   System.out.println("Factorial of "+n+" is "+fact);
   }
}

