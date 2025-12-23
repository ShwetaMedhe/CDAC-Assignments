import java.util.Date;

public class StudentDemo {

	private int id;
	private String name;
	private float m1;
	private float m2;
	private Date bdate;
	
	public StudentDemo() {
		System.out.println("in default constructor");
		int id=0;
		String name =null;
		float m1=0.0f;
		float m2=0.0f;
		Date bdate=null;
	}

	public StudentDemo(int id, String name, float m1, float m2, Date bdate) {
		System.out.println("in parameterized constructor");
		this.id = id;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.bdate = bdate;
	}

	//setter methods
	public void setID(int id)
	{
		this.id=id;
	}
	public void setName(String s)
	{
		name=s;
	}
	public void setM1(float m1)
	{
		this.m1=m1;
	}
	public void setM2(float m2)
	{
		this.m2=m2;
	}
	public void setDate(Date d)
	{
		bdate=d;
	}
	
	//getter method
	public int getId()
	{
		return id;
	}
	public String getName() {
		return name;
	}
	public float getM1()
	{
		return m1;
	}
	public float getM2()
	{
		return m2;
	}
	public Date getDate()
	{
		return bdate;
	}
	
	public void display()
	{
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("m1 marks: "+m1);
		System.out.println("m2 marks: "+m2);
		System.out.println("bdate is "+bdate);
	}
	
	public String toString()
	{
		System.out.println("to string method");
		return "Id: "+id+"Name: "+name+"M1: "+m1+"M2: "+m2+"Bdate: "+bdate;
	}
	
	public static void main(String [] args)
	{
		StudentDemo s1=new StudentDemo(1,"Shruti",20,25,new Date(2011-1-1));
		StudentDemo s2=new StudentDemo(2,"Shruti",21,25,new Date(2011-1-1));
		System.out.println(s1);
		System.out.println(s2);
	}
	
	
	
}
