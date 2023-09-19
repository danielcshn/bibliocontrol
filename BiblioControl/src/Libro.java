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

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoTapa() {
        return tipoTapa;
    }

    public void setTipoTapa(String tipoTapa) {
        this.tipoTapa = tipoTapa;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public String getNombrePrestadoA() {
        return nombrePrestadoA;
    }

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
