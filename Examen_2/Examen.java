public class Examen {
    private String nombre;
    private int calificacion;
    private int totalPuntos;

    public Examen(String nombre, int calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
        this.totalPuntos = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public int getTotalPuntos() {
        return totalPuntos;
    }

    public void setTotalPuntos(int puntos) {
        this.totalPuntos = puntos;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Calificación: " + calificacion + ", Total de puntos: " + totalPuntos;
    }
}

