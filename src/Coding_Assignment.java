
public class Coding_Assignment {
	
	public static void main(String[] args) {
		
//		Problem 1.
//		parts a. and b.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 94};
		
		int lastMinusFirst = ages[ages.length - 1] - ages[0];
		System.out.println("First element subtracted from last element: " + lastMinusFirst);
		
//		part c.
		int sum = 0;
		for (int age : ages) {
			sum += age;
		}
		double averageAge = (double) sum / ages.length;
		System.out.println("Average age: " + averageAge);
		
		
//		Problem 2:
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
//		part a.
		sum = 0;
		for (String name : names) {
			sum += name.length();
		}
		double averageLettersPerName = (double) sum / names.length;
		System.out.println("Average letters per name: " + averageLettersPerName);
		
//		part b.
		String listOfNames = "";
		for (String name : names) {
			listOfNames += name + " ";
		}
		System.out.println(listOfNames);
		
//		Problem 5
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
//		Problem 6
		sum = 0;
		for (int nameLength : nameLengths) {
			sum += nameLength;
		}
		System.out.println("Sum of name lengths: " + sum);
		
	}
	
//	Problem 7
	public static String repeatWordNTimes(String word, int n) {
		String repeatedWord = "";
		for (int i = 0; i < n; i++) {
			repeatedWord += word;
		}
		return repeatedWord;
	}
	
//	Problem 8
	public static String createFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
//	Problem 9
	public static boolean isSumGreaterThan100(int[] ints) {
		int sum = 0;
		for (int num : ints) {
			sum += num;
		}
		return sum > 100;
	}
	
//	Problem 10
	public static double average(double[] doubles) {
		double sum = 0;
		for (double num : doubles) {
			sum += num;
		}
		return sum / doubles.length;
	}
	
//	Problem 11
	public static boolean firstAverageGreaterThanSecond(double[] doubles1, double[] doubles2) {
		double sum1 = 0, sum2 = 0;
		for (double num : doubles1) {
			sum1 += num;
		}
		for (double num : doubles2) {
			sum2 += num;
		}
		return (sum1 / doubles1.length) > (sum2 / doubles2.length);
	}
	
//	Problem 12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return (isHotOutside && moneyInPocket > 10.5);
	}
	
//	Problem 13
//	this method takes a string and returns true if the string is a palindrome
//	I created it for the Lab
	public static boolean isPalindrome(String checkedString) {
		for (int i = 0; i < checkedString.length() / 2; i++) {
			if (checkedString.charAt(i) != checkedString.charAt(checkedString.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
	
}


