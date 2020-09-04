
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

    public Cancion() {
    }

    public Cancion(String Nombre, String Artista, String Album, int Puntos, int Año) {
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

    public void ReadFileScanner() {
        //relativo al proyecto: copy y paste el text file a la carpeta
        //leer usando el scanner
        File archivo = null;
        Scanner sc = null;
        try {
            //el ./ devuelve el lugar donde esta localizado el contexto
            archivo = new File("./Files/Cancion.txt");
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

    public void WriteFile(String Nombre, String Artista, String Album, int Puntos, int Año) {
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            archivo = new File("./Files/Canciones/Canciones.txt");
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            bw.write(Nombre + "|" + Artista + "|" + Album + "|" + Puntos + "|" + Año);
            bw.newLine();
            //pasar de la ram a la rom
            bw.flush();
            //primero cerrar el buffer y despues el canal
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en el Writer.");
        }
    }

}
