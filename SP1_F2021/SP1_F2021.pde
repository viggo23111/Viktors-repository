int size = 34;
int[][] grid = new int[25][25];
long lastTime = 0;
Player player;
Hud hud;
Board board;
Enemy[] enemies = new Enemy[10];
Food[] foods = new Food[8];
boolean gameover = false;


void setup() {
  size(850, 950);
  lastTime = millis();
  player = new Player(5, 2);
  hud = new Hud(player);
  board = new Board();
  hud.healthBar();
  hud.scoreBoard();
  for (int i = 0; i < enemies.length; i++) {
    enemies[i] = new Enemy(int(random(1, 24)), int(random(1, 24)), player);
    grid[enemies[i].x][enemies[i].y] = enemies[i].type;
  }

  for (int i = 0; i < foods.length; i++) {
    foods[i] = new Food(int(random(1, 24)), int(random(1, 24)), player);
    grid[foods[i].x][foods[i].y] = foods[i].type;
  }
}


void draw() {
  //Checks if player have more than 0 health, if yes he will call the functions underneath
  if (!gameover) {
    board.clearBoard();// sætter alle værdier til 0 via double for loop (grid[x][y] = 0;)
    updateEntities();// kalder enemy.moveTowardsPlayer() på hver enemy.
    board.drawBoard(); // tegner rect og bruger getColorFromType metoden til at bestemme fill værdi.
    //isGameOver(); // returnerer true hvis spillerens health er under -1.
    hud.healthBar();
    hud.scoreBoard();
  } else {
    fill(0);
    textSize(90);
    textAlign(CENTER);
    text("GAME OVER \n Your Score is: " + player.score + "\n Press ENTER", width/2, height/3);
    if (keyCode == ENTER) {
      keyCode=-1;
      player.health=player.startHealth;
      player.score=player.startScore;
      gameover = false;
      board.clearBoard();
      for (int i = 0; i < enemies.length; i++) {
        enemies[i].x=int(random(1, 24));
        enemies[i].y=int(random(1, 24));
      }
    }
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
void updateEntities() {
  for (int i = 0; i < enemies.length; i++) {
    grid[enemies[i].x][enemies[i].y] = enemies[i].type;
    resolveCollisions(i, 0);
    if (frameCount%20==0) {
      enemies[i].moveTowardsPlayer();
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

//This function decides what happen if player get hit by an enemy or if the player hit some food
void resolveCollisions(int enemyId, int foodId) {
  if (player.x == enemies[enemyId].x && player.y == enemies[enemyId].y && millis() - lastTime > 200) {
    lastTime = millis();
    player.takeDamage();
    hud.healthBar();
  } else if (player.x == foods[foodId].x && player.y == foods[foodId].y) {
    player.increaseScore();
    foods[foodId].x=int(random(1, 24));
    foods[foodId].y=int(random(1, 24));
    hud.scoreBoard();
  }
}
//Players movement keys
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

boolean isGameOver() {
  if (player.health<1) {
    return true;
  } else {
    return false;
  }
}
