public class Lista {
    private Nodo inicio;
    private Nodo fin;

    public Lista() {
        inicio = null;
        fin = null;
    }

    public void insertar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (inicio == null) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            fin.setSiguiente(nuevoNodo);
            fin = nuevoNodo;
        }
    }

    public void borrarUltimo() {
        if (inicio == null) {
            return; // Lista vacía
        }
        if (inicio == fin) {
            inicio = null;
            fin = null;
        } else {
            Nodo actual = inicio;
            while (actual.getSiguiente() != fin) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(null);
            fin = actual;
        }
    }

    public Nodo getInicio() {
        return inicio;
    }

    public Nodo getFin() {
        return fin;
    }

    public void reiniciar() {
        inicio = null;
        fin = null;
    }

    private class Nodo {
        private int elemento;
        private Nodo siguiente;

        public Nodo(int elemento) {
            this.elemento = elemento;
            this.siguiente = null;
        }

        public int getElem() {
            return elemento;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }
    }
}