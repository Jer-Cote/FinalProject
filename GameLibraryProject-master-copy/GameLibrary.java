import java.util.ArrayList;
/**
 * Collection of the games
 *
 * @authors Zaara, Jerome
 */
public class GameLibrary
{
  private ArrayList<Game> games;
  
  public GameLibrary(){
      games = new ArrayList<>();
  }
  //adds a game to the library
  public void addGame(Game game){
      games.add(game);
  }
}