public class Nodo {
    String nombre; // Nombre del objeto (null si vacío)
    int peso; // Peso del objeto (0 si vacío)
    Nodo derecha, izquierda, arriba, abajo; // Punteros para las conexiones

    // Constructor para nodos llenos
    public Nodo(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
        this.derecha = this.izquierda = this.arriba = this.abajo = null;
    }

    // Constructor para nodos vacíos
    public Nodo() {
        this(null, 0);
    }

    // Verificar si un nodo está vacío
    public boolean estaVacio() {
        return this.nombre == null;
    }
}
