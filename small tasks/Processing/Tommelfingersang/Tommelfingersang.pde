void setup () {
  fingerSong("Tommelfinger","du");
  fingerSong("Pegefinger","du");
  fingerSong("Langefinger","du");
  fingerSong("Ringefinger","du");
  fingerSong("Lillefinger","du");
  fingerSong("Alle fingre","vi");
}

void fingerSong(String finger, String who) {
  println(finger+",", finger);
  whereAreYou(who);
}

void whereAreYou(String who) {
  if (who=="du") {
  println("hvor er du?");
  println("Her er jeg, her er jeg,");
  goodDay();
  }
  else {
  println("hvor er i?");
  println("Her er vi, her er vi,");
  goodDay();
  }
}

void goodDay(){
  println("go'da'!");
  println("go'da'!");
  println("go'da'!"); 
}
