package Model;

import Util.Quick;
import Util.List;

public class Anime {
    private String name;
    private String studio;
    private List<Character> cast;

    public Anime(String name, String studio, List<Character> cast) {
        this.name = name;
        this.studio = studio;
        this.cast = cast;
    }
    
    // Add a cast member
    public void addCast(Character character){
        cast.add(character);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
    
    
}
