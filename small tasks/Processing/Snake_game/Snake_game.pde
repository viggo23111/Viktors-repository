ArrayList<Integer> x = new ArrayList<Integer>(), y = new ArrayList<Integer>();
int w = 30, h = 30, blocks = 20, direction = 2, foodX = 15, foodY = 15, fc1 = 255, fc2 = 255, fc3 = 255, speed = 8;
int[]xDirection={0, 0, 1, -1}, yDirection={1, -1, 0, 0};
boolean gameover = false;

void setup() {
  frame.requestFocus();  // Makes sure the window is always active so you can use key input without clicking the window. Sometimes it doesnt work, its a known issue..
  size(600, 600);
  x.add(0);
  y.add(15);
}

void draw() {
 background(0);
  //Light green
  fill(#63FF21);
  for (int i = 0; i< x.size(); i++) rect(x.get(i)*blocks, y.get(i)*blocks, blocks, blocks);
  if(!gameover){
    fill(fc1, fc2, fc3); // Food color
    ellipse(foodX*blocks+10, foodY*blocks+10, blocks, blocks); // Food
    textAlign(LEFT); // Score
    textSize(25);
    fill(255);
    text("Score: " + (x.size()-1), 10, 10, width - 20, 50); 
    if(frameCount%speed==0){
     x.add(0, x.get(0) + xDirection[direction]);
     y.add(0, y.get(0) + yDirection[direction]);
    if(x.get(0) < 0 || y.get(0) < 0 || x.get(0) >= w || y.get(0) >= h) gameover = true;   // Checks if we are out of bounds
    for (int i = 1; i < x.size(); i++)                                   // For loop for checking 
    if (x.get(0) == x.get(i) && y.get(0) == y.get(i)) gameover = true;   // if the snake hits itself
    if(x.get(0)==foodX && y.get(0)==foodY) { 
      if(x.size()%5 ==0 && speed >= 2) speed -= 1; // Speed increase every 5 point
      foodX = (int)random(0, w);
      foodY = (int)random(0, h);
      fc1 = (int)random(255);
      fc2 = (int)random(255);
      fc3 = (int)random(255);
    }else {
      x.remove(x.size()-1);
      y.remove(y.size()-1);
    }
   }
 } else {
   fill(#EADB4C); // Yellow
   textSize(30);
   textAlign(CENTER);
   text("GAME OVER \n Your Score is: " + x.size() + "\n Press ENTER", width/2, height/3);
   if (keyCode == ENTER) {
     x.clear();
     y.clear();
     x.add(0);
     y.add(15);
     direction = 2;
     speed = 8;
     gameover = false;
   }
 }
}

void keyPressed(){
 int newdir = keyCode == DOWN? 0:(keyCode == UP? 1:(keyCode == RIGHT? 2:(keyCode == LEFT?3:-1))); 
 if(newdir != -1) direction = newdir;
}
