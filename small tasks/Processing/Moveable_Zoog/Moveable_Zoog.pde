
int x=100;
int y=100;
int w=60;
int h=60;
int eyeSize=16;

int xspeed=3;
int yspeed=3;


void setup() {
 size(500,500); 

}

void draw(){

  x=x+xspeed;
  y=y+yspeed;
  if ((x > width) ||(x < 0)){
    xspeed = xspeed*-1;
  }
  if ((y > height) ||(y < 0)){
    yspeed = yspeed*-1;
  }
 
  background(255);
  ellipseMode(CENTER);
  rectMode(CENTER);
  
  //Multiple zoogs
  for (int x=50; x <width; x+=80){
    
  
  // Draw Zoog's arms with a for loop
  for (int i=y+5; i <y+h; i +=10){
  stroke(0);
  line(x-w/3,i,x+w/3,i);
    
    
  }
  // Draw zoog's body
  stroke(0);
  fill(150);
  rect(x,y,w/6,h*2);
  
  
  //Draw Zoogs head
  stroke(0);
  fill(255);
  ellipse(x,y-h/2,w,h);
  
  //Draw Zoog's eyes
  fill(0);
  ellipse(x-w/3,y-h/2,eyeSize,eyeSize*2);
  ellipse(x+w/3,y-h/2,eyeSize,eyeSize*2);
  
  // Draw zoogs legs
  stroke(0);
  line(x-w/12,y+h,x-w/4,y+h+10);
  line(x+w/12,y+h,x+w/4,y+h+10);
  }



}
