package tiendademusica;

public class Cancion {
    private final String titulo;
    private final double duracion;
    private final String artista;
    
    public Cancion(String titulo, double duracion, String artista) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.artista = artista;
    }
    
    public String buscarTitulo() {
        return titulo;
    }
    
    public double buscarDuracion() {
        return duracion;
    }

    public String buscarArtista() {
        return artista;
    }
}
