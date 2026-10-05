package modelo;

public class Escultura extends ObraArte {
    private String material;
    private double altura;

    public Escultura(String codigo, String titulo, String descripcion, int anio,
                        Artista artista, String tecnica, String material, double altura) {
        super(codigo, titulo, descripcion, anio, artista, tecnica);
        this.material = material;
        this.altura = altura;
    }

    @Override
    public String mostrarFicha() {
        return super.mostrarFicha() + ", material: " + material + ", altura: " + altura + " m";
    }

    @Override
    public String obtenerTipo() { return "Escultura"; }
}