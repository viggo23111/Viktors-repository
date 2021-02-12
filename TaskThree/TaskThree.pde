color ellipseOne=#FC0000;
color ellipseTwo=#FAFF05;
color ellipseThree=#05FF13;
color backgroundColor=0;
color turnedOff=155;
int timeCounter=0;

void setup(){
  size(140, 500);
  background(backgroundColor);
  ellipseMode(CENTER);
  fill(turnedOff);
  ellipse(70, 100, 140, 140);
  ellipse(70, 250, 140, 140);
  ellipse(70, 400, 140, 140);
}

void draw() {
  timeCounter++;
  if (timeCounter<=100) {
    fill(ellipseOne);
    ellipse(70, 100, 140, 140);
   
  } else if (timeCounter<=200) {
    fill(ellipseOne);
    ellipse(70, 100, 140, 140);
    fill(ellipseTwo);
    ellipse(70, 250, 140, 140);
    
  } else if (timeCounter<=300) {
    fill(turnedOff);
    ellipse(70, 100, 140, 140);
    fill(turnedOff);
    ellipse(70, 250, 140, 140);
    fill(ellipseThree);
    ellipse(70, 400, 140, 140);
    
  } else if (timeCounter<=400) {
    fill(turnedOff);
    ellipse(70, 100, 140, 140);
    fill(turnedOff);
    ellipse(70, 250, 140, 140);
    fill(turnedOff);
    ellipse(70, 400, 140, 140);
    
  } else if (timeCounter>350) {
    timeCounter=0;
  }
}
