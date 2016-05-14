package marks;
import fee.Fees;

public class Markss extends Fees
{
public	int chem;
public	int phy;
public   Marks(int chems,int phys)
	{
	   this.chem=chems;
           this.phy=phys;
	}
 public  void display(String name,int rolln,String cls,int hfee,int tfee,int chems,int phys)
	{ 
           super.display(String name,int rolln,String cls,int hfee,int tfee);
	   System.out.println("Marks in Chem is "+chems);
	   System.out.println("Marks in Phy is"+phys);
           
	}
}