package assignment1week1;

public class primebetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=10;i<=99;i++)
		{
			int counter = 0;
			for(int j = i; j>= 1 ; j--)
			{
				if(i % j == 0)
					counter++;
			}
			
			if(counter == 2)
				{
					System.out.print(i);
					System.out.print(" ");
				}	
		}
		

	}

}
