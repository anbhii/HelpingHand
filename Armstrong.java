//153=1*1*1+5*5*5+3*3*3

import java.util.*;
class Armstrong
{
  public static void main(String arg[])
   {
         Scanner ob = new Scanner(System.in);
         System.out.println("Enter any number: ");
         int n = ob.nextInt();
         int r,sum=0,temp = n;
         while(n!=0)
          {
             r=n%10;
             n=n/10;
             sum=sum+(r*r*r);
          }
           if(sum==temp)
              System.out.print(temp +" is Armstrong");
           else
               System.out.println(temp +" is not Armstrong");
     }
}