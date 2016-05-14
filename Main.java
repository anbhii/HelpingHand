package mainn;
import marks.Markss;
import java.util.Scanner;

class Main extends Markss
{
  public static void main(String args[])
	{
          Scanner sc= new Scanner (System.in);
	  System.out.println("Enter your name");
	  String nme= sc.next();
	   System.out.println(" enter rollno.");
	  int rll=sc.nextInt();
           System.out.println("Enter your Class");
	  String clsss=sc.next();
	  System.out.println("Enter the Marks in Chem is");
	  int chem=sc.nextInt();
	   System.out.println("Enter the Marks in Phy is");
           int phy=sc.nextInt();
	System.out.println("Enter your hostel fee is ");
          int hstl=sc.nextInt();
	   System.out.println("Enter your tuition fee is  ");
	  int tui=sc.nextInt();

	 Main mn=new Main();
         mn.display(String nme,int rll,String clsss,int hstl,int tui,int chem,int phy);

	}
}