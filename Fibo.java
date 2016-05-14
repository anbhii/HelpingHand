//to display sum of fibo series
class Fibo
{
   void calc()
     { 
       int i=0;
       int j=1;
       int count=12;
	int sum=0;
       System.out.println(i);
	  System.out.println(j);
         for(i=0;i<=count;i++)
           {
             sum=i+j;
	System.out.println(sum);
             i=j;
             j=sum;
	//System.out.println(sum);
        }
}
public static void main(String args[])
 {
    Fibo obj=new Fibo();
     obj.calc();
  }
}
             