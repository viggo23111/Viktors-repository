

void setup()
{
  size(140,500);
  background(0);
  ellipseMode(CENTER);
  fill(155);
  ellipse(70,100,140,140);
  ellipse(70,250,140,140);
  ellipse(70,400,140,140);
 
}


void draw()
{
 
}


void mousePressed(){
  fill(#FC0000);
  ellipse(70,100,140,140);
}


void mouseReleased(){
  fill(155);
  ellipse(70,100,140,140);
  fill(#FAFF05);
  ellipse(70,250,140,140);
}


void keyPressed(){
  fill(155);
  ellipse(70,250,140,140);
  fill(#05FF13);
  ellipse(70,400,140,140);
}

void keyReleased(){
  fill(155);
  ellipse(70,400,140,140);
}
