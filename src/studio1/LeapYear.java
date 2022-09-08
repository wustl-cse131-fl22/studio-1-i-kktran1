package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("What year? ");
		int year = in.nextInt();
		int modu = year%4;
		int hundred = year%100;
		int hundredfour = year%400;
		boolean leapYear = ((modu == 0) && !(hundred == 0)) || (hundredfour == 0);
		System.out.println(leapYear);
	}

}
