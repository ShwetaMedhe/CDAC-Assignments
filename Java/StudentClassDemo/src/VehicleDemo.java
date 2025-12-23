import java.util.Date;

public class VehicleDemo {
	private int vid;
	private String ownername;
	private String vehicletype;
	private Date dateofpurchased;
	
	//default constructor
	public VehicleDemo() {
		System.out.println("Default constructor is called");
		int vid = 0;
		String ownername = null;
		String vehicletype = null;
		Date dateofpurchased = null;
	}
	
	//parameterized constructor
	public VehicleDemo(int vid, String nm, String vtype, Date dop) {
		System.out.println("Parameterized constructor is called");
		this.vid=vid;
		ownername=nm;
		vehicletype=vtype;
		dateofpurchased=dop;
	}

	//setter method
	public void setVid(int vid) {
		this.vid = vid;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

	public void setVehicletype(String vehicletype) {
		this.vehicletype = vehicletype;
	}

	public void setDateofpurchased(Date dateofpurchased) {
		this.dateofpurchased = dateofpurchased;
	}
	
	//getter method
	public int getVid() {
		return vid;
	}

	public String getOwnername() {
		return ownername;
	}

	public String getVehicletype() {
		return vehicletype;
	}

	public Date getDateofpurchased() {
		return dateofpurchased;
	}
	
	public void display() 
	{
	  System.out.println("VID is:"+ vid);	
	  System.out.println("OwnerName is:"+ ownername);	
	  System.out.println("VehicleType is:"+ vehicletype);	
	  System.out.println("DateOfPurchased is:"+ dateofpurchased);	
	}
	
	public String toString() {
		System.out.println("toString method is called");
		return "VID:"+vid+"OwnerName:"+ownername+"VehicleType"+vehicletype+"DateOfPurchased"+dateofpurchased;
	}
	
	public static void main (String [] args) {
		VehicleDemo v1 = new VehicleDemo(1,"Shweta","4wheeler", new Date(2004-7-21));
		VehicleDemo v2 = new VehicleDemo(2,"Shruti","4wheeler", new Date(2005-8-12));
		
		System.out.println(v1);
		System.out.println(v2);
		
	}
	
	
	
	
	
	
	

}


