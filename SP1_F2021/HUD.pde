class Hud
{
  Player player;

  Hud(Player player)
  {
    this.player = player;
  }
  //Creates a health bar that decreases every time you get hit by an enemy, it changes color depending on how low you get.
  void healthBar() {
    float playerHealth = float(player.health);
    float fullHealthbarWidth=width/1.40;
    float healthBarLength=playerHealth*6.5;
    color healthBarColor=(#35D128);

    fill(0);
    rect(0, height-100, fullHealthbarWidth, 200);

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
    rect(5, height-95, healthBarLength, 95);
    stroke(1);
    textSize(30);
    fill(255);
    textAlign(CENTER);
    text("HP:"+player.health+"/"+player.startHealth, width/3, height-35);
  }

  //Creates a a scoreboard
  void scoreBoard() {
    textAlign(CENTER);
    fill(0);
    rect(width-260, height-100, width, 200);
    textSize(30);
    fill(255);
    text("Score:"+player.score, width/1.20, height-35);
  }
}
