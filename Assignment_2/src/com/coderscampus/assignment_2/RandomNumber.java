package com.coderscampus.assignment_2;
import java.util.Scanner;

public class RandomNumber {
	void rand() {
		int min_num = 1;
		int max_num = 100;
		int random_int = (int) Math.floor(Math.random() * (max_num - min_num + 1) + min_num);
		//		System.out.println(random_int);

//		System.out.println("What is your first guess? ");
//		Scanner user_scanner = new Scanner(System.in); // accept input from user
//		String user_input = user_scanner.nextLine();
//		int input = Integer.parseInt(user_input); // convert string to integer

		int count = 5;
		while (count >= 0) {
			System.out.println("What is your first guess? ");
			Scanner user_scanner = new Scanner(System.in); // accept input from user
			String user_input = user_scanner.nextLine();
			int input = Integer.parseInt(user_input); // convert string to integer
			if (random_int != input) {
				System.out.printf("Try again, but remember you only have %d tries left! ", count).println();

				System.out.println("What is your next guess? ");
				user_scanner = new Scanner(System.in); // accept input from user
				user_input = user_scanner.nextLine();
			}

			else if (random_int == input) {
				System.out.println("You won the game! ");
				count = 0;

			}
			count--;
			user_scanner.close();
		}

	}

}
