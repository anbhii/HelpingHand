class StaticVal
{

	public static int a=0;
	public static void main(String[] args)
	{
		StaticVal sv=new StaticVal();
		sv.abc();
		sv.abc();
	}
	
		void abc()
		{
			a++;
			System.out.println(a);
		}
	
}