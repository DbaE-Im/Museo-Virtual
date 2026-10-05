package principal;

import modelo.*;

public class Main {
    public static void main(String[] args) {
        Artista a = new Artista("Fernando de Szyszlo", "Peruana", "Pintor abstracto.");

        ElementoCultural p = new Pintura("P-01", "Paisaje", "Óleo sobre lienzo", 1980,
                a, "Óleo", "80x60 cm");
        ElementoCultural e = new Escultura("E-01", "Figura", "Bronce fundido", 1995,
                a, "Fundición", "Bronce", 1.2);

        System.out.println(p.obtenerTipo() + ": " + p.mostrarFicha());
        System.out.println(e.obtenerTipo() + ": " + e.mostrarFicha());
    }
}