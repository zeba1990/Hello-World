import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number");
		int num =obj.nextInt();
		int fact = 1;
		
		for(int i= num; i>=1; i--){
		    fact *= i;
		  }
		System.out.println(fact);

	}

}
