class Player
{
  int x; 
  int y; 
  int type = 1; 
  int health; 
  int score;
  int damageTaken = 1;

  Player(int x, int y) {
    this.x = x;
    this.y = y;
    health = 100;
    score = 0;
  }


  void takeDamage() {
    health=health-damageTaken;
      
  }

  void increaseScore() {
    score++;
  }
}
