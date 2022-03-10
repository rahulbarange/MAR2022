import java.util.*;
class armstrong
{
	public static void main(String args[])
	{
		int r,sum=0;
		Scanner sc=new Scanner(System.in);
		int n  = sc.nextInt();
		int temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("Armstrong");
		else
			System.out.println("Not armstrong");
		
	}
}