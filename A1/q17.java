import java.util.*;
class q17
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int n=sc.nextInt();
		int temp=n;
		int rem,rev=0,sum=0;
		while(n!=0)
		{
			rem=n%10;
			
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==temp)
	    System.out.println("palindrome");
	else
		 System.out.println("not palindrome");
		
	}
}
