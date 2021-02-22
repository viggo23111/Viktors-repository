class Board
{


  Board()
  {
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
}
