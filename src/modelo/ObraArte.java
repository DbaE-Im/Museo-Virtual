package modelo;

public abstract class ObraArte extends ElementoCultural {
    private Artista artista;
    protected String tecnica;

    public ObraArte(String codigo, String titulo, String descripcion, int anio,
                    Artista artista, String tecnica) {
        super(codigo, titulo, descripcion, anio);
        this.artista = artista;
        this.tecnica = tecnica;
    }

    public Artista getArtista() { return artista; }

    @Override
    public String mostrarFicha() {
        return getTitulo() + " (" + getAnio() + ") - " + artista.getNombre()
                + ", técnica: " + tecnica;
    }
}