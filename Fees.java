package Fee;
import Stu.Student;

public class Fees extends Student
{
 public   int hfees;
 public   int tfees;
 public   Fees(int hfee,int tfee)
	{
	   this.hfees=hfee;
	   this.tfees=tfee;
	}
 public void display(String name,int rolln,String cls,int hfee,int tfee)
	{  
	   super.display(String name,int rolln,String cls);
	   System.out.println("hostel fee is "+hfee);
	   System.out.println("tuition fee is  "+tfee);
	}
}