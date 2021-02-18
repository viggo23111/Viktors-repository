
int size = 40;
int[][] grid = new int[25][25];

Player player;
Enemy[] enemies = new Enemy[4];
Food[] foods = new Food[4];

void setup() {
  size(1000, 1100);

  player = new Player(5, 2);
  for (int i = 0; i < enemies.length; i++) {
    enemies[i] = new Enemy(int(random(1, 24)), int(random(1, 24)), player);
    grid[enemies[i].x][enemies[i].y] = enemies[i].type;
  }

  for (int i = 0; i < foods.length; i++) {
    foods[i] = new Food(int(random(1, 24)), int(random(1, 24)), player);
    grid[foods[i].x][foods[i].y] = foods[i].type;
  }
  scoreBoard();
  healthBar();
}


void draw() {
  clearBoard();// sætter alle værdier til 0 via double for loop (grid[x][y] = 0;)
  updateEntities();// kalder enemy.moveTowardsPlayer() på hver enemy.
  drawBoard(); // tegner rect og bruger getColorFromType metoden til at bestemme fill værdi.
  isGameOver(); // returnerer true hvis spillerens health er under -1.
  // tjekker om enemy og player står på samme x og y koordinat. Hvis ja, så kald player.takeDamage();
  // tjekker om food og player står på samme x og y koordinat. Hvis ja, så kald player.increaseScore();
}

void clearBoard() {
  for (int x = 0; x < grid.length; x++)
  {
    for (int y = 0; y < grid[0].length; y++)
    {
      grid[x][y] = 0;
    }
  }
}

void drawBoard() {
  for (int x = 0; x < grid.length; x++)
  {
    for (int y = 0; y < grid[0].length; y++)
    {
      fill(getColorFromType(grid[x][y]));
      rect(x * size, y * size, size, size);
    }
  }
}

void updateEntities() {
  for (int i = 0; i < enemies.length; i++) {
    grid[enemies[i].x][enemies[i].y] = enemies[i].type;
    if (frameCount%20==0) {
      enemies[i].moveTowardsPlayer();
      resolveCollisions(0, i);
    }
  }
  for (int i = 0; i < foods.length; i++) {
    grid[foods[i].x][foods[i].y] = foods[i].type;
    resolveCollisions(0, i);
    if (frameCount%40==0) {
      foods[i].moveAwayFromPlayer();
    }
  }
  grid[player.x][player.y] = player.type;
}


color getColorFromType(int type) {
  color c = color(255);

  switch(type)
  {
  case 0: 
    c = color(127);
    break;
  case 1: //Player color
    c = color(#27FF2F);
    break;
  case 2: //Food color
    c = color(#2987FF);
    break;
  case 3: //Enemy color
    c = color(#FF1F1F);
    break;
  case 4: //Player take damage color
    c = color (#E8ED02);
    break;
  }    
  return c;
}

void keyPressed() {
  if (key == 'w' && player.y>0)
  {
    player.y--;
  }
  if (key == 'a' && player.x>0)
  {
    player.x--;
  }
  if (key == 's' && player.y<grid.length-1)
  {
    player.y++;
  }
  if (key == 'd' && player.x<grid.length-1)
  {
    player.x++;
  }
}

void resolveCollisions(int enemyId, int foodId) {
  if (player.x == enemies[enemyId].x && player.y == enemies[enemyId].y ) {
    player.takeDamage();
    println("Health:" +player.health);
    healthBar();
  } else if (player.x == foods[foodId].x && player.y == foods[foodId].y) {
    player.increaseScore();
    println("Score:" +player.score);
    foods[foodId].x=int(random(1, 24));
    foods[foodId].y=int(random(1, 24));
    scoreBoard();
  }
}

void healthBar() {
  if (player.health>90) {
    fill(#00FF12);
    rect(0, 1000, 700, 200);
  } else if (player.health>50) {
    fill(#00FF12);
    rect(0, 1000, 600, 200);
  } else {
    fill(#FF0505);
    rect(0, 1000, 600, 200);
  }
}


void scoreBoard() {
  fill(133);
  rect(700, 1000, 300, 200);
  PFont f;
  f = createFont("verdana", 18);
  textFont(f);
  textSize(50);
  fill(255);
  text("Score:"+player.score, 700, 1070);
  println("test");
}


boolean isGameOver() {
  if (player.health<1) {
    println("game over");
    return true;
  } else {
    return false;
  }
}
