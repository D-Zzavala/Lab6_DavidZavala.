
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 50431
 */
public class Playlist {

    private String Name;
    private ArrayList<Cancion> Songs = new ArrayList();

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public ArrayList<Cancion> getSongs() {
        return Songs;
    }

    public void setSongs(ArrayList<Cancion> Songs) {
        this.Songs = Songs;
    }
    
    
}
