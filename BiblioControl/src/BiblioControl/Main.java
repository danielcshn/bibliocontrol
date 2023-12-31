package BiblioControl;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * @autor danielcshn
 * @version 1.1
 */

/**
 * Clase principal o inicio del programa.
 */

public class Main {

	/**
	 * Menu principal de opciones.
	 */
	public static void main(String[] args) {
        
    	Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" ");
        System.out.println("  ######                              #####                                           ");
        System.out.println("  #     # # #####  #      #  ####    #     #  ####  #    # ##### #####   ####  #      ");
        System.out.println("  #     # # #    # #      # #    #   #       #    # ##   #   #   #    # #    # #      ");
        System.out.println("  ######  # #####  #      # #    #   #       #    # # #  #   #   #    # #    # #      ");
        System.out.println("  #     # # #    # #      # #    #   #       #    # #  # #   #   #####  #    # #      ");
        System.out.println("  #     # # #    # #      # #    #   #     # #    # #   ##   #   #   #  #    # #      ");
        System.out.println("  ######  # #####  ###### #  ####     #####   ####  #    #   #   #    #  ####  ###### ");
        System.out.println("                                                                                      ");
        System.out.println("    Bienvenido a BiblioControl v1.1");
        System.out.println("    Participantes: Daniel, Veronica y Maxi");
        System.out.println(" ");
        
        while (true) {
            System.out.println("  Menú:");
            System.out.println("    1. Registrar un libro");
            System.out.println("    2. Listar libros");
            System.out.println("    3. Buscar un libro");
            System.out.println("    4. Modificar un libro");
            System.out.println("    5. Eliminar un libro");
            System.out.println(" ");
            System.out.println("    6. DEMO: Cargar lista de libros.");
            System.out.println("    7. DEMO: Eliminar lista de libros.");
            System.out.println(" ");
            System.out.println("    8. Salir");
            System.out.println(" ");
            System.out.print("Seleccione una opción: ");
            System.out.println("");
            
            //int opcion = scanner.nextInt();
            //scanner.nextLine();  // Consumir la nueva línea después de nextInt()
            int opcion = obtenerNumeroValido(scanner);
            
            switch (opcion) {
                case 1:
                	// Opcion Registrar un Libro.
                    biblioteca.registrarLibro();
                    break;
                case 2:
                	// Opcion Listar Libros.
                    biblioteca.listarLibros();
                    break;
                case 3:
                	// Opcion Buscar un Libro.
                    biblioteca.buscarLibro();
                    break;
                case 4:
                	// Opcion Modificar un Libro.
                    biblioteca.modificarLibro();
                    break;
                case 5:
                	// Opcion Eliminar un Libro por ID.
                	biblioteca.eliminarLibroPorID();
                    break;
                case 6:
                	// DEMO: Cargar lista de libros.
                	BibliotecaInicial.inicializarBiblioteca(biblioteca.getLibros());
                    break;
                case 7:
                	// DEMO: Eliminar lista de libros.
                	BibliotecaInicial.limpiarBiblioteca(biblioteca.getLibros());
                    break;
                case 8:
                	System.out.println(" ");
                    System.out.println("Gracias por usar BiblioControl. ¡Hasta luego!");
                    System.out.println(" ");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                	System.out.println(" ");
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    System.out.println(" ");
                    break;
            }
        }
    }
    
    private static int obtenerNumeroValido(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
            	System.out.println(" ");
                System.out.println("Entrada no válida. Ingrese un número válido.");
                System.out.println(" ");
                scanner.next(); // Limpia el búfer de entrada
            }
        }
    }

}
