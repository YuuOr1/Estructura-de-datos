public class Nodo {
    String nombre;
    String horaLlegada;
    Nodo izquierda, derecha;

    public Nodo(String nombre, String horaLlegada) {
        this.nombre = nombre;
        this.horaLlegada = horaLlegada;
        izquierda = derecha = null;
    }
}
