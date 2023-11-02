import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class Biblioteca {
    private List<Libro> libros;
    private int idLibroActual;

    /**
     * Genera un ArrayList como base de datos.
     */
    public Biblioteca() {
        libros = new ArrayList<>();
        idLibroActual = 1;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    /**
     * Regostra un Libro.
     */
    public void registrarLibro() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del libro: ");
        String nombre = scanner.nextLine();
        System.out.print("Tipo de tapa: ");
        String tipoTapa = scanner.nextLine();
        System.out.print("Número de páginas: ");
        int numeroPaginas = scanner.nextInt();
        scanner.nextLine();  // Consumir la nueva línea después de nextInt()
        System.out.print("Idioma: ");
        String idioma = scanner.nextLine();
        System.out.print("Editorial: ");
        String editorial = scanner.nextLine();
        System.out.print("Fecha de lanzamiento: ");
        String fechaLanzamiento = scanner.nextLine();
        System.out.print("¿Está prestado? (Si/No): ");
        boolean prestado = scanner.nextLine().equalsIgnoreCase("Si");
        String nombrePrestadoA = prestado ? "" : "-";  // Establecer "-" si no está prestado

        if (prestado) {
            System.out.print("Nombre de la persona a la que se presta: ");
            nombrePrestadoA = scanner.nextLine();
        }

        Libro libro = new Libro(idLibroActual++, nombre, tipoTapa, numeroPaginas, idioma, editorial, fechaLanzamiento,
                prestado, nombrePrestadoA);

        libros.add(libro);
        
        System.out.println(" ");
        System.out.println("El libro se ha registrado con éxito.");
        System.out.println(" ");
    }

    /**
     * Muestra una lista de libros.
     */
    public void listarLibros() {
        if (libros.isEmpty()) {
        	System.out.println(" ");
            System.out.println("No hay libros registrados en la biblioteca.");
            System.out.println(" ");
        } else {
        	System.out.println(" ");
            System.out.println("Lista de libros:");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.printf("%-5s %-50s %-20s %-10s %-15s %-30s %-20s %-10s %-20s%n", 
                "ID", "Nombre", "Tipo de Tapa", "Páginas", "Idioma", "Editorial", "Fecha de Lanzamiento", "Prestado", "Prestado a");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            for (Libro libro : libros) {
                System.out.printf("%-5s %-50s %-20s %-10d %-15s %-30s %-20s %-10s %-20s%n", 
                    libro.getId(), libro.getNombre(), libro.getTipoTapa(), libro.getNumeroPaginas(),
                    libro.getIdioma(), libro.getEditorial(), libro.getFechaLanzamiento(),
                    libro.isPrestado() ? "Sí" : "No", libro.getNombrePrestadoA());
            }
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(" ");
        }
    }

    /**
     * Buscar un libro.
     */
    public void buscarLibro() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del libro a buscar: ");
        System.out.println(" ");
        String nombreBuscar = scanner.nextLine();

        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getNombre().equalsIgnoreCase(nombreBuscar)) {
            	System.out.println(" ");
                System.out.println("Libro encontrado:");
                System.out.println(libro);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
        	System.out.println(" ");
            System.out.println("Libro no encontrado.");
            System.out.println(" ");
        }
    }

    /**
     * Modificar un libro.
     */
    public void modificarLibro() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el ID del libro a modificar: ");
        int idModificar = scanner.nextInt();
        scanner.nextLine();  // Consumir la nueva línea después de nextInt()

        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getId() == idModificar) {
            	System.out.println(" ");
                System.out.println("Libro encontrado:");
                System.out.println(" ");
                System.out.println(libro);
                System.out.println("Ingrese los nuevos datos:");

                System.out.print("¿Está prestado? (Si/No): ");
                boolean prestado = scanner.nextLine().equalsIgnoreCase("Si");

                if (prestado) {
                    System.out.print("Nombre de la persona a la que se presta: ");
                    String nombrePrestadoA = scanner.nextLine();
                    libro.setPrestado(true);
                    libro.setNombrePrestadoA(nombrePrestadoA);
                } else {
                    libro.setPrestado(false);
                    libro.setNombrePrestadoA("-");
                }

                System.out.println(" ");
                System.out.println("La información de préstamo del libro se ha modificado con éxito.");
                System.out.println(" ");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
        	System.out.println(" ");
            System.out.println("Libro no encontrado.");
            System.out.println(" ");
        }
    }
    
    /**
     * Eliminar un libro por ID.
     * @return = devuelve true si fue encontrado y eliminado o false si no fue encontrado.
     */
    public boolean eliminarLibroPorID() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el ID del libro a eliminar: ");
        int idEliminar = scanner.nextInt();
        scanner.nextLine();  // Consumir la nueva línea después de nextInt()

        Iterator<Libro> iterator = libros.iterator();
        while (iterator.hasNext()) {
            Libro libro = iterator.next();
            if (libro.getId() == idEliminar) {
                iterator.remove();
                System.out.println(" ");
                System.out.println("El libro con ID " + idEliminar + " ha sido eliminado.");
                System.out.println(" ");
                return true; // Libro encontrado y eliminado
            }
        }
        System.out.println(" ");
        System.out.println("No se encontró ningún libro con el ID " + idEliminar + ".");
        System.out.println(" ");
        return false; // No se encontró ningún libro con el ID especificado
    }

}
