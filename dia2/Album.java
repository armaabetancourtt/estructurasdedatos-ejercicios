package tiendademusica;

import java.util.ArrayList;

public class Album {
    private final String titulo;
    private final String artista;
    private final ArrayList<Cancion> canciones;
    
    public Album(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
        this.canciones = new ArrayList<>();
    }

    public void registrarCancion(Cancion cancion) {
        canciones.add(cancion);
        System.out.println("Canción registrada: " + cancion.buscarTitulo());
    }
    
    public ArrayList<Cancion> buscarCanciones() {
        return canciones;
    }

    public String buscarTitulo() {
        return titulo;
    }

    public String buscarArtista() {
        return artista;
    }
}
