import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StudentService {
   static StudentDemo[] studarr;
   static int cnt;
   static {
	   studarr=new StudentDemo[100];
	   studarr[0]=new StudentDemo(12,"Rajan",98,97,new Date(2000-11-11));
	   studarr[1]=new StudentDemo(13,"Atharva",98,97,new Date(1997-11-11));
	   studarr[2]=new StudentDemo(12,"Ashu",98,97,new Date(1997-11-11));
	   cnt=3;
   }
public static boolean addNewStudent() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter id");
	int sid=sc.nextInt();
	sc.nextLine();
	System.out.println("enter name");
	String nm=sc.nextLine();
	System.out.println("enter marks1");
	float m1=sc.nextFloat();
	System.out.println("enter marks2");
	float m2=sc.nextFloat();
	System.out.println("enter birth date(dd/mm/yyyy)");
	String dt=sc.next();
	//conver string to java date
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	Date bdt=null;
	try {
		bdt=sdf.parse(dt);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	StudentDemo s=new StudentDemo(sid,nm,m1,m2,bdt);
	if(cnt==studarr.length) {
		return false;
	}else {
		studarr[cnt]=s;
		cnt++;
		return true;
	}
	
}
public static void displayAll() {
	/*for(Student s:studarr) {
		if(s==null)
			break;
		else
			System.out.println(s);
	}*/
	for(int i=0;i<cnt;i++) {
		System.out.println(studarr[i]);
	}
	
	
}
public static StudentDemo findStudentById(int id)
{
	for(int i=0;i<cnt;i++)
	{
		if(studarr[i].getId()==id)
			return studarr[i];
	}
	return null;
}


public static StudentDemo[] findStudentByName(String nm) {
    StudentDemo [] stemp = new StudentDemo [cnt];
    int i = 0;
    
    for(int j = 0; j < cnt; j++) {
        if(studarr[j].getName().equals(nm)) {
            stemp[i] = studarr[j];
            i++;
        }
    }
    if (i > 0) {
        
        StudentDemo[] result = new StudentDemo[i];
        System.arraycopy(stemp, 0, result, 0, i);
        return result;
    }
    
    return null;
}
public static boolean updateMarksById(int id, float m1, float m2) {
	StudentDemo s = findStudentById(id);
	if(s != null) {
		s.setM1(m1);
		s.setM2(m1);
	
	return true;
}
return false;
}



}
