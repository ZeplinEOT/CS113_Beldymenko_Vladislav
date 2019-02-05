package edu.miracosta.cs113.hw1.project1;

public class BruteForce {

	public static void main(String[] args) {

		AssistantJack jack = new AssistantJack(0);

		// all ints declared
		int checkAnswerCounter = 0;
		int checkAnswer = 1;
		int weapon = 1, location = 1, murderer = 1;
		int setWeapon = 1, setLocation = 1, setMurderer = 1;

		//while loop doesn't stop until the correct set of answers is reached.
		while (checkAnswer != 0) {

			//answer is checked.
			checkAnswer = jack.checkAnswer(weapon, location, murderer);

			System.out.println(murderer + " " + location + " " + weapon + " Start");

			// if checks if answer set is fully correct, and if yes, breaks the loop.
			if (checkAnswer == 0) {

				setWeapon = weapon;
				setLocation = location;
				setMurderer = murderer;

				break;
			} else {

				// checks for error in 1.
				if (checkAnswer == 1) {

					checkAnswerCounter++;
					System.out.println("Check Answer " + checkAnswer);

					weapon++;

					checkAnswer = jack.checkAnswer(weapon, location, murderer);

					if (checkAnswer == 1) {

						checkAnswerCounter++;
						System.out.println("Check Answer " + checkAnswer);

					} else {

						setWeapon = weapon;
						System.out.println("Found weapon!");
					}

					// checks for error in 2.
				} else if (checkAnswer == 2) {

					checkAnswerCounter++;
					System.out.println("Check Answer " + checkAnswer);

					location++;

					checkAnswer = jack.checkAnswer(weapon, location, murderer);

					if (checkAnswer == 2) {

						checkAnswerCounter++;
						System.out.println("Check Answer " + checkAnswer);

					} else {

						setLocation = location;
						System.out.println("Found location!");
					}

					// checks for error in 3.
				} else if (checkAnswer == 3) {

					checkAnswerCounter++;
					System.out.println("Check Answer " + checkAnswer);

					murderer++;

					checkAnswer = jack.checkAnswer(weapon, location, murderer);

					if (checkAnswer == 3) {

						checkAnswerCounter++;
						System.out.println("Check Answer " + checkAnswer);

					} else {

						setMurderer = murderer;
						System.out.println("Found murderer!");
					}

					//third answer check.
				} else {

					setWeapon = weapon;
					setLocation = location;
					setMurderer = murderer;

					break;
				}
			}
		}

		//check answer counter prints the amount of times 'CheckAnswer' was called.
		System.out.println("\nThe program called 'CheckAnswer' " + checkAnswerCounter + " times\n");

		//answer printed as strings.
		System.out.println("The correct answer is " +
				TheoryItem.getPersonName(setMurderer) + "," +
				TheoryItem.getLocationName(setLocation) + "," +
				TheoryItem.getWeaponName(setWeapon));

		//answers printed as integers.
		System.out.println("The correct answer is " +
				setMurderer + "," +
				setLocation + "," +
				setWeapon);



	}
}
