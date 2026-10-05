package modelo;

public class Artista {
    private String nombre;
    private String nacionalidad;
    private String biografia;

    public Artista(String nombre, String nacionalidad, String biografia) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.biografia = biografia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getBiografia() {
        return biografia;
    }
}