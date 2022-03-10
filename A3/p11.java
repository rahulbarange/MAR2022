public class p11
{
   public static void main(String args[])
   {
	   for(int i=1;i<=5;i++)
	   {
		   for(int k=i;k<5;k++)
		   {
			   System.out.print(" ");
		   }
	       for(int j=1;j<=i;j++)
		   {
				System.out.print("x");
		   }
		   for(int l=1;l<=i-1;l++)
		   {
			   System.out.print("x");
		   }System.out.println();
	   }
   }
}