package wk3;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
//		1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 92};
		
//		a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		System.out.println("1a - first element: " + ages[0]);//first element
		System.out.println("1a - last element: " + ages[ages.length - 1]);//last element 
		
		//subtract first element from last element
		System.out.println("1a: " + (ages[ages.length - 1] - ages[0]));
		
//		b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		int[] newAges = {3, 9, 23, 64, 2, 8, 28, 92, 100};
		System.out.println("1ab " + (newAges[newAges.length - 1] - newAges[0]));

//		c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		
		double sum = 0; //double necessary for more accuracy (int rounds)
		for(int i = 0; i < ages.length; i++) {
			sum += ages[i];
		}
		System.out.println("1c - sum: " + sum);
		System.out.println("1c - average: " + (sum/ages.length));
		
//		2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
//		a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		
		double sum2a = 0;
		for(int i = 0; i < names.length; i++) {
			sum2a += names[i].length();
		}
		System.out.println("2a - sum: " + sum2a);
		System.out.println("2a - average: " + (sum2a/names.length));
		
//		b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		
		String concat = " ";
		//using advanced for loop
		for(String name : names) {
			concat += name + " ";
		}
		System.out.println("2b: " + concat);
		
		
//		3.	How do you access the last element of any array?
		//ages[0]
		
//		4.	How do you access the first element of any array?
		//ages[ages.length - 1]
		
//		5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		
		int[] nameLengths = new int[names.length];//names.length is to specify the number of in my new array
		
		for(int i = 0; i < names.length; i++) {
			int x = nameLengths[i];
			System.out.println("index: " + i + " before assignment of values: " + x);//expected 0 because values get assigned on next line
			nameLengths[i] = names[i].length();
			//each index of nameLengths is equal to each index of name given its length 
		}
		
		
		//print to the console - documentation for how to do that
		//https://www.programiz.com/java-programming/examples/print-array
        System.out.println("5a: " + (Arrays.toString(nameLengths)));
		
		
//		6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
        int sum6a = 0;
        
        for(int nameLength : nameLengths) {
        	sum6a += nameLength;
        	
        }
        System.out.println("6: sum - " + sum6a);
        
//		7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
        concatenated("hello", 3);
        concatenated("Kristina", 2);
        
//		8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
        fullName("Kristina", "Macias");
        fullName("Victoria", "Ditmer");
        
//		9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
        int[] array = {100, 100, 100};
        int[] array2 = {2, 10, 20};
        greaterThan100(array);
        greaterThan100(array2);
        
//		10.	Write a method that takes an array of double and returns the average of all the elements in the array.
        double[] array3 = {2.2, 300.2, 300.3, 500.02};
        averageOfArray(array3);
        
//		11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
        double[] array4 = {2.3, 10, 11.4, 20.2};
        double[] array5 = {2.4, 20, 12.4};
        
        compareAverages(array4, array5);
        
//		12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
        willBuyDrink(true, 11.50);
        
//		13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
        
        feedCatBreakfast(true, 11);

	}
	//method - 7 
	static void concatenated(String word, int n) {//not returning, so use void. 
		String concatWord = ""; 
		
		for(int i = 0; i < n; i++) {
			concatWord += word;
			//"" + word
			//this runs as many times as i < n;
		}
		
		System.out.println("7a: " + concatWord);
	}
	//method - 8
	static void fullName(String firstName, String lastName) {
		System.out.println("8: " + firstName + " " + lastName);
	}
	//method - 9 
	static void greaterThan100(int[] array) {
		int sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		if(sum > 100) {
			System.out.println("9: " + true);
		} else {
			System.out.println("9: " + false);
		}
		
	}
	//method - 10
	static void averageOfArray(double[] array3) {
		double sum = 0;
		for(double number : array3) {
			sum += number;
		}
		System.out.println("10 sum: " + sum);
		System.out.println("10 average: " + (sum / array3.length));
	}
	//method - 11
	static void compareAverages(double[] arr1, double[] arr2) {
		
		double sum1 = 0;
		for(double number1 : arr1) {
			sum1 += number1;
		}
		
		double sum2 = 0;
		for(double number2 : arr2) {
			sum2 += number2;
		}
		
		System.out.println("11 sum1: " + sum1);
		System.out.println("11 sum2: " + sum2);
		
		double av1 = sum1 / arr1.length;
		double av2 = sum2 / arr2.length;
		System.out.println("av1: " + av1);
		System.out.println("av2: " + av2);
		
		if(av1 > av2) {
			System.out.println("11 (av1 is greater): " + true);
		} else {
			System.out.println("11 (av2 is greater):  " + false);
		}
		
	}
	//method 12 
	static void willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside && moneyInPocket > 10.50) {
			System.out.println("Its hot outside and I have at least 10.50. I will buy a drink.");
		} else {
			System.out.println("Short on money or not outside. No drink.");
		}
	}
	///method 13
	static void feedCatBreakfast(boolean ateBreakfast, int time) {
		if(!ateBreakfast && time >= 8) {
			System.out.println("Sadie is hungry. Time for breakfast!");
		} else {
			System.out.println("Sadie ate already or too early for breakfast");
		}
	}

}
