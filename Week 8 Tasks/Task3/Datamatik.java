/*3.a Create a new file and save it by the name "Datamatik".
3.b Create a new file called "Teacher" and another one called "Student". Save both files with the extension .java, and in the same folder as Datamatik.java

3.c in the Student class, declare the class "Student" and add 4 fields: "name", "age", "isFemale", "datamatikerTeam" using appropriate data types for each.
3.d in the Student class, add a constructor that takes in 4 parameters with the names "tmpName", "tmpAge", "tmpIsFemale", "tmpDatamatikerTeam" with the same data types used in 3.c
3.e populate the fields created in 3.c with the parameters of the constructor added in 3.d (you may use shaddowing with the keyword this)

3.f in the Teacher class, declare the class "Teacher" and add 3 fields: "name", "age", "isFemale", using appropriate data types for each.
3.g in the Teacher class, add a constructor that takes in 3 parameters with the names "tmpName", "tmpAge", "tmpIsFemale" with the same datatypes used in 3.f
3.h populate the fields created in 3.f with the parameters of the constructor added in 3.g

3.i Returning to the Datamatik class add a main() function and in this function, create a new object/instance of the type Teacher and give it the name, age and gender of your teacher. 
3.j Also in the main() function of Datamatik, create two new objects/instances of the type Student. The first one, with your own name, age and gender. The second one with the name, age and gender of a student in your study group. 
3.k in the main() function print the name of the teacher
3.l in the main() function print the names of both students and which teams they are from. Do this witout writing any toString() methods*/
class Datamatik{
	
	public static void main(String [] args){

		Teacher teacher1;
		Teacher teacher2;
		Student student1;
		Student student2;

		teacher1 = new Teacher("Jesper",30,false);
		teacher2 = new Teacher("Tess",35,true);

		student1 = new Student("Viktor",20,false,"a");
		student2 = new Student("Louise",25,true,"a");

		System.out.println("My teachers names is: "+(teacher1.name)+" and "+(teacher2.name));
		System.out.println("My name is: "+(student1.name)+" and I am on team "+(student1.datamatikerTeam));
		System.out.println("One of my student group member name is: "+(student2.name)+" and is on team: "+(student1.datamatikerTeam));
	}

}