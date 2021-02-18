class Player
{
    int x; 
    int y; 
    int type = 1; 
    int health; 
    int score;
    
    Player(int x, int y){
        this.x = x;
        this.y = y;
        health = 1000;
        score = 0;
    }
    
        
    void takeDamage()
    {
       health--;   
    }
    
    void increaseScore()
    {
        score++;    
    }
}
