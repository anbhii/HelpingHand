class Diamond
{
  public static void main(String args[])
       {
          int noofcols=1;
          {
              for(int i=1;i<=7;i++)
                   {
                        for(int j=1;j<=noofcols;j++)
                          {
                            System.out.print("*");
                           }
                       System.out.println();
                      if(i<4)
                         noofcols=noofcols+2;
                      else 
                         noofcols=noofcols-2;
                       }  
                
                        
                    }
            }
}








 for (int i = 1; i <= n; i++)
            {
                  for (int j = 0; j < (n - i); j++)
                        System.out.print(" ");
                  for (int j = 1; j <= i; j++)
                        System.out.print("*");
                  for (int k = 1; k < i; k++)
                        System.out.print("*");
                  System.out.println();
            }
 
            for (int i = n - 1; i >= 1; i--)
            {
                  for (int j = 0; j < (n - i); j++)
                        System.out.print(" ");
                  for (int j = 1; j <= i; j++)
                        System.out.print("*");
                  for (int k = 1; k < i; k++)
                        System.out.print("*");
                  System.out.println();
            }
 
            System.out.println();
      }