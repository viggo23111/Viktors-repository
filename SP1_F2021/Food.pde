class Food
{
  int x; 
  int y; 
  int type = 2; 
  Player player;

  Food(int x, int y, Player player)
  {
    this.x = x;
    this.y = y;
    this.player = player;
  }

  void moveAwayFromPlayer() {
    int xDistance = Math.abs(player.x - x);
    int yDistance = Math.abs(player.y - y);

    // random chance (~25% chance) for at food flytter sig i en tilfældig retning. 
    /*if (random(1.0) <= 0.25) {
     if (random(1.0) <= 0.50) {
     x++;
     
     } else {
     y++;
     }
     } else {*/
    if (xDistance > yDistance) {
      if (x>player.x && x<grid.length-1) {
        x++;
        // opdatér x værdi til at rykke ét felt væk fra playeren!
      } else if (x<player.x && x>0) {
        x--;
      }
    } else {
      if (y>player.y && y<grid.length-1) {
        y++;
      } else if (y<player.y && y>0) {
        y--;

        // opdatér y værdi til at rykke ét felt væk fra playeren!
      }
    }
    // }
  }
}
