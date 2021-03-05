String input="";
int result;
int guess;
int numberGuess=0;

void setup (){
    result = (int)random(1,100);
    frame.requestFocus();
    println("Welcome to group J number game! ");
    println("You have to guess the correct number between 1-100 to win the game.");
}

void draw(){
  
}

void keyPressed(){
  
  if (keyCode==ENTER){
    
    try{
      guess = Integer.parseInt(input);
      if (guess==result){
        println("You have guessed the number: "+input);
      } else if(guess>result){
        println("The number is lower than: "+input);
        numberGuess = numberGuess+1;
        println("You have used this amount of guesses: "+numberGuess);
      } else if (guess<result){
        println("The number is higher than: "+input);
        numberGuess = numberGuess+1;
       println("You have used this amount of guesses: "+numberGuess);
      }
     
    }
    catch (NumberFormatException e){
      println(e);
    }
    
    input ="";
  
  }
  else{
    input += key;
    
  }
}
