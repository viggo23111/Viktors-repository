public class Team {
    private String name;
    private String[] playerNames;
    private int points;
    private int pointScore;
    private int gamesWon;
    private int gamesPlayed;
    private boolean knockedOut;

    public Team(String name, String[] playerNames, int points, int pointScore, int gamesWon, int gamesPlayed, boolean knockedOut) {
        this.name = name;
        this.playerNames = playerNames;
        this.points = points;
        this.pointScore = pointScore;
        this.gamesWon = gamesWon;
        this.gamesPlayed = gamesPlayed;
        this.knockedOut = knockedOut;
    }

    public String getName() {return name;}
    public String[] getPlayerNames() {return playerNames;}

    public int getPoints() {return points; }
    public void setPoints(int points) {this.points = points;}

    public int getPointscore() {return pointScore;}
    public void setPointscore(int pointscore) {this.pointScore = pointscore; }

    public int getGamesWon() {return gamesWon;}
    public void setGamesWon(int gamesWon) {this.gamesWon = gamesWon;}

    public int getGamesPlayed() {return gamesPlayed;}
    public void setGamesPlayed(int gamesPlayed) {this.gamesPlayed = gamesPlayed;}

    public void teamHasBeenKnockedOut() {this.knockedOut = true;}
    public boolean getTeamKnockedOut() {return knockedOut;}
}