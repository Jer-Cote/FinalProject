
/**
 * ?
 *
 * @authors Zaara, Jerome
 */
public class Multiplayer extends Game
{
 private int maxPlayers;
 
 public Multiplayer(String title, Platform platform, double rating, Genre genre, int maxPlayers){
     super(title, platform, rating, genre);
     this.maxPlayers = maxPlayers;
 }
 //sets a maximum ammount of players
 public void setMax(int nMax){
     this.maxPlayers = nMax;
 }
}