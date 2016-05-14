class Evfac
{	
	int[] c={5,10,2,25,24,20,16};	
	int count=0;
	public int[] even()
	 {
	      	System.out.println("Series of Even no.");
	    	for(int j:c)
		{
	        	if(j%2==0)
			{	
				count++;
				System.out.print(" "+j);
				
			}
		 
			
		}
		System.out.println();
		 System.out.println(count);
		int[] even=new int[count];
		for(int i=0;i<even.length;i++)
		{   
		     if(c[i]%2==0)
			  {
			     even[i]=c[i];
	                  }
		      else
			continue;
					
			System.out.print(" "+even[i]);
		}
		
		System.out.println();
		return even;
	  }
  	 public static void main(String args[])
	  {    
		int fact=1;		
		Evfac obj=new Evfac();
		int[] m=obj.even(); 
	     for(int k:m)
	      {
		if(k%4==0)
                 
		   for(int n=k;n>=1;n--)
		   {
		    fact=fact*n;
		   }
		    System.out.println("factorial of "+k+" ="+fact);
	           
	         
	      }
	   }
      }