package assignment1week1;

public class specificdivisors {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int count = 0,n=30;
		System.out.println("First 5 values divisible by 2,3 & 5 are : ");
		while(count != 5)
		{
			if(n%2 == 0)
			{
				if(n%3 == 0)
				{
					if(n%5 == 0)
					{
						System.out.print(n + " ");
						count++;
						n++;
					}	
					else
						n++;
				}
				else 
					n++;
			}
			else 
				n++;
		}
	           

}
}
