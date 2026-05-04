
/**
 * ?
 *
 * @authors Zaara, Jerome
 */
public class SinglePlayer extends Game
{
 private String difficulty; 
 public SinglePlayer(String title, Platform platform, double rating, Genre genre, String difficulty){
   super(title, platform, rating, genre);
   this.difficulty = difficulty;
 }
 //changes the difficulty
 public void changeDifficulty(String nDifficulty){
     this.difficulty = nDifficulty;
 }
}