class Cola {
    private Nodo frente;
    private Nodo fin;

    private class Nodo {
        Examen examen;
        Nodo siguiente;

        Nodo(Examen examen) {
            this.examen = examen;
        }
    }

    public void encolar(Examen examen) {
        Nodo nuevoNodo = new Nodo(examen);

        if (estaVacia() || examen.getCalificacion() > frente.examen.getCalificacion()) {
            nuevoNodo.siguiente = frente;
            frente = nuevoNodo;
            if (fin == null) {
                fin = frente;
            }
            return;
        }

        Nodo actual = frente;
        while (actual.siguiente != null && actual.siguiente.examen.getCalificacion() >= examen.getCalificacion()) {
            actual = actual.siguiente;
        }
        
        nuevoNodo.siguiente = actual.siguiente;
        actual.siguiente = nuevoNodo;
        if (nuevoNodo.siguiente == null) {
            fin = nuevoNodo;
        }
    }

    public Examen desencolar() {
        if (estaVacia()) {
            return null;
        }
        Examen examen = frente.examen;
        frente = frente.siguiente;
        if (frente == null) {
            fin = null;
        }
        return examen;
    }

    public boolean estaVacia() {
        return frente == null;
    }
}
