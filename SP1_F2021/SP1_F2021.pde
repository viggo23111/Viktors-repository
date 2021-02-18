
int size = 40;
int[][] grid = new int[25][25];

Player player;
Enemy enemy1;
Enemy enemy2;
Enemy enemy3;
Enemy enemy4;
Food food;

void setup() {
  size(1000, 1000);
  player = new Player(5, 2);

  enemy1 = new Enemy(10, 10, player);
  /* enemy2 = new Enemy(1, 10, player);
   enemy3 = new Enemy(14, 10, player);
   enemy4 = new Enemy(23, 10, player);*/

  food = new Food(15, 15, player);
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
  grid[food.x][food.y] = food.type;
  grid[enemy1.x][enemy1.y] = enemy1.type;
  /* grid[enemy2.x][enemy2.y] = enemy2.type;
   grid[enemy3.x][enemy3.y] = enemy3.type;
   grid[enemy4.x][enemy4.y] = enemy4.type;*/
  grid[player.x][player.y] = player.type;
  if (frameCount%20==0){
  enemy1.moveTowardsPlayer();
  food.moveAwayFromPlayer();
  resolveCollisions();
  }
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

void resolveCollisions() {
  if (player.x == enemy1.x && player.y == enemy1.y ) {
    player.takeDamage();
    //println("Health:" +player.health);
 
  } else if (player.x == food.x && player.y == food.y) {
    player.increaseScore();
   // println("Score:" +player.score);
  }
}

boolean isGameOver() {
  if (player.health<1) {
    println("game over");
    return true;
  } else {
    return false;
  }
}
