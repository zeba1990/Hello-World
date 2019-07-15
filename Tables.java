import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = obj.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.println(num + " * " + i + " = "+ num*i);
		}
		

	}

}
