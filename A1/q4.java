import java.util.*;
public class q4
{
   public static void main(String args[])
   {   int a=20,b=3;
       /*a=a+b;
	   b=a-b;
	   a=a-b;*/
	   b=a+b-(a=b);
	   System.out.println("a="+a);
	   System.out.println("b="+b);
   }
}

