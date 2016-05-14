class desc
  {
   public static void main(String args[])
     {
         int[] a={45,52,85,65,42,58};
         int temp=0;
       
	  for(int i=0;i<a.length;i++)
	   {
 	     for(int j=i+1;j<a.length;j++)
              {
		      if (a[i] < a[j]) //asce (a[i]>a[j])
                       {
                          temp = a[i];
                          a[i] = a[j];
                          a[j]=temp;
	               }
	       } 
  	     System.out.println(a[i]);
	   }  
	}
}