public class p13
{
	public static void main(String args[])
	{   char a=65;
		for(int i=1;i<=5;i++)
		{
			for(int k=i;k<=4;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print((a)+" ");
			}
			a++;
			System.out.println();
		}
	}
}