package Model;

import Util.Quick;
import Util.List;

public class Anime {
    private String name;
    private Studio studio;
    private List<Character> cast;

    // Constructor
    public Anime(String name, Studio studio, List<Character> cast) {
        this.name = name;
        this.studio = studio;
        this.cast = cast;
    }
    
    // Add a cast member
    public void addCast(Character character){
        cast.add(character);
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }
    
    
}
