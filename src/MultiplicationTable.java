import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int res = 0;
		
		for(int i = 1; i<=10; i++) {
			res = a * i;
			System.out.println(a+ " * " +i+ " = "+res);
		}

	}

}
