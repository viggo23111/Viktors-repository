/*1.a Create a file and name it Main.java, include a main method.
1.b Write a function that prints an empty line and call it from main();
1.c Write a function that receives a string as a parameter and prints it. call this function from main()
1.d Write a function that receives a string called "name" and an integer called "age" and call it from main with your own name and age. 
Have the function print the text "My name is \<name\>, I am <age> years old".*/
class Main{
	
	public static void main(String [] args){
	
		printEmptyLine();
		printString("test");
		printStringAndInteger("Viktor",20);
	}

	public static void printEmptyLine(){
		
		System.out.println("");
	}

	public static void printString(String text){
	
		System.out.println(text);
	}

	public static void printStringAndInteger(String name, int age){
		
		System.out.println("My name is " +(name)+ " I am " +(age)+ " years old");
	}


}