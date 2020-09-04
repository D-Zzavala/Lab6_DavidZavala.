
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

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

    public Playlist() {
    }
    
    public Playlist(String Name, ArrayList<Cancion> Songs) {
    this.Name = Name;
    this.Songs = Songs;
    }
    
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

    @Override
    public String toString() {
        return Name + " " + toString2(Songs);
    }
    
    public String toString2(ArrayList<Cancion> Canciones) {
        String ret = null;
        for (int i = 0; i < Canciones.size(); i++) {
            for (int j = 0; j < Canciones.size(); j++) {
                ret+=Canciones.get(i).toString();
            }
        }
        return ret;
    }
    
    public void ReadFileScanner(File TFile) {
        //relativo al proyecto: copy y paste el text file a la carpeta
        //leer usando el scanner
        File archivo = null;
        Scanner sc = null;
        try {
            //el ./ devuelve el lugar donde esta localizado el contexto
            archivo = new File("./Files/Playlists.txt");
            sc = new Scanner(archivo);
            while (sc.hasNext()) {
                String next = sc.nextLine();
                System.out.println(next);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en el Reader.");
        }
        sc.close();
    }

    public void WriteFile(ArrayList<Cancion> Songs,String Nombre) {
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            archivo = new File("./Files/Playlists/"+Nombre+".txt");
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
             for (Cancion list : Songs) {
                bw.write(list.getNombre()+"|");
                bw.write(list.getArtista()+"|");
                bw.write(list.getAlbum()+"|");
                bw.write(list.getPuntos()+"|");
                bw.write(list.getAño()+"|");
                bw.newLine();
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en el Writer.");
        }
    }
    
}
