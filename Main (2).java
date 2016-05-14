abstract class Area
{
	abstract void calc_area();

	abstract void calc_vol();
	void show()
	{
		System.out.println("Sho");
	}
	
}

class Circle extends Area
{
	void calc_area()
	  {
		int a=5;
		double ar= 3.14*a*a;
		System.out.println(ar);
	}
	void calc_vol()
	{
		System.out.println("vol");
	}
}
class Main
{
	public static void main(String args[])
	{
		Area arr=new Circle();
		arr.calc_area();
		arr.calc_vol();
		arr.show();
	}
}