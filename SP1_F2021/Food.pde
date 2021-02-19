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

    // random chance (~25% chance) for at food står stille
    if (random(0, 1)<=0.25) {
      
    } else {
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
        }
      }
    }
  }
}
