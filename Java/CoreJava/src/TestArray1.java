import java.util.Scanner;
public class TestArray1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int [] arr = new int [size];
		acceptData(arr);
		displayData(arr);
		int sum = addData(arr);
		findMin(arr);
		findMax(arr);
		searchByValue(arr);
		sc.close();
	}
	
	public static int acceptData(int [] arr) {
	Scanner sc = new Scanner(System.in);
	
	{
		System.out.println("Enter data:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	return 0;
	
	}
	
	public static int displayData(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("index "+i+":" + arr[i]);
		}
		return 0;
	}
	
	public static int addData(int [] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum +arr[i];
		}
		System.out.println("Addition is: "+ sum);
		return sum;
	}
	  
	public static int findMin(int [] arr) {
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
			
		}
		System.out.println("Minimum element is:"+ min);
		return min;
	}
	
	public static int findMax(int [] arr) {
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("Maximum element is:"+ max);
		return max;
	}
	
	public static int searchByValue(int [] arr) {
		  Scanner sc = new Scanner (System.in);
		   System.out.println("Enter element for search");
		   int f = sc.nextInt();
		   int pos=0;
		   
		   for(int i=0; i<arr.length;i++) {
			   if(f == arr[i]) {
				   return 1;
			   }
			   //return -1; 
			   if(pos != -1) {
				   System.out.println(f + "found at position: "+pos);
					
				}else {
					System.out.println(f + "not found"+pos );
				}
				//return pos;
		   }
		return pos;
		 
		
	}
	
}


