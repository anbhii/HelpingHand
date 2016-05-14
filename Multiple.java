class One
{
	public int sum(int a,int b)
	  {
 	     int l= a+b;
	     return l;
	  }

}
class Two extends One
{	
	public int diff(int c,int d)
	 {
	   int j=c-d;
	   return j;
	 }
}
class Multiple extends Two
{	
	public int mul(int i,int k)
	  {
	       int h=i*k;
		return h;
	  }
     public static void main(String args[])
	{
		Multiple obj = new Multiple( );
		obj.mul(5,4);
		obj.diff(3,1);
		obj.sum(6,4);
		System.out.println(l);
		System.out.println(j);
		System.out.println(h);
	}
}