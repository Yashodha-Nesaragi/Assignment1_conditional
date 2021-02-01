package assignment1week1;
import java.util.Scanner;

public class sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,count=0;
		System.out.println("Enter a number : ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		while(num != 0)
		{
			count = num % 10;
			num = num/10;
			sum = sum + count;
		}
		System.out.println("The sum of digits id "+sum);
		input.close();

	}

}
