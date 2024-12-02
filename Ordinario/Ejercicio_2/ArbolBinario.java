public class ArbolBinario {
    Nodo raiz;

    // Método para insertar un nodo según el criterio
    public void insertar(String nombre, String horaLlegada, String criterio) {
        raiz = insertarRecursivo(raiz, nombre, horaLlegada, criterio);
    }

    private Nodo insertarRecursivo(Nodo nodo, String nombre, String horaLlegada, String criterio) {
        if (nodo == null) {
            return new Nodo(nombre, horaLlegada);
        }

        if (criterio.equals("nombre")) {
            if (nombre.compareToIgnoreCase(nodo.nombre) < 0) {
                nodo.izquierda = insertarRecursivo(nodo.izquierda, nombre, horaLlegada, criterio);
            } else {
                nodo.derecha = insertarRecursivo(nodo.derecha, nombre, horaLlegada, criterio);
            }
        } else { // criterio por hora de llegada
            if (horaLlegada.compareTo(nodo.horaLlegada) < 0) {
                nodo.izquierda = insertarRecursivo(nodo.izquierda, nombre, horaLlegada, criterio);
            } else {
                nodo.derecha = insertarRecursivo(nodo.derecha, nombre, horaLlegada, criterio);
            }
        }
        return nodo;
    }

    // Recorridos del árbol
    public void inOrden(Nodo nodo, StringBuilder resultado) {
        if (nodo != null) {
            inOrden(nodo.izquierda, resultado);
            resultado.append(nodo.nombre).append(" - ").append(nodo.horaLlegada).append("\n");
            inOrden(nodo.derecha, resultado);
        }
    }

    public void preOrden(Nodo nodo, StringBuilder resultado) {
        if (nodo != null) {
            resultado.append(nodo.nombre).append(" - ").append(nodo.horaLlegada).append("\n");
            preOrden(nodo.izquierda, resultado);
            preOrden(nodo.derecha, resultado);
        }
    }

    public void postOrden(Nodo nodo, StringBuilder resultado) {
        if (nodo != null) {
            postOrden(nodo.izquierda, resultado);
            postOrden(nodo.derecha, resultado);
            resultado.append(nodo.nombre).append(" - ").append(nodo.horaLlegada).append("\n");
        }
    }
}
