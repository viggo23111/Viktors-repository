
/* Zoog that moves from down to up and goes from left to right or right to left...
float zoogX;
float zoogY;


float eyeR;
float eyeG;
float eyeB;



void setup() {
 size(200,200); 
 zoogX=width/2;
 zoogY=height+100;
}

void draw(){
background(255);
ellipseMode(CENTER);
rectMode(CENTER);

// Draw zoog's body
stroke(0);
fill(150);
rect(zoogX,zoogY,20,100);


//Draw Zoogs head
stroke(0);
fill(255);
ellipse(zoogX,zoogY-30,60,60);

//Draw Zoog's eyes
eyeR=random(255);
eyeG=random(255);
eyeB=random(255);
fill(eyeR,eyeG,eyeB);
ellipse(zoogX-15,zoogY-30,16,32);
ellipse(zoogX+15,zoogY-30,16,32);

// Draw zoogs legs
stroke(150);
line(zoogX-10,zoogY+50,zoogX-10,height);
line(zoogX+10,zoogY+50,zoogX+10,height);


//Zoog moves
zoogY=zoogY-1;
zoogX=random(50,150);
}
 */
 
 //New Zoog using translate
 
 
