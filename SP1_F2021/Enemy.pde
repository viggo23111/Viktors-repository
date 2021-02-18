class Enemy
{
  int x; 
  int y; 
  int type = 3; 
  Player player;

  Enemy(int x, int y, Player player)
  {
    this.x = x;
    this.y = y;
    this.player = player;
  }

  void moveTowardsPlayer() {
    int xDistance = Math.abs(player.x - x);
    int yDistance = Math.abs(player.y - y);

    // random chance (~25% chance) for at enemy flytter sig i en tilfældig retning. 
    
    if (xDistance > yDistance) {
      if (x>player.x) {
        x--;
        // opdatér x værdi til at rykke ét felt nærmere playeren!
      } else if (x<player.x) {
        x++;
      }
    } else {
      if (y>player.y) {
        y--;
        // opdatér x værdi til at rykke ét felt nærmere playeren!
      } else if (y<player.y) {
        y++;

        // opdatér y værdi til at rykke ét felt nærmere playeren!
      }
    }
  }
}
