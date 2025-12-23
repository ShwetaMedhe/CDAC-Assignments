public class PrimeDemo{
public static boolean isPrime(int num)
{
	for(int i=2;i<num;i++){
		if(num%i==0)
		{
			return false;
		}
		
	}
	return true;
}

public static void main(String [] args)
{
	
	if (isPrime(Integer.parseInt(args[0]))){
	System.out.println("Number is Prime"+args[0]);
	}
	else
	{
	System.out.println("Not Prime"+args[0]);
	}
}
}