class Fibo
	{
	  public int[] fib()
	 {

	  int[] n=new int[10];
	  int a=0;
	  int b=1;
	  System.out.println(a);
	  System.out.println(b);
	  for(int i=0;i<10;i++)
	    {
		n[i]=a+b;
		System.out.println(n[i]);
		a=b;
		b=n[i];
		
	    }
		return n;
	}
       }
class Fibbo extends Fibo
{
	public static void main(String args[])
	{

	 int sum=0,j;
	  Fibbo obj=new Fibbo();
	  int[] c=obj.fib();
	  for(j=0;j<10;j++)
	    {
		sum=sum+c[j];
	    }
	 System.out.println("Sum " + sum);
	}
}
		
	  