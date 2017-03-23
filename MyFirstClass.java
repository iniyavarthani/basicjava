package lesson1;

import java.util.Scanner;

public class MyFirstClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the name");
		String name = scan.next();
		System.out.println("enter the roll.no");
		int roll_no =scan.nextInt();
		System.out.println("enter the salary");
		double salary=scan.nextDouble();
		System.out.println("name:"+name+ "roll.no:"+roll_no+ "salary:"+salary);
		
		
		
		// TODO Auto-generated method stub

	}

}
