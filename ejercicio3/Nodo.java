package ejercicio3;

public class Nodo {
    private String mascota;
    private Nodo next; // cuerda que une a otro elemento

    // set asigna o coloca el elemento de la caja
    public void setMascota(String mascota) {
        this.mascota = mascota; // Asigna el valor al atributo mascota
    }

    // get permite visualizar el contenido, regresa el valor de mascota
    public String getMascota() {
        return mascota;
    }

    // Asigna el nodo siguiente
    public void setNext(Nodo next) {
        this.next = next;
    }

    // Retorna el nodo siguiente
    public Nodo getNext() {
        return next;
    }
}
