package arraylisttask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListTester {
	static Scanner scan = new Scanner(System.in);

	public int toCheckInt() {
		boolean condition = true;
		int option = 0;
		while (condition) {
			if (scan.hasNextInt()) {
				option = scan.nextInt();
				scan.nextLine();
				condition = false;
			} else {
				System.out.println("enter a valin integer");
				scan.next();
			}
		}
		return option;
	}

	public static void main(String[] args) {
		ArrayListTask helperObj = new ArrayListTask();
		ArrayListTester testerObj = new ArrayListTester();
		String carryOn = "";
		do {
			System.out.println("ENTER THE QUESTION NO :: ");
			int question = testerObj.toCheckInt();

			try {
				switch (question) {
				case 1: {
					List given = helperObj.getAList();
					int length = helperObj.getLengthList(given);
					System.out.println("the length of the arraylist " + given + " is ::" + length);
					break;
				}
				case 2: {
					List<String> given = helperObj.getAList();
					System.out.println("enter the no. of Strings you want to add in the list::");
					int count = testerObj.toCheckInt();
					String[] input = new String[count];
					for (int i = 0; i < count; i++) {
						System.out.println("enter the String " + i + " ::");
						input[i] = scan.next();
						helperObj.addStrElement(given, input[i]);
					}
					int length = helperObj.getLengthList(given);
					System.out.println("the length of the arraylist " + given + " is ::" + length);
					break;
				}
				case 3: {
					List<Integer> given = helperObj.getAList();
					System.out.println("enter the no. of integer you want to add in the list::");
					int count = testerObj.toCheckInt();
					int[] input = new int[count];
					for (int i = 0; i < count; i++) {
						System.out.println("enter the integer " + i + " ::");
						input[i] = testerObj.toCheckInt();
						helperObj.addIntElement(given, input[i]);
					}
					int length = helperObj.getLengthList(given);
					System.out.println("the length of the arraylist " + given + " is ::" + length);
					break;
				}
				case 4: {
					List<Object> given = helperObj.getAList();
					System.out.println("enter the no. of objects you want to add in the list::");
					int count = testerObj.toCheckInt();
					ArrayListTask input = new ArrayListTask();
					for (int i = 0; i < count; i++) {

						helperObj.addElement(given, input);
					}
					int length = helperObj.getLengthList(given);
					System.out.println("the length of the arraylist " + given + " is ::" + length);
					break;
				}
				case 5: {
					List given = helperObj.getAList();
					System.out.println("enter the no. of integer you want to add in the list::");
					int count = testerObj.toCheckInt();
					int[] input = new int[count];
					for (int i = 0; i < count; i++) {
						System.out.println("enter the integer " + i + " ::");
						input[i] = testerObj.toCheckInt();
						helperObj.addIntElement(given, input[i]);
					}
					System.out.println("enter the no. of Strings you want to add in the list::");
					int countS = testerObj.toCheckInt();
					String[] inputS = new String[countS];
					for (int i = 0; i < countS; i++) {
						System.out.println("enter the String " + i + " ::");
						inputS[i] = scan.next();
						helperObj.addStrElement(given, inputS[i]);
					}
					System.out.println("enter the no. of objects you want to add in the list::");
					int countO = testerObj.toCheckInt();
					ArrayListTask inputO = new ArrayListTask();
					for (int i = 0; i < countO; i++) {

						helperObj.addElement(given, inputO);
					}
					int length = helperObj.getLengthList(given);
					System.out.println("the length of the arraylist " + given + " is ::" + length);
					break;
				}
				case 6: {
					List<String> given = helperObj.getAList();
					System.out.println("enter the no. of Strings you want to add in the list::");
					int countS = testerObj.toCheckInt();
					String[] inputS = new String[countS];
					for (int i = 0; i < countS; i++) {
						System.out.println("enter the String " + i + " ::");
						inputS[i] = scan.next();
						helperObj.addStrElement(given, inputS[i]);
					}
					System.out.println("enter the string u want to find the index of:: ");
					String find = scan.next();
					int index = helperObj.getIndexOf(given, find);
					System.out.println("the output arraylist is ::" + given);
					System.out.println("the index of the entered string is ::" + index);
					break;
				}
				case 7: {
					List<String> given = helperObj.getAList();
					System.out.println("enter the no. of Strings you want to add in the list::");
					int countS = testerObj.toCheckInt();
					String[] inputS = new String[countS];
					for (int i = 0; i < countS; i++) {
						System.out.println("enter the String " + i + " ::");
						inputS[i] = scan.next();
						helperObj.addStrElement(given, inputS[i]);
					}
					System.out.println("the output arraylist is ::" + given);
					helperObj.getIterator(given);
					break;
				}
				case 8: {
					List<String> given = helperObj.getAList();
					System.out.println("enter the no. of Strings you want to add in the list::");
					int countS = testerObj.toCheckInt();
					System.out.println("enter the index no. of the string you want:;");
					int findS = testerObj.toCheckInt();
					String[] inputS = new String[countS];
					for (int i = 0; i < countS; i++) {
						System.out.println("enter the String " + i + " ::");
						inputS[i] = scan.next();
						helperObj.addStrElement(given, inputS[i]);
					}
					System.out.println("the output arraylist is ::" + given);
					int length = helperObj.getLengthList(given);
					System.out.println("the length of the arraylist is ::" + length);
					Object element = helperObj.getElement(given, findS);
					System.out.println("the element at index " + findS + " is " + element);
					break;
				}
				case 9: {
					List<String> given = helperObj.getAList();
					System.out.println("enter the no. of Strings you want to add in the list::");
					int countS = testerObj.toCheckInt();
					String[] inputS = new String[countS];
					for (int i = 0; i < countS; i++) {
						System.out.println("enter the String " + i + " ::");
						inputS[i] = scan.next();
						helperObj.addStrElement(given, inputS[i]);
					}
					System.out.println("enter the string u want to find the first and last index of:: ");
					String find = scan.next();
					int index = helperObj.getIndexOf(given, find);
					int lastIndex = helperObj.getLastIndex(given, find);
					System.out.println("the output arraylist is ::" + given);
					System.out.println("the first index of the entered string is ::" + index);
					System.out.println("the last index of the entered string is ::" + lastIndex);
					break;
				}
				case 10: {
					List<String> given = helperObj.getAList();
					System.out.println("enter the no. of Strings you want to add in the list::");
					int countS = testerObj.toCheckInt();
					String[] inputS = new String[countS];
					for (int i = 0; i < countS; i++) {
						System.out.println("enter the String " + i + " ::");
						inputS[i] = scan.next();
						helperObj.addStrElement(given, inputS[i]);
					}
					System.out.println("enter the string u want to add inbetween: ");
					String insert = scan.next();
					System.out.println("enter the index at which you want to enter the string:: ");
					int index = testerObj.toCheckInt();
					helperObj.addInBet(given, index, insert);
					System.out.println("the output arraylist is ::" + given);
					int length = helperObj.getLengthList(given);
					System.out.println("the length of the arraylist is ::" + length);
					break;
				}
				case 11: {
					List<String> given = helperObj.getAList();
					System.out.println("enter the no. of Strings you want to add in the list::");
					int countS = testerObj.toCheckInt();
					String[] inputS = new String[countS];
					for (int i = 0; i < countS; i++) {
						System.out.println("enter the String " + i + " ::");
						inputS[i] = scan.next();
						helperObj.addStrElement(given, inputS[i]);
					}
					System.out.println("enter the first index of the sublist::");
					int firstIndex = testerObj.toCheckInt();
					System.out.println("enter the last index of the sublist::");
					int lastIndex = testerObj.toCheckInt();
					helperObj.getSubList(given, firstIndex, lastIndex);
					System.out.println("the needed sublist is::" + given);
					break;
				}
				case 12: {
					List<String> givenA = helperObj.getAList();
					System.out.println("enter the no. of Strings you want to add in the list A::");
					int countSA = testerObj.toCheckInt();
					String[] inputSA = new String[countSA];
					for (int i = 0; i < countSA; i++) {
						System.out.println("enter the String " + i + " ::");
						inputSA[i] = scan.next();
						helperObj.addStrElement(givenA, inputSA[i]);
					}
					List<String> givenB = helperObj.getAList();
					System.out.println("enter the no. of Strings you want to add in the list B::");
					int countSB = testerObj.toCheckInt();
					String[] inputSB = new String[countSB];
					for (int i = 0; i < countSB; i++) {
						System.out.println("enter the String " + i + " ::");
						inputSB[i] = scan.next();
						helperObj.addStrElement(givenB, inputSB[i]);
					}
					System.out.println("the first list is ::" + givenA);
					System.out.println("the second list is ::" + givenB);
					List output = helperObj.mergeList(givenA, givenB);
					System.out.println("the merged list is ::" + output);
					System.out.println("the length of output is ::" + helperObj.getLengthList(output));
					break;
				}
				case 13: {
					List<String> givenA = helperObj.getAList();
					System.out.println("enter the no. of Strings you want to add in the list A::");
					int countSA = testerObj.toCheckInt();
					String[] inputSA = new String[countSA];
					for (int i = 0; i < countSA; i++) {
						System.out.println("enter the String " + i + " ::");
						inputSA[i] = scan.next();
						helperObj.addStrElement(givenA, inputSA[i]);
					}
					List<String> givenB = helperObj.getAList();
					System.out.println("enter the no. of Strings you want to add in the list B::");
					int countSB = testerObj.toCheckInt();
					String[] inputSB = new String[countSB];
					for (int i = 0; i < countSB; i++) {
						System.out.println("enter the String " + i + " ::");
						inputSB[i] = scan.next();
						helperObj.addStrElement(givenB, inputSB[i]);
					}
					System.out.println("the first list is ::" + givenA);
					System.out.println("the second list is ::" + givenB);
					List output = helperObj.mergeList(givenB, givenA);
					System.out.println("the merged list is ::" + output);
					System.out.println("the length of output is ::" + helperObj.getLengthList(output));
					break;
				}
				case 14: {
					List<Double> given = helperObj.getAList();
					System.out.println("enter the no. of double you want to add in the list ::");
					int countD = testerObj.toCheckInt();
					double[] inputD = new double[countD];
					for (int i = 0; i < countD; i++) {
						System.out.println("enter the String " + i + " ::");
						inputD[i] = scan.nextDouble();
						helperObj.addDoubleElement(given, inputD[i]);
					}
					System.out.println("enter the decimal value you want to remove:: ");
					double input = scan.nextDouble();
					helperObj.removeDoubleElement(given, input);
					int length = helperObj.getLengthList(given);
					System.out.println("the output list is ::" + given);
					System.out.println("the length of the output list is :" + length);
					break;
				}
				case 15: {
					List<Double> given = helperObj.getAList();
					System.out.println("enter the no. of double you want to add in the list ::");
					int countD = testerObj.toCheckInt();
					double[] inputD = new double[countD];
					for (int i = 0; i < countD; i++) {
						System.out.println("enter the String " + i + " ::");
						inputD[i] = scan.nextDouble();
						helperObj.addDoubleElement(given, inputD[i]);
					}
					System.out.println("enter the index value you want to remove:: ");
					int input = testerObj.toCheckInt();
					helperObj.removeElementAtIndex(given, input);
					int length = helperObj.getLengthList(given);
					System.out.println("the output list is ::" + given);
					System.out.println("the length of the output list is :" + length);
					break;
				}
				case 16: {
					List<Long> given = helperObj.getAList();
					System.out.println("enter the no. of long values you want to add in the list::");
					int countS = testerObj.toCheckInt();
					long[] inputS = new long[countS];
					for (int i = 0; i < countS; i++) {
						System.out.println("enter the String " + i + " ::");
						inputS[i] = scan.nextLong();
						helperObj.addLongElement(given, inputS[i]);
					}
					System.out.println("enter the first index for removal::");
					int firstIndex = testerObj.toCheckInt();
					System.out.println("enter the last index for removal::");
					int lastIndex = testerObj.toCheckInt();
					helperObj.removeFromTo(given, firstIndex, lastIndex);
					int length = helperObj.getLengthList(given);
					System.out.println("the output list is ::" + given);
					System.out.println("the length of the output list is :" + length);
					break;
				}
				case 17: {
					List<String> givenA = helperObj.getAList();
					System.out.println("enter the no. of Strings you want to add in the list A::");
					int countSA = testerObj.toCheckInt();
					String[] inputSA = new String[countSA];
					for (int i = 0; i < countSA; i++) {
						System.out.println("enter the String " + i + " ::");
						inputSA[i] = scan.next();
						helperObj.addStrElement(givenA, inputSA[i]);
					}
					List<String> givenB = helperObj.getAList();
					System.out.println("enter the no. of Strings you want to add in the list B::");
					int countSB = testerObj.toCheckInt();
					String[] inputSB = new String[countSB];
					for (int i = 0; i < countSB; i++) {
						System.out.println("enter the String " + i + " ::");
						inputSB[i] = scan.next();
						helperObj.addStrElement(givenB, inputSB[i]);
					}
					helperObj.removeCommon(givenA, givenB);
					int length = helperObj.getLengthList(givenA);
					System.out.println("the output list is ::" + givenA);
					System.out.println("the length of the output list is :" + length);
					break;
				}
				case 18: {
					List<String> givenA = helperObj.getAList();
					System.out.println("enter the no. of Strings you want to add in the list A::");
					int countSA = testerObj.toCheckInt();
					String[] inputSA = new String[countSA];
					for (int i = 0; i < countSA; i++) {
						System.out.println("enter the String " + i + " ::");
						inputSA[i] = scan.next();
						helperObj.addStrElement(givenA, inputSA[i]);
					}
					List<String> givenB = helperObj.getAList();
					System.out.println("enter the no. of Strings you want to add in the list B::");
					int countSB = testerObj.toCheckInt();
					String[] inputSB = new String[countSB];
					for (int i = 0; i < countSB; i++) {
						System.out.println("enter the String " + i + " ::");
						inputSB[i] = scan.next();
						helperObj.addStrElement(givenB, inputSB[i]);
					}
					List replace = helperObj.removeNonCommon(givenA, givenB);
					int length = helperObj.getLengthList(replace);
					System.out.println("the output list is ::" + replace);
					System.out.println("the length of the output list is :" + length);
					break;
				}
				case 19: {
					List<Long> givenB = helperObj.getAList();
					System.out.println("enter the no. of Strings you want to add in the list B::");
					int countSB = testerObj.toCheckInt();
					long[] inputSB = new long[countSB];
					for (int i = 0; i < countSB; i++) {
						System.out.println("enter the String " + i + " ::");
						inputSB[i] = scan.nextLong();
						helperObj.addLongElement(givenB, inputSB[i]);
					}
					helperObj.removeAll(givenB);
					int length = helperObj.getLengthList(givenB);
					System.out.println("the output list is ::" + givenB);
					System.out.println("the length of the output list is :" + length);
					break;
				}
				case 20: {
					List<String> givenB = helperObj.getAList();
					System.out.println("enter the no. of Strings you want to add in the list B::");
					int countSB = testerObj.toCheckInt();
					String[] inputSB = new String[countSB];
					for (int i = 0; i < countSB; i++) {
						System.out.println("enter the String " + i + " ::");
						inputSB[i] = scan.next();
						helperObj.addStrElement(givenB, inputSB[i]);
					}
					System.out.println("enter the String you want to check ::");
					String check = scan.next();
					System.out.println("the element is present in the list:: " + helperObj.checkObject(givenB, check));
					int length = helperObj.getLengthList(givenB);
					System.out.println("the output list is ::" + givenB);
					System.out.println("the length of the output list is :" + length);
					break;
				}
				}
			}

			catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
			System.out.print("Do you want to continuation yes/no ::");
			carryOn = scan.next();
		}

		while (carryOn.equals("yes"));
	}
}
