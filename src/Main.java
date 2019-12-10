import Model.*;
import Util.*;
import java.util.Calendar;

public class Main {
    static Util.List<Anime> animeList = new Util.List();
    
    public static void main(String[] args){
        Main main = new Main();
        main.setData();
        
    }
    
    // Sets data
    public void setData(){
        createAnime();
    }
    
    public void createAnime(){
        // Get voice actors
        List<VoiceActor> vaList = createVoiceActors();
         
        // Anime : Karakai
       Anime karakai = new Anime("Karakai Jouzu no Takagi-san");
       karakai.addCast(new Model.Character("Takagi-san", vaList.getRecord(0)));
       
       karakai.addCast(new Model.Character("Nishikata", vaList.getRecord(1)));
       animeList.add(karakai);
       
    }
    
    public List<VoiceActor> createVoiceActors(){
        
        List<VoiceActor> vaList = new List();
        Quick quick = new Quick();
        vaList.add(new VoiceActor(quick.generateListId("VA", 5), "Takahashi Rie", Quick.getDate(27, 2, 1994)));
        vaList.add(new VoiceActor(quick.generateListId("VA", 5), "Yuki Kaji", Quick.getDate(3, 9, 1985)));
       
        return vaList;
    }
    
    public void LinkCharactersToActors(){
        List<Model.Character> cast = new List();
        
        
    }
}
