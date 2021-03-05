Human human1;
Human human2;

void setup(){
  
  human1=new Human("Viktor",180,94.5,color(0),color(255),false);
  human2=new Human("Karla",160,65,color(233),color(131),true);
  human1.sleep();
  human2.wakeup();
  println(human1.humanHeight);
  println(human2.humanHeight);
  println(human1.female);
 
}
