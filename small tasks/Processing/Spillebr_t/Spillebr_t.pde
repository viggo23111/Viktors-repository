int x=500;
int y=500;

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
