class Transpose
    {
      public static void main(String args[])
	{
	    int[][] a={ {2,3,4}, {8,6,7},{7,5,6} };
             int[][] c =new int[3][3];

	    for(int i=0;i<3;i++)
		{
		  for(int j=0;j<3;j++)
                   {
                     c[i][j]=a[j][i];
		   System.out.print("  "+c[i][j]);
		   }
		System.out.println();
	        }
}
}