package modelo;

public abstract class ElementoCultural {
    private String codigo;
    private String titulo;
    private String descripcion;
    private int anio;

    public ElementoCultural(String codigo, String titulo, String descripcion, int anio) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.anio = anio;
    }

    public String getCodigo() { return codigo; }
    public String getTitulo() { return titulo; }
    public int getAnio() { return anio; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public abstract String mostrarFicha();
    public abstract String obtenerTipo();
}