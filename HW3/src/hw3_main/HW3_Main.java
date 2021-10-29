package hw3_main;

import java.util.Scanner;

import components.Elevator;

public class HW3_Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Elevator elv = new Elevator();

		System.out.println("Current Floor is " + elv.getCurrentFloor());

		System.out.println("Enter destination Floor: (0 to 10):");

		int destFloor = in.nextInt();
		in.close();
		
		elv.setDestFloor(destFloor);

		System.out.println("-------------------------------------------");

		

	}

}
