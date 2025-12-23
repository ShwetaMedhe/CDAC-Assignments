import com.demo.exceptions.NegativeSalaryException;
import com.demo.service.MyService;

public class TestExceptionDemo {
	public static void main (String[]args) {
		MyService ms =new MyService();
		try {
			ms.accept();
		} catch(NegativeSalaryException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
