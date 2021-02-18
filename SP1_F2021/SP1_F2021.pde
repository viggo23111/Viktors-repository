
int size = 40;
int[][] grid = new int[25][25];

Player player;
Enemy enemy;

void setup()
{
  size(1000, 1000);
  player = new Player(3, 4);
  enemy = new Enemy(20, 19, player);
}

void draw()
{
  clearBoard();
  updateEntities();
  drawBoard();
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
  grid[player.x][player.y] = player.type;
  player.takeDamage();
}


color getColorFromType(int type) 
{
  color c = color(255);

  switch(type)
  {
  case 0: 
    c = color(127);
    break;
  case 1: 
    c = color(255, 0, 0);
    break;
  case 2: 
    c = color(0, 255, 0);
    break;
  case 3: 
    c = color(0, 0, 255);
    break;
  case 4: 
    c = color (0, 255, 255);
    break;
  }    

  return c;
}

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
}

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
