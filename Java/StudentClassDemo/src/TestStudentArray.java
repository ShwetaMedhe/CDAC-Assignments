import java.util.Scanner;

public class TestStudentArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
		System.out.println("1. add new student\n2. display all\n3. search by id");
		System.out.println("4. search by name\n5. update marks\n6.exit\nchoice:");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			boolean status=StudentService.addNewStudent();
			if(status) {
				System.out.println("Student added successfuly");
			}else {
				System.out.println("error: Not added");
			}
			
			break;
		case 2:
			StudentService.displayAll();
			break;
		case 3:System.out.println("Enter id:");
		int id=sc.nextInt();
		StudentDemo s=StudentService.findStudentById(id);
		if(s!=null) {
			System.out.println(s);
		}
		else {
			System.out.println("Not found");
		}
			break;
			
			
		case 4: 
		    System.out.println("Enter name for searching");
		    String nm = sc.next();
		    StudentDemo[] sarr = StudentService.findStudentByName(nm);

		    if (sarr != null) {
		        for(StudentDemo s1 : sarr) {
		            System.out.println(s1);
		        }
		    } else {
		        System.out.println("Student(s) with name " + nm + " not found.");
		    }
		    break;
			
			
		case 5:
			System.out.println("Enter id");
			int id1 =sc.nextInt();
			System.out.println("enter m1");
			float m1=sc.nextFloat();
			System.out.println("enter m2");
			float m2 = sc.nextFloat();
			
			boolean status1 = StudentService.updateMarksById(id1,m1,m2);
			if(status1) {
				System.out.println("updated successfully!");
			}else {
				System.out.println("not found!");
			}
			break;
		case 6:
			sc.close();
			System.out.println("Thank you for visiting....");
			break;
		default:
			System.out.println("wrong choice");
			
		}
		}while(choice!=6);

	}

}
