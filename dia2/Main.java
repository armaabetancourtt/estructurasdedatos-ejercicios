package tiendademusica;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        Album album1 = new Album("Starboy", "The Weeknd");
        album1.registrarCancion(new Cancion("Die For You", 4.20, "The Weeknd"));
        album1.registrarCancion(new Cancion("Sidewalks", 3.52, "The Weeknd ft. Kendrick Lamar"));

        Album album2 = new Album("Homerun", "Paulo Londra");
        album2.registrarCancion(new Cancion("Tal Vez", 4.24, "Paulo Londra"));
        album2.registrarCancion(new Cancion("No Puedo", 2.54, "Paulo Londra"));

        tienda.registrarAlbum(album1);
        tienda.registrarAlbum(album2);

        System.out.println("Buscando canción 1 (Sidewalks)");
        tienda.buscarCancionPorTitulo("Sidewalks");

        System.out.println("Buscando canción 2 (Tal Vez)");
        tienda.buscarCancionPorTitulo("Tal Vez");
    }
}
