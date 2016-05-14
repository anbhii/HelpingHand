import java.util.*;
class Prime
{
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the number");
	   int n= sc.nextInt();
	   int p=0;
           for(int j=2;j<=n/2;j++)
	     {
	       if(n%j==0)
	        {
	          System.out.println("no. is not prime");
		  p=1;
	          break;
	        }
       	     }
	
	    if(p==0)
       	   System.out.println("no. is prime");
			
	}
}