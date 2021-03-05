class Human {
   String name;
   float humanHeight;
   float weight;
   boolean female;
   color eyeColor;
   color hairColor;
    
  Human(String name, float humanHeight, float weight, color eyeColor, color hairColor,boolean female){
    this.name=name;
    this.humanHeight=humanHeight;
    this.weight=weight;
    this.eyeColor=eyeColor;
    this.hairColor=hairColor;
    this.female=female;
    

  }
  
  void sleep(){
    println(name + " is sleeping.");
  }
  
  void wakeup(){
    println(name + " is waking up.");
  }
  
   void eat(){
    println(name + " is eating.");
  }
  
  
  
  
  
  
}
