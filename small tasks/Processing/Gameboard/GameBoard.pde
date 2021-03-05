int x=500;
int y=500;
int[] ellipseXCordinatesArray = {50,300,550};
int[] ellipseYCordinatesArray = {50,300,550};
int ellipseX;
int ellipseY;

void setup(){
size(600,600);
background(255);
rectMode(CENTER);
strokeWeight(10);
rect(width/2,height/2,x,y);

rect(width/2-x/4,height/2-y/4,x/2,y/2);
rect(width/2-x/4,height/2+y/4,x/2,y/2);

rect(width/2+x/4,height/2-y/4,x/2,y/2);
rect(width/2+x/4,height/2+y/4,x/2,y/2);

rect(width/2,height/2,x/5,y/5);
noFill();
rect(width/2,height/2,x*0.6,y*0.6);
}

void draw(){
 
}

void keyPressed(){
  
  ellipseX=ellipseXCordinatesArray[int(random(ellipseXCordinatesArray.length))];
  ellipseY=ellipseYCordinatesArray[int(random(ellipseYCordinatesArray.length))];
  
  noStroke();
  fill(#5B75D1);
  ellipseMode(CENTER);
  ellipse(ellipseX,ellipseY,40,40);
}
