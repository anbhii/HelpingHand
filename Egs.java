//Thread

class Eg extends Thread
{
    public void run()
      {
	try
	   {
             for(int i=1;i<10;i++)
                {
	           System.out.println(i);
	           sleep(1000);
	          }
	   }
		catch(Exception e)
		    {
		    
			}
		
	    }
}
class Egg extends Thread
{
 public void run()
      {
       	for(int j=1;j<100;j++)
           {
	     System.out.println(j);
	       try
		  {
		    sleep(100);
		  }
		catch(Exception e)
		  {
			
		  }
	    }
	}
}
	
class Egs
 {
   public static void main(String args[])
      {
	Eg e=new Eg();
	Egg e1=new Egg();
	e.start();
	e1.start();
	}
 }	