public class ipp6
{
	public static void main (String args[])
	{
		for(int i=1;i<=9;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=9;j++)
			{
				System.out.print("* ");
			}
			/*for(int l=i;l<=9;l++)
			{
				System.out.print("*");
			}*/
			System.out.println();
		}
	}
}