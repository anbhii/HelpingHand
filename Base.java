
interface Series
   {
	int [] oddseries();
	int [] evenseries();
	int [] primeseries();
	
   }
interface SumS extends Series
   {
	int oddsum(int a[]);
	int evensum(int a[]);
	int primesum(int a[]);
   }

class Base implements SumS
   {   

	 int [] x={3,2,35,8,11,62,12,81,32};
	
      public int [] oddseries()
	{
	int[] sum=new int[8];
	System.out.println("Odd series");
	 for(int i=0;i<9;i++)
	   {
	    if(x[i]%2!=0)
		{
	           System.out.println(x[i]);
		    sum[i]=x[i];
		}
	   }
	return sum;
	
	}
	public int oddsum(int a[])
	{
		 int Sum=0;
		for(int i:a)
		{
	    	  Sum= Sum+i;
		}
	  System.out.println("Sum of Odd Series "+ Sum);
		return Sum;
	}

      public int [] evenseries()
	{
	int[] sum=new int[9];
	System.out.println("Even Series");
	 for(int i=0;i<9;i++)
	   {
	    if(x[i]%2==0)
		{
	       System.out.println(x[i]);
		sum[i]=x[i];
		}
	   }
	return sum;
	
	}

	public int evensum(int a[])
	{ 
		int Sum=0;
		for(int i:a)
		{
	          Sum= Sum+i;
		}
	  System.out.println("Sum of Even Series "+ Sum);
	    return Sum;
	}
      public int [] primeseries()
	{
	  int[] sum=new int[8];
	   int p=0;
	System.out.println("Prime series");
	 for(int i=0;i<9;i++)
	   {
		for(int j=2;j<=x[i]/2;j++)
	          {
		     if(x[i]%j==0)
			{
			    p=1;
			    break;
			}
		  }
		if(p==0)
		  {
	             System.out.println(x[i]);
		      sum[i]=x[i];
		  }
	   }
	return sum;
	
	}
	public int primesum(int a[])
	{ int Sum=0;
		for(int i:a)
		{
	          Sum= Sum+i;
		}
	  System.out.println("Sum of Prime Series "+ Sum);
	return Sum;
	}
  
        public static void main(String args[])
	  {
		Base b=new Base();
		int []ar=b.oddseries();
		b.oddsum(ar);
		int []arr=b.evenseries();
		b.evensum(arr);
		int []array=b.primeseries();
		b.primesum(array);
	}
}
