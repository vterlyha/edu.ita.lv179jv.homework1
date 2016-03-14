package edu.ita.lv179jv.homework1;

import java.util.Scanner;

import date100316.HomeworkKrokhmalyuk;
import edu.ita.Lv179jv.HomeworkVarvariuk;
import edu.ita.lv179jv.homeworkTerlyha.HomeworkTerlyha;
import edu.softservinc.Lv179jv.hwpetryk.HomeWorkPetryk;
import ua.dorab.Task323;
import ua.dorab.Task559;
import ua.dorab.Task87;

public class Main {

	public static void main(String[] args) {

		System.out.println("Hello");
		while (true) {
			menu();
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			String choise = sc.nextLine();
			switch (choise) {
			case "0":
				System.exit(0);
			case "1":
				System.out.println("In the array of natural numbers, with legth N, please find"
						+ "a natural number that is dividet to 5 and " + "not didvided to 7 at the same time");
				HomeWorkPetryk.solveExercise182();
				System.out.println("----------------------------------------------------------");
				break;

			case "2":
				System.out.println("You enter the natural number 'N'. "
						+ "Find all natural numbers that are smaller and reversly simple with N");
				HomeWorkPetryk.solveExercise323();
				System.out.println("----------------------------------------------------------");
				break;

			case "3":
				System.out.println("Find all friendly numbers in range from 200 to 300");
				HomeWorkPetryk.solveExercise560();
				System.out.println("----------------------------------------------------------");
				break;

			case "10":
			    System.out.println("Find the smallest number of format 2^r that is bigger than given natural number");
				HomeworkTerlyha.solveExcercise108();
				System.out.println("----------------------------------------------------------");
				break;

			case "11":
			    System.out.println("Find simple dividers of given natural number");
				HomeworkTerlyha.solveExcercise325();
				System.out.println("----------------------------------------------------------");
				break;

			case "12":
			    System.out.println("Find all natural numbers, that coincide with last numbers of its squares");
				HomeworkTerlyha.solveExcercise561();
				System.out.println("----------------------------------------------------------");
				break;

			case "7":
				HomeworkKrokhmalyuk.function178D();
				System.out.println("----------------------------------------------------------");
				break;

			case "8":
				HomeworkKrokhmalyuk.function178G();
				System.out.println("----------------------------------------------------------");
				break;
			case "9":
				HomeworkKrokhmalyuk.function555();
				System.out.println("----------------------------------------------------------");
				break;

			case "13":
				HomeworkVarvariuk.solveExercise86a();
				System.out.println("----------------------------------------------------------");
				break;

			case "14":
				HomeworkVarvariuk.solveExercise86b();
				System.out.println("----------------------------------------------------------");
				break;

			case "15":
				HomeworkVarvariuk.solveExercise330();
				System.out.println("----------------------------------------------------------");
				break;

			case "16":
				Task87.main(args);
				System.out.println("----------------------------------------------------------");
				break;

			case "17":
				System.out.println("You enter the natural number 'N'. "
						+ "Find all natural numbers that are smaller and reversly simple with N");
				Task323.main(args);
				System.out.println("----------------------------------------------------------");
				break;

			case "18":
				Task559.main(args);
				System.out.println("----------------------------------------------------------");
				break;

			default:
				System.out.println("You choose non-existed operation. " + "Plese, try again. "
						+ "Remember, only int data is allowed");
				break;
			}

		}

	}

	private static void menu() {
		System.out.println("Choose the Exercise You want to solve");
		System.out.println("0 for exit");
		System.out.println("1 for Exercise No. 182"); // Petryk
		System.out.println("2 for Exrecise No. 323");
		System.out.println("3 for Exrecise No. 560");
		System.out.println("4 for Exrecise No. XXX"); // ???
		System.out.println("5 for Exrecise No. XXX");
		System.out.println("6 for Exrecise No. XXX");
		System.out.println("7 for Exrecise No. 178.1"); // Krokhmalyuk
		System.out.println("8 for Exrecise No. 178.2");
		System.out.println("9 for Exrecise No. 555");
		System.out.println("10 for Exrecise No. XXX"); // Terlyha
		System.out.println("11 for Exrecise No. XXX");
		System.out.println("12 for Exrecise No. XXX");
		System.out.println("13 for Exrecise No. 81a"); // Varvariuk
		System.out.println("14 for Exrecise No. 81b");
		System.out.println("15 for Exrecise No. 330");
		System.out.println("16 for Exrecise No. 87"); // Bondar
		System.out.println("17 for Exrecise No. 323(Bondar)");
		System.out.println("18 for Exrecise No. 559");
	}

}
