package modelo;

public class Pintura extends ObraArte {
    private String dimensiones;

    public Pintura(String codigo, String titulo, String descripcion, int anio,
                    Artista artista, String tecnica, String dimensiones) {
        super(codigo, titulo, descripcion, anio, artista, tecnica);
        this.dimensiones = dimensiones;
    }

    @Override
    public String mostrarFicha() {
        return super.mostrarFicha() + ", dimensiones: " + dimensiones;
    }

    @Override
    public String obtenerTipo() { return "Pintura"; }
}