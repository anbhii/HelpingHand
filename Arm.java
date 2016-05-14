class Arm
{
   public static void main(String arg[])
      {      
         Scanner ob = new Scanner(System.in);
         System.out.println("Enter upto which you want Armstrong no.");
         int count=ob.nextInt();
         for(int i=1;i<count;i++)
           {  
	       int n=i;
	       int r,s=0;
	       while(n!=0)
		  {
                     r=n%10;
		     s=s+(r*r*r*r*r*r);
                     n=n/10;
                  }
               if(s==i)
                System.out.println(i);
           }
      }
}