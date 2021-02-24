/*3.f in the Teacher class, declare the class "Teacher" and add 3 fields: "name", "age", "isFemale", using appropriate data types for each.
3.g in the Teacher class, add a constructor that takes in 3 parameters with the names "tmpName", "tmpAge", "tmpIsFemale" with the same datatypes used in 3.f
3.h populate the fields created in 3.f with the parameters of the constructor added in 3.g*/
class Teacher{
	String name="";
	int age;
	boolean isFemale;

	public Teacher(String tmpName,int tmpAge, boolean tmpIsFemale){
		this.name=tmpName;
		this.age=tmpAge;
		this.isFemale=tmpIsFemale;
	}

}