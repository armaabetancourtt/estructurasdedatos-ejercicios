package tiendademusica;

import java.util.ArrayList;

public class Tienda {
    private final ArrayList<Album> albumes;

    public Tienda() {
        this.albumes = new ArrayList<>();
    }

    public void registrarAlbum(Album album) {
        albumes.add(album);
        System.out.println("Álbum registrado: " + album.buscarTitulo());
    }

    public void buscarCancionPorTitulo(String tituloBuscado) {
        boolean encontrada = false;
        for (Album album : albumes) {
            for (Cancion cancion : album.buscarCanciones()) {
                if (cancion.buscarTitulo().equalsIgnoreCase(tituloBuscado)) {
                    System.out.println("Encontrada en " + album.buscarTitulo() + ": " + cancion.buscarTitulo());
                    encontrada = true;
                }
            }
        }
        if (!encontrada) {
            System.out.println("No se encontró la canción \"" + tituloBuscado + "\" en la tienda.");
        }
    }
}
