
int size = 40;
int[][] grid = new int[25][25];

Player player;
Enemy enemy;
Food food;

void setup()
{
  size(1000, 1000);
  player = new Player(5, 2);
  enemy = new Enemy(10, 10, player);
  food = new Food(15, 15, player);
}

void draw()
{
  clearBoard();// sætter alle værdier til 0 via double for loop (grid[x][y] = 0;)
  updateEntities();// kalder enemy.moveTowardsPlayer() på hver enemy.
  drawBoard(); // tegner rect og bruger getColorFromType metoden til at bestemme fill værdi.
  //isGameOver(); // returnerer true hvis spillerens health er under -1.
 //resolveCollisions();// tjekker om enemy og player står på samme x og y koordinat. Hvis ja, så kald player.takeDamage();
// tjekker om food og player står på samme x og y koordinat. Hvis ja, så kald player.increaseScore();
  println(player.health);

}

void clearBoard()
{
  for (int x = 0; x < grid.length; x++)
  {
    for (int y = 0; y < grid[0].length; y++)
    {
      grid[x][y] = 0;
    }
  }
}

void drawBoard()
{
  for (int x = 0; x < grid.length; x++)
  {
    for (int y = 0; y < grid[0].length; y++)
    {
      fill(getColorFromType(grid[x][y]));
      rect(x * size, y * size, size, size);
    }
  }
}

void updateEntities()
{
  grid[food.x][food.y] = food.type;
  grid[enemy.x][enemy.y] = enemy.type;
  grid[player.x][player.y] = player.type;
  moveTowardsPlayer()
  //player.takeDamage();
}


color getColorFromType(int type) 
{
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
  case 4: 
    c = color (0, 255, 255);
    break;
  }    

  return c;
}

/*
void printIntArray(int[][] arr) 
{
  System.out.println("");
  System.out.println("");
  System.out.println("");
  for (int x = 0; x < arr.length; x++)
  {
    for (int y = 0; y < arr[0].length; y++) 
    {

      System.out.print(arr[x][y] + ", ");
    }
    println();
  }
}*/

void keyPressed(){
  if (key == 'w' && player.y>0)
  {
    println(player.x,player.y);
    player.y--;
  }
  if (key == 'a' && player.x>0)
  {
    println(player.x,player.y);
    player.x--;
  }
  if (key == 's' && player.y<grid.length-1)
  {
    println(player.x,player.y);
    player.y++;
  }
  if (key == 'd' && player.x<grid.length-1)
  {
    println(player.x,player.y);
    player.x++;
  }
}

boolean isGameOver(){
  if (player.health<1){
    return true;
  }else{
    return false;
  }
}
