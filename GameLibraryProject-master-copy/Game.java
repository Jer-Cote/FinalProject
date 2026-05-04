
/**
 * Will store and manage information about a video game
 *
 * @authors Zaara, Jerome
 */
public class Game
{
    private String title;
    private Platform platform;
    private double rating;
    private Genre genre;

    //creates a new game
    public Game (String title, Platform platform, double rating, Genre genre){
        this.title = title;
        this.platform = platform;
        this.rating = rating;
        this.genre = genre;
    }

    public String getTitle(){
        return title;
    }

    public Genre getGenre(){
        return genre;
    }

    public Platform getPlatform(){
        return platform;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setGenre(Genre genre){
        this.genre = genre;
    }

    public void setPlatform(Platform platform){
        this.platform = platform;
    }

    public String toString(){
        return title + " - " + genre + " - " + platform;
    }

    public boolean equals (Object obj){
        if (obj == null || !(obj instanceof Game)){
            return false;
        }
        Game other = (Game) obj;
        return this.title.equals(other.title)
        && this.genre == other.genre
        && this.platform == other.platform;

    }
} 