package week1.day3;

public class Primeno {

	public static void main(String[] args) {
		int n=13;
		int  count=0;
		for (int i = 1; i <= n; i++)
		{
	    if (n % i == 0) {
				 count++;
		
			}
		}
			if(count==2)	{			
		
		System.out.println("13 is a prime no");}
			else {
				System.out.println("13 is not a prime no");
			}
		}

	}

