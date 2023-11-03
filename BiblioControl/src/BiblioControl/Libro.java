package BiblioControl;

/**
 * Clase para representar los libros.
 */
public class Libro {
	
    private int id;
    private String nombre;
    private String tipoTapa;
    private int numeroPaginas;
    private String idioma;
    private String editorial;
    private String fechaLanzamiento;
    private boolean prestado;
    private String nombrePrestadoA;

    
    /**
     * Objeto Libro con toda la información correspondiente
     * @param id = indica el id de la db.
     * @param nombre = indica el nombre del libro.
     * @param tipoTapa = indica el tipo de tapa del libro.
     * @param numeroPaginas = indica el numero de paginas del libro.
     * @param idioma = indica el idioma del libro.
     * @param editorial = indica la editorial del libro.
     * @param fechaLanzamiento = indica la fecha de lanzamiento del libro.
     * @param prestado = indica si esta prestado o no.
     * @param nombrePrestadoA = indica a nombre de quien esta prestado.
     */
    public Libro(int id, String nombre, String tipoTapa, int numeroPaginas, String idioma, String editorial,
                 String fechaLanzamiento, boolean prestado, String nombrePrestadoA) {
        this.id = id;
        this.nombre = nombre;
        this.tipoTapa = tipoTapa;
        this.numeroPaginas = numeroPaginas;
        this.idioma = idioma;
        this.editorial = editorial;
        this.fechaLanzamiento = fechaLanzamiento;
        this.prestado = prestado;
        this.nombrePrestadoA = nombrePrestadoA;
    }

    /**
     * Toma el id del libro.
     * @return = devuelve el id del libro.
     */
    public int getId() {
        return id;
    }

    /**
     * Toma el nombre del libro.
     * @return = devuelve el nombre libro.
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Setea el nombre del libro.
     * @param nombre = nombre del libro.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Toma el tipo de tapa.
     * @return = devuelve el tipo de tapa.
     */
    public String getTipoTapa() {
        return tipoTapa;
    }

    /**
     * Setea el tipo de tapa del libro.
     * @param tipoTapa = tipo de tapa.
     */
    public void setTipoTapa(String tipoTapa) {
        this.tipoTapa = tipoTapa;
    }

    /**
     * Toma el numero de paginas.
     * @return = devuelve el numero de paginas.
     */
    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    /**
     * Setea el numero de paginas del libro.
     * @param numeroPaginas = numero de paginas.
     */
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    /**
     * Toma el idioma.
     * @return = devuelve el idioma.
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     * Setea el idioma del libro.
     * @param idioma = idioma del libro.
     */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    /**
     * Toma la editorial.
     * @return = devuelve la editorial.
     */
    public String getEditorial() {
        return editorial;
    }
    
    /**
     * Setea la editorial del libro.
     * @param editorial = nombre de la editorial.
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * Toma la fecha de lanzamiento.
     * @return = devuelve la fecha de lanzamiento.
     */
    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    /**
     * Setea la fecha de lanzamiento del libro.
     * @param fechaLanzamiento = fecha de lanzamiento.
     */
    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    /**
     * Devuelve un valor boolean si esta prestado o no.
     * @return devuelve un boolean si esta prestado o no.
     */
    public boolean isPrestado() {
        return prestado;
    }

    /**
     * Setea un boolean si esta prestado o no.
     * @param prestado = setea un valor booleano.
     */
    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    /**
     * Toma el nombre de a quien se presto el libro.
     * @return = nombre de la persona.
     */
    public String getNombrePrestadoA() {
        return nombrePrestadoA;
    }

    /**
     * Setea el nombre de la persona que se presto el libro.
     * @param nombrePrestadoA = nombre de la persona.
     */
    public void setNombrePrestadoA(String nombrePrestadoA) {
        this.nombrePrestadoA = nombrePrestadoA;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                "\nNombre: " + nombre +
                "\nTipo de Tapa: " + tipoTapa +
                "\nNúmero de Páginas: " + numeroPaginas +
                "\nIdioma: " + idioma +
                "\nEditorial: " + editorial +
                "\nFecha de Lanzamiento: " + fechaLanzamiento +
                "\nPrestado: " + (prestado ? "Si" : "No") +
                "\nPrestado a: " + nombrePrestadoA + "\n";
    }
}
