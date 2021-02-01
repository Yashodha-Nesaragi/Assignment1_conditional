package assignment1week1;
import java.util.Scanner;


public class cubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("Enter a range:");
		 Scanner s = new Scanner(System.in);
		 int N=s.nextInt();
		for (int i = 1; i <= N; i++) {

			int cube = i * i * i;

			System.out.print(cube + " ");
	}

}
}