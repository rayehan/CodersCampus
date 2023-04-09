package com.coderscampus.assignment_2;
import java.util.Scanner;

public class RandomNumber {
	void rand() {
		int min_num = 1;
		int max_num = 100;
		int random_int = (int) Math.floor(Math.random() * (max_num - min_num + 1) + min_num);
		//		System.out.println(random_int);

		System.out.println("What is your guess? ");
		Scanner user_scanner = new Scanner(System.in); // accept input from user
		String user_input = user_scanner.nextLine();
		int input = Integer.parseInt(user_input); // convert string to integer

		int count = 1;
		while (count <= 5) {
			if (random_int != input) {
				System.out.println("Try again, but remember you only have four tries left! ");

				System.out.println("What is your next guess? ");
				user_scanner = new Scanner(System.in); // accept input from user
				user_input = user_scanner.nextLine();
			}

			else if (random_int == input) {
				System.out.println("You won the game! ");
				count = 6;

			}
			count++;
		}
		user_scanner.close();
	}

}
