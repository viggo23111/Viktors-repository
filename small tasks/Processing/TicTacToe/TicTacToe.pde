boolean gameover = false;
int size = 200;
int EllipseSize = 100;
int[][] grid = new int[3][3];
boolean itIsCrossTurn = false;

void setup() {
  size(600, 600);
  drawBoard();
}

void draw() {
  if (!gameover) {
  } else {
    fill(0);
    textSize(60);
    textAlign(CENTER);
    text("GAME OVER", width/2, height/3);
    if (keyCode == ENTER) {
      keyCode=-1;
      gameover = false;
    }
  }
}

void drawBoard() {
  for (int x=0; x <grid.length; x++) {
    for (int y=0; y <grid.length; y++) {
      fill(255);
      stroke(0);
      strokeWeight(10);
      rect(x*size, y*size, size, size);
    }
  }
}

void keyPressed() {


  if (key == 'q' || key == 'Q') {
    fill(255);
    stroke(255);
    strokeWeight(10);
    if (itIsCrossTurn==true) {

      //rect(0*size, 0*size, size, size);
    } else {
      drawCircle(0,0);
    }
  } else if (key == 'w' || key == 'W') {
    fill(255);
    stroke(255);
    strokeWeight(10);
    rect(1*size, 0*size, size, size);
  } else if (key == 'e' || key == 'E') {
    fill(255);
    stroke(255);
    strokeWeight(10);
    rect(2*size, 0*size, size, size);
  } else if (key == 'a' || key == 'A') {
    fill(255);
    stroke(255);
    strokeWeight(10);
    rect(0*size, 1*size, size, size);
  } else if (key == 's' || key == 'S') {
    fill(255);
    stroke(255);
    strokeWeight(10);
    rect(1*size, 1*size, size, size);
  } else if (key == 'd' || key == 'D') {
    fill(255);
    stroke(255);
    strokeWeight(10);
    rect(2*size, 1*size, size, size);
  } else if (key == 'z' || key == 'Z') {
    fill(255);
    stroke(255);
    strokeWeight(10);
    rect(0*size, 2*size, size, size);
  } else if (key == 'x' || key == 'X') {
    fill(255);
    stroke(255);
    strokeWeight(10);
    rect(1*size, 2*size, size, size);
  } else if (key == 'c' || key == 'C') {
    fill(255);
    stroke(255);
    strokeWeight(10);
    rect(2*size, 2*size, size, size);
  }
}

void drawCross(int x, int y) {
  
  
}

void drawCircle(int x, int y) {
  ellipseMode(CORNER);
  fill(0);
  noStroke();
  ellipse(x*size, y*size, size, size);
}
