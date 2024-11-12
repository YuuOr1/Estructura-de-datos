class Pila {
    private Nodo cima;

    private class Nodo {
        Examen examen;
        Nodo siguiente;

        Nodo(Examen examen) {
            this.examen = examen;
            this.siguiente = null;
        }
    }

    // Método para apilar un nuevo examen
    public void apilar(Examen examen) {
        Nodo nuevoNodo = new Nodo(examen);
        nuevoNodo.siguiente = cima; // El nuevo nodo apunta al anterior cima
        cima = nuevoNodo; // La cima ahora es el nuevo nodo
    }

    // Método para desapilar un examen
    public Examen desapilar() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
            return null;
        }
        Examen examen = cima.examen; // Obtenemos el examen de la cima
        cima = cima.siguiente; // La cima pasa a ser el siguiente nodo
        return examen;
    }

    // Método para verificar si la pila está vacía
    public boolean estaVacia() {
        return cima == null;
    }
}
