/*For this task you should reuse the Student class from Task 3. 
    Methods of reusing the class could be: 
    - copy the Students.java file and add it to a new folder called task5
    - copy the content of the Students class from Task 3 and create the class once more in this folder
    - Open the task 3 folder and continue working in this.
    Either method is fine - it is up to you. 
    
5.a Create a new class Datamatik or reuse the one you created earlier. Add an array of Students with 10 elements in it. 
This should be a class variable (static). From the main method, add 10 student instances to the array. Each student must have a unique reference.

5.b Create a function in Datamatik that takes in the array from 5.a as a parameter as well as an integer. 
The function should return the field "name" (the name of the student) and print it (the integer should be used as the index number of the student to be printed). 
Call this method with different parameters (only the integer - not the array) from the main() of Datamatik.

5.c Create a similar function to that of 5.b, but instead of receiving the array and an integer, it receives the array and a string. 
Loop through all elements in the array until you find the element with the name received as a parameter. Then return the index of that student. 
Call this method with different names from the main method of Datamatik*/


class Datamatik{
	
	

	public static void main(String [] args){
		Student[] students = new Student[10];
		students[0] = new Student("Viktor", 20,false,"a");
        students[1] = new Student("Jonas", 25,false,"a");       
        students[2] = new Student("Louise", 25,true,"a");
        students[3] = new Student("Jakob", 35,false,"b");
        students[4] = new Student("Jeppe", 21,false,"b");       
        students[5] = new Student("Sofie", 25,true,"b");
        students[6] = new Student("Chris", 29,false,"c");
        students[7] = new Student("Sarah", 22,true,"c");       
        students[8] = new Student("Henrik", 45,false,"c");
        students[9] = new Student("Jan", 50,false,"c");

		Teacher teacher1;
		Teacher teacher2;

		teacher1 = new Teacher("Jesper",30,false);
		teacher2 = new Teacher("Tess",35,true);

		printStudentName(students,0);
		printStudentIndex(students,"Jeppe");

		
		System.out.println("My teachers names is: "+(teacher1.name)+" and "+(teacher2.name));
	}

	public static void printStudentName(Student[] studentsList, int studentIndex){
		int arraylength=studentsList.length;
			for (int i = 0; i <= arraylength-1; i++) { 
				if(studentIndex==i){
	            System.out.print(studentsList[i].name + " "); 
	        	}
	        } 
        System.out.println();
	}

	public static void printStudentIndex(Student[] studentsList, String studentName){
		int arraylength=studentsList.length;
			for (int i = 0; i <= arraylength-1; i++) { 
				if(studentName==studentsList[i].name){
				int indexNumber=i;
	            System.out.println(indexNumber); 
	        	}
	        } 
        System.out.println();
		}

}