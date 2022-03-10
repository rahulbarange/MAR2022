public class pp1
{
	public static void main (String args[])
	{
		for(int i=1;i<=9;i++)
		{
			for(int k=i;k<9;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			/*for(int l=8;l>=i;l--)
			{
				System.out.print("x");
			}*/System.out.println();
		}
	}
}