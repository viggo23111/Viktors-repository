class Player
{
  
  int x; 
  int y; 
  int type = 1; 
  int health; 
  int score;
  int damageTaken = 5;
  int startHealth;
  int startScore;

  Player(int x, int y) {
    this.x = x;
    this.y = y;
    health = 100;
    score = 0;
    startHealth=100;
    startScore=0;
  }


  void takeDamage() {
    if (health>0){
    health=health-damageTaken;
    }
      
  }

  void increaseScore() {
    score++;
  }
}
