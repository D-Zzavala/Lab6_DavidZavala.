
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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
public class Cancion {

    private int Puntos, Año;
    private String Nombre, Artista, Album;
    private File Archivo = new File("./Files/Cancion.txt");
    public Cancion() {
    }

    public Cancion(String Nombre, String Artista, String Album, int Año, int Puntos) {
        this.Nombre = Nombre;
        this.Artista = Artista;
        this.Album = Album;
        this.Puntos = Puntos;
        this.Año = Año;
    }

    public int getPuntos() {
        return Puntos;
    }

    public void setPuntos(int Puntos) {
        this.Puntos = Puntos;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String Artista) {
        this.Artista = Artista;
    }

    public String getAlbum() {
        return Album;
    }

    public void setAlbum(String Album) {
        this.Album = Album;
    }

    @Override
    public String toString() {
        return Nombre + " By: " + Artista;
    }

    public void ReadFileScanner(File archivo) {
        Scanner sc = null;
        try {
            sc = new Scanner(archivo);
            while (sc.hasNext()) {
                String[] next = sc.nextLine().split("|"); 
                System.out.println(next);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en el Reader.");
        }
        sc.close();
    }

    public void WriteFile(String Nombre, String Artista, String Album, int Año, int Puntos) {
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null; 
        try {
            fw = new FileWriter(Archivo, true);
            bw = new BufferedWriter(fw);
            bw.write(Nombre + "|" + Artista + "|" + Album + "|" + Año + "|" + Puntos);
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en el Writer.");
        }
    }
    
    public void WriteFileMod(ArrayList<Cancion> Songs) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(Archivo, false);
            bw = new BufferedWriter(fw);
            for (Cancion Song : Songs) {
            bw.write(Song.getNombre() + "|" + Song.getArtista()+ "|" + Song.getAlbum() + "|" + Song.getAño() + "|" + Song.getPuntos());
            bw.newLine();
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en el Writer.");
        }
    }

}
