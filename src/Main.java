import Model.*;
import Util.*;
import java.util.Calendar;

public class Main {
    Util.List<Anime> list = new Util.List();
    
    public static void main(String[] args){
        //Testing ground
    }
    
    // Sets data
    public void setData(){
        List<Model.Character> cast = new List();
        cast.add(new Model.Character("Taki", new VoiceActor()));
        list.add(new Anime("Your Name", new Studio("Shinkai Animation", "Tokyo", Calendar.getInstance()), cast));
       
    }
}
