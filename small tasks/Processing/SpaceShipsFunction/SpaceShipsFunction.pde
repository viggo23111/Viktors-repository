void setup(){
    size(600,600);
  
}

void draw(){
    background(255);
    spaceShips(200,200,123);
    spaceShips(100,100,153);
    spaceShips(400,300,90);
    spaceShips(400,500,321);

  
}

void spaceShips(int xPosition, int yPosistion, int size){
    ellipseMode(CENTER);
    fill(0);
    ellipse(xPosition,yPosistion,size,size/3);
    ellipse(xPosition,yPosistion-size/8,size/3,size/3);
    fill(255);
    
    int windowSize=size/8;
    ellipse(xPosition,yPosistion,windowSize,windowSize);
    ellipse(xPosition-size/4,yPosistion,windowSize,windowSize);
    ellipse(xPosition+size/4,yPosistion,windowSize,windowSize);


}  



/*  for ( int amountOfWindows=0; amountOfWindows<windows;amountOfWindows++ ){
      int windowSpacing=30;
      
      fill(255);
      noStroke();
        ellipse(xPosition/2+amountOfWindows*windowSpacing,yPosistion,size/8,size/8);
    }*/
