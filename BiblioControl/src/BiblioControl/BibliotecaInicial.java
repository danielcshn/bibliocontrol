package BiblioControl;

import java.util.List;

/**
 * Clase DEMO para cargar y eliminar datos de la lista de libros.
 */

public class BibliotecaInicial {
	
	/**
	 * Genera automaticamente 10 registros en la Biblioteca.
	 * @param biblioteca = lista de libros.
	 */
    public static void inicializarBiblioteca(List<Libro> biblioteca) {
        for (int i = 1; i <= 10; i++) {
            String nombre = "Libro " + i;
            String tipoTapa = "Tapa dura";
            int numeroPaginas = 200 + i;
            String idioma = "Español";
            String editorial = "Editorial " + i;
            String fechaLanzamiento = "01/01/2023";
            boolean prestado = i % 2 == 0; // Alternar entre libros prestados y no prestados
            String nombrePrestadoA = prestado ? "Persona " + i : "-";

            Libro libro = new Libro(i, nombre, tipoTapa, numeroPaginas, idioma, editorial,
                    fechaLanzamiento, prestado, nombrePrestadoA);

            biblioteca.add(libro);
        }
        
        System.out.println(" ");
        System.out.println("DEMO: Cargar lista de libros con éxito.");
        System.out.println(" ");
    }
    
    /**
     * Limpia la lista.
     * @param biblioteca = lista de libros.
     */
    public static void limpiarBiblioteca(List<Libro> biblioteca) {
        biblioteca.clear(); // Elimina todos los libros de la biblioteca
        
        System.out.println(" ");
        System.out.println("DEMO: Eliminar lista de libros con éxito.");
        System.out.println(" ");
    }
}
