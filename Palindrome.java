class Palindrome
{
   public static void main(String args[])
        {
           int n=343;
	   int temp=n;
           int r;
           int rev=0;
           while(n!=0) 
              {  
                 r=n%10; 
		 n=n/10; 
                 rev=rev*10+r;  
                 
               }
      if(rev==temp)
         System.out.print("no.is palindrome");
      else
       System.out.print("no.is not palindrome");
       
          }
}