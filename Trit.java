class Trit
    {
      public static void main(String args[])
	{
	    int[][] a={ {2,3,4}, {8,6,7},{7,5,6} };

	    for(int i=0;i<3;i++)
		{
		  for(int k=0;k<3-i;k++)
		   {
		  System.out.print(" ");
		   }
		  for(int j=i;j>=0;j--)
                   {
		   System.out.print(a[i][j]);
		   }
 		  	
		System.out.println();
	        }
	}
}