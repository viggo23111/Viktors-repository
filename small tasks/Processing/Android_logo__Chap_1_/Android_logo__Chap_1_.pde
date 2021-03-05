void setup() {
 size(500,500); 
  background(255);
}


void draw(){
background(255);
ellipseMode(CENTER);
rectMode(CENTER);
noStroke();

//Body
fill(153,204,0);
rect(mouseX,mouseY,80,100);

//Head
fill(153,204,0);
ellipse(mouseX,mouseY-70,80,40);
ellipse(mouseX-20,mouseY-90,7,20);
ellipse(mouseX+20,mouseY-90,7,20);

fill(255);
rect(mouseX,mouseY-52,80,5);
//Mouth
fill(153,204,0);
ellipse(mouseX,mouseY-60,20,7);
//Eyes
fill(255);
ellipse(mouseX-19,mouseY-70,7,7);
ellipse(mouseX+19,mouseY-70,7,7);

//Arms
fill(153,204,0);

rect(mouseX-55,mouseY-20,20,60);
rect(mouseX+55,mouseY-20,20,60);
ellipse(mouseX-55,mouseY-50,20,15);
ellipse(mouseX+55,mouseY-50,20,15);
ellipse(mouseX-55,mouseY+10,20,15);
ellipse(mouseX+55,mouseY+10,20,15);

//Legs
fill(153,204,0);

rect(mouseX-20,mouseY+55,18,40);
rect(mouseX+20,mouseY+55,18,40);
ellipse(mouseX-20,mouseY+75,18,15);
ellipse(mouseX+20,mouseY+75,18,15);

}
