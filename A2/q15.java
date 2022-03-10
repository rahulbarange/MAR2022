import java.util.*;
public class q15
{   public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a:");
		int a= sc.nextInt();
		System.out.print("Enter b:");
		int b= sc.nextInt();
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("a="+a+" & b="+b);
	}
}