public class p7
{
	public static void main(String args[])
	{   int a=1;
		
	
		for(int i=1;i<=5;i++)
		{   
	        for(int k=i;k<=4;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{   
				System.out.print(j+" ");
				
				
			}
			System.out.println();
		}
		//Alternate method
		/*for(int i=1;i<=5;i++)
		{   
	        for(int k=1;k>=1&&k<=5-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=5;j>=6-i&&j<=5;j--)
			{
				System.out.print(a+" ");
				a++;
				
			}a=1;
			System.out.println();
		}*/
	}
}
