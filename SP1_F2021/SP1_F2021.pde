int size = 40;
int[][] grid = new int[25][25];
long lastTime = 0;
Player player;
Enemy[] enemies = new Enemy[4];
Food[] foods = new Food[4];

boolean gameover = false;


void setup() {
  size(1000, 1100);
  lastTime = millis();
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
  healthBar();
  //Checks if player have more than 0 health, if yes he will call the functions underneath
  if(!gameover){
    clearBoard();// sætter alle værdier til 0 via double for loop (grid[x][y] = 0;)
    updateEntities();// kalder enemy.moveTowardsPlayer() på hver enemy.
    drawBoard(); // tegner rect og bruger getColorFromType metoden til at bestemme fill værdi.
    //isGameOver(); // returnerer true hvis spillerens health er under -1.
    scoreBoard();
  } else {
    fill(#F00C0C); // RED
    textSize(100);
    textAlign(CENTER);
    text("GAME OVER \n Your Score is: " + player.score + "\n Press ENTER", width/2, height/3);
    if (keyCode == ENTER) {
      player.health=player.startHealth;
      player.score=player.startScore;
      gameover = false;
       scoreBoard();
       healthBar();
       clearBoard();
      for (int i = 0; i < enemies.length; i++) {
        enemies[i].x=int(random(1, 24));
        enemies[i].y=int(random(1, 24));
      }
      
    }
  }
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

//This function decides what happen if player get hit by an enemy or if the player hit some food
void resolveCollisions(int enemyId, int foodId) {
  if (player.x == enemies[enemyId].x && player.y == enemies[enemyId].y && millis() - lastTime > 200) {
    println( "Lose health every 0.2 seconds" );
    lastTime = millis();
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


//Creates a health bar that decreases every time you get hit by an enemy, it changes color depending on how low you get.
void healthBar() {
  float playerHealth = float(player.health);
  float fullHealthbarWidth=width/1.43;
  float healthBarLength=playerHealth*6.9;
  color healthBarColor=(#35D128);

  fill(0);
  rect(0, 1000, fullHealthbarWidth, 200);

  if (playerHealth>75) {
    healthBarColor=(#35D128);
  } else if (playerHealth>50) {
    healthBarColor=(#F0F50F);
  } else if (playerHealth>25) {
    healthBarColor=(#FF890A);
  } else if (playerHealth>0) {
    healthBarColor=(#FF0505);
  } else {
    healthBarColor=(255);
    healthBarLength=0;
    gameover = true;
  }
  noStroke();
  fill(healthBarColor);
  rect(5, 1005, healthBarLength, 95);
  stroke(1);
  PFont f;
  f = createFont("verdana", 18);
  textFont(f);
  textSize(30);
  fill(255);
  text("HP:"+player.health+"/100", width/4, 1070);
}

//Creates a text that contains your score
void scoreBoard() {
  fill(133);
  rect(700, 1000, width/3, 200);
  PFont f;
  f = createFont("verdana", 18);
  textFont(f);
  textSize(30);
  fill(255);
  text("Score:"+player.score, 750, 1070);
}


boolean isGameOver() {
  if (player.health<1) {
    println("game over");
    return true;
  } else {
    println("game in progress");
    return false;
  }
}
