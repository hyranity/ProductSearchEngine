package Model;

import java.util.*;

public class Studio {
    private String name;
    private String location;
    private Calendar dateFounded;
    
    // Constructor
    public Studio() {
    }

    public Studio(String name, String location, Calendar dateFounded) {
        this.name = name;
        this.location = location;
        this.dateFounded = dateFounded;
    }
    
    // Setters & getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Calendar getDateFounded() {
        return dateFounded;
    }

    public void setDateFounded(Calendar dateFounded) {
        this.dateFounded = dateFounded;
    }
    
}
