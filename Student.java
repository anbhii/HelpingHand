package Stu;

public class Student
{  
   public String name;
   public int rolln;
   public String cls;
   public Student(String name,int rolln,String cls)
	{
	   this.name=name;
	   this.rolln=rolln;
	   this.cls=cls;
	}
  public void display(String name,int rolln,String cls)
	{
	   System.out.println("name is "+name);
	   System.out.println("rollno.is "+rolln);
           System.out.println("Class  is "+cls);
	}
}