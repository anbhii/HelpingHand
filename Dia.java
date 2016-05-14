class Dia
  {
    public static void main(String args[])
     { 
       
       for(int i=1;i<=4;i++)
        {
           for(int j=1;j<=4-i;j++)
             {
                System.out.print(" ");
              }
            
            System.out.print("*"); 
           
       for(int k=1;k<=i;k++)
             {
              System.out.print("  ");
             }
               System.out.print("*");
           
           System.out.println();
          }
           for(int i=4;i>1;i--)
	    { 
             for(int j=0;j<4-i;j++)
              {
                System.out.print(" "); 
               }
            
             System.out.print("*");
                 
             for(int k=1;k<=i;k++)
             {
               System.out.print("  ");
              }
               System.out.println("*");
              }
              System.out.println();

             
           
               
       
  }
}