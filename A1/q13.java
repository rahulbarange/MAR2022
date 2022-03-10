import java.util.*;
class q13
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int n=sc.nextInt();
		int rem,rev=0,sum=0;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+rem;
			rev=rev*10+rem;
			n=n/10;
		}
	    System.out.println("reversed= "+rev);
		System.out.println("sum= "+sum);
	}
}
