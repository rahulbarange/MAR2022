import java.util.*;
class q11
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int p=sc.nextInt();
		int q=sc.nextInt();
		int r=sc.nextInt();
		if(p>=q&&p>=r)
			System.out.println("Largest p="+p);
		else if(q>=r)
			System.out.println("Largest q="+q);
		else
			System.out.println("Largest r="+r);
		
		
	}
}