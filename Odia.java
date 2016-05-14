//Sum of opp. diagnl

class Odia
	{ 
	  
          public static void main(String args[])
	    {
	      int Sum=0;
              int [][] n = { {3,5,8}, 
			     {8,5,6,}, 	
			     {2,8,6,} };
               
	      for(int i=0;i<1;i++)
		{
		   for(int j=2;j>=0;j--)
		     {
			Sum=Sum+ n[i][j];
			i++;
		      }
		        System.out.print(Sum);
		      
                   System.out.println();
		}
	     }
          }