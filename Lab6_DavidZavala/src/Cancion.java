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
 private   int Puntos, Año;
 private   String Nombre, Artista, Album;

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
        return Nombre + " By:" + Artista;
    }

    
 
 
}
