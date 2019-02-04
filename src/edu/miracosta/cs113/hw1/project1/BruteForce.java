package edu.miracosta.cs113.hw1.project1;

public class BruteForce {

	private static int setWeapon, setLocation, setMurderer;

	public static void main(String[] args) {

		AssistantJack jack = new AssistantJack(0);

		int foundWeapon;
		int foundLocation;
		int foundMurderer;

		int checkAnswerCounter = 0;

		for (int murderer = 1; murderer <= TheoryItem.TOTAL_MURDERS; murderer++) {

			for (int location = 1; location <= TheoryItem.TOTAL_LOCATIONS; location++) {

				for (int weapon = 1; weapon <= TheoryItem.TOTAL_WEAPONS; weapon++) {

					int checkAnswer = jack.checkAnswer(weapon, location, murderer);

					if (checkAnswer == 0) {

						setWeapon = weapon;
						setLocation = location;
						setMurderer = murderer;
					}
					else {

						System.out.println("Check Answer = " + checkAnswer);
						checkAnswerCounter++;
					}

//					if (checkAnswer == 1) {
//
//						checkAnswerCounter++;
//
//						System.out.println("Check Answer = " + checkAnswer);
//
//						for (weapon = 1; weapon <= TheoryItem.TOTAL_WEAPONS; weapon++) {
//
//							checkAnswer = jack.checkAnswer(weapon, location, murderer);
//
//							if (checkAnswer == 0) {
//
//								setWeapon = weapon;
//								setMurderer = murderer;
//								setLocation = location;
//
//							} else {
//
//								System.out.println("Check Answer = " + checkAnswer);
//								checkAnswerCounter++;
//							}
//						}
//					} else if (checkAnswer == 2) {
//
//						System.out.println("Check Answer = " + checkAnswer);
//
//						foundWeapon = weapon;
//						foundMurderer = murderer;
//
//						setWeapon = foundWeapon;
//						setMurderer = foundMurderer;
//
//						checkAnswerCounter++;
//
//						for (location = 2; location <= TheoryItem.TOTAL_LOCATIONS; location++) {
//
//							checkAnswer = jack.checkAnswer(foundWeapon, location, foundMurderer);
//
//							if (checkAnswer == 0) {
//
//								setLocation = location;
//
//							} else {
//
//								System.out.println("Check Answer = " + checkAnswer);
//
//								checkAnswerCounter++;
//							}
//						}
//					} else if (checkAnswer == 3) {
//
//						System.out.println("Check Answer = " + checkAnswer);
//
//						checkAnswerCounter++;
//
//						foundWeapon = weapon;
//						foundLocation = location;
//
//						setWeapon = foundWeapon;
//						setLocation = foundLocation;
//
//						for (murderer = 2; murderer <= TheoryItem.TOTAL_MURDERS; murderer++) {
//
//							checkAnswer = jack.checkAnswer(foundWeapon, foundLocation, murderer);
//
//							if (checkAnswer == 0) {
//
//								setMurderer = murderer;
//
//							} else {
//
//								System.out.println("Check Answer = " + checkAnswer);
//
//								checkAnswerCounter++;
//							}
//						}
//					} else {
//
//						setMurderer = murderer;
//						setWeapon = weapon;
//						setLocation = location;
//					}
				}
			}
		}

		System.out.println("\nThe program called 'CheckAnswer' " + checkAnswerCounter + " times\n");

		System.out.println("The correct answer is " +
				TheoryItem.getPersonName(setMurderer) + "," +
				TheoryItem.getLocationName(setLocation) + "," +
				TheoryItem.getWeaponName(setWeapon));

		System.out.println("The correct answer is " +
				setMurderer + "," +
				setLocation + "," +
				setWeapon);



	}
}
