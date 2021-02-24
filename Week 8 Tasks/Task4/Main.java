import java.util.Arrays; 
/*For all exercises in Task 4, you are allowed to complete them with arrays of a fixed size. But do consider how the functions you write in 4.b, 4.c, 4.d,  4.e would work, if the array received as a parameter would not have a fixed length. 
4.a create arrays of the following type and assign it at least 3 different values: 
    - Integer array
    - String array
    - boolean array
4.b Write a function that takes in an array of strings as parameter and prints each string.
4.c Write a function that receives an integer array as a parameter and returns the sum of all elements in the array.
4.d Write a function that receives an integer array as a parameter and returns the average value.	
4.e Consider how you could write a function that takes in an integer array as a parameter and returns the array sorted from lowest to highest value.*/

class Main{

	public static void main(String [] args){
		int[] myIntArray = {1, 2, 3};
		String[] myStringArray = {"Test1", "Test2", "Test3"};
		boolean[] myBooleanArray = {true, false, true};

		printIntArray(myIntArray);
		printIntArraySum(myIntArray);
		printIntArrayAverage(myIntArray);
		printIntArraySorted(myIntArray);

		printStringArray(myStringArray);
		printBooleanArray(myBooleanArray);
	}

	public static void printIntArray(int[] intList) {
		int arraylength=intList.length;
		for (int i = 0; i <= arraylength-1; i++) { 
            System.out.print(intList[i] + " "); 
        } 
        System.out.println();
	}


	public static void printStringArray(String[] arrayList) {
		int arraylength=arrayList.length;
		for (int i = 0; i <= arraylength-1; i++) { 
            System.out.print(arrayList[i] + " "); 
        } 
        System.out.println();
	}

	public static void printBooleanArray(boolean[] booleanList) {
		int arraylength=booleanList.length;
		for (int i = 0; i <= arraylength-1; i++) { 
            System.out.print(booleanList[i] + " "); 
        } 
        System.out.println();
	}

	public static void printIntArraySum(int[] intList) {
	int arraylength=intList.length;
	int sum=0;
		for (int i = 0; i <= arraylength-1; i++) { 
	        sum=intList[i]+sum;
	    } 
    System.out.println("Sum of int array: "+(sum));
	}

	public static void printIntArrayAverage(int[] intList) {
	int arraylength=intList.length;
	int sum=0;
		for (int i = 0; i <= arraylength-1; i++) { 
	        sum=intList[i]+sum;
	    }
	int average=sum/arraylength;
    System.out.println("Average of int array: "+(average));
	}


	public static void printIntArraySorted(int[] intList) {
	Arrays.sort(intList);
	int arraylength=intList.length;
	int sum=0;
	
		for (int i = 0; i <= arraylength-1; i++) { 
	        System.out.println(intList[i]);   
	    }
	}

}