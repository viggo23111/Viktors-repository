/*2.a Look at the file TaskTwoA and fill out the missing line, using the happy boolean. 
2.b Write a function that receives to integers as parameters and returns the sum of them.
2.c Write a function that receives a string and returns it as uppercase. (Hint: ".toUpperCase()". Further hint: https://www.w3schools.com/jsref/jsref_toUpperCase.asp )
2.d Write a function that receives a string and returns true if the first letter of the string is uppercase. (Hints: ".charAt(0)" and "Character.isUpperCase('a');" )*/


class Main{
  public static boolean happy = false;

  public static void main(String [] args) {
     if (iAmHappy()){
       System.out.println("I clap my hands");
     }
     else
     {
       System.out.println("I don't clap my hands"); 
     }
      int a = 20; 
      int b = 17; 
      sumCalculate(a,b);
        // It will return the sum of two arguments. 
      System.out.println("The sum is =" + sumCalculate(a,b)); 
      System.out.println("text in uppercase = " + stringToUpperCase("text")); 
      System.out.println("Is text uppercase = " + isFirstLetterUpperCase("Word")); 
  }


  public static boolean iAmHappy(){
    if (happy==true){
      return true;
    }else{
      return false;
    }
  }

  public static int sumCalculate(int a,int b) {
     return(a+b);
  }

   public static String stringToUpperCase(String text) {
     return(text.toUpperCase());
  }

   public static boolean isFirstLetterUpperCase(String word){
    char a=word.charAt(0);
    if (Character.isUpperCase(a)==true){
      return true;
    }else{
      return false;
    }
  }
}