class One
{
	public int sum(int a,int b)
	  {
 	    int c= a+b;
	  }

}
class Two extends One
{
	public int diff(int c,int d)
	 {
	   int j=c-d;
	 }
}
class Multiple extends Two
{
	public int mul(int i,int k)
	  {
	     int h=c*d;
	  }
     public static void main(String args[])
	{
		Multiple obj = new Multiple( );
		obj.mul(5,4);
		obj.diff(3,1);
		obj.sum(6,4);
	}
}