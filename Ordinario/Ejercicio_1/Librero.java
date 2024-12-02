public class Librero {
    private Nodo[][] estanteria; // Matriz de nodos para representar el librero
    private int[] nivelesMaxPeso = {8, 7, 6, 5}; // Peso máximo por nivel

    public Librero() {
        // Crear una estantería de 3 columnas con distintas alturas
        this.estanteria = new Nodo[3][];
        this.estanteria[0] = new Nodo[2]; // Primera columna: 2 niveles
        this.estanteria[1] = new Nodo[3]; // Segunda columna: 3 niveles
        this.estanteria[2] = new Nodo[4]; // Tercera columna: 4 niveles

        // Inicializar todos los nodos como vacíos
        for (int col = 0; col < estanteria.length; col++) {
            for (int fila = 0; fila < estanteria[col].length; fila++) {
                estanteria[col][fila] = new Nodo();
            }
        }
    }

    // Método para agregar un objeto a una posición
    public void agregarNodo(int columna, int nivel, String nombre, int peso) {
        if (columna < 0 || columna >= estanteria.length || nivel < 0 || nivel >= estanteria[columna].length) {
            System.out.println("Error: Posición fuera de la estantería.");
            return;
        }

        if (peso > nivelesMaxPeso[nivel]) {
            System.out.println("Error: El peso excede el límite de " + nivelesMaxPeso[nivel] + " kg para este nivel.");
            return;
        }

        Nodo nodo = estanteria[columna][nivel];
        if (!nodo.estaVacio()) {
            System.out.println("Error: Ya hay un objeto en esta posición.");
            return;
        }

        estanteria[columna][nivel] = new Nodo(nombre, peso);
        System.out.println("Objeto agregado en columna " + columna + ", nivel " + nivel + ".");
    }

    // Método para mostrar la estantería
    public void mostrarEstanteria() {
        for (int col = 0; col < estanteria.length; col++) {
            System.out.println("Columna " + (col + 1) + ":");
            for (int fila = estanteria[col].length - 1; fila >= 0; fila--) {
                Nodo nodo = estanteria[col][fila];
                if (nodo.estaVacio()) {
                    System.out.println("  Nivel " + fila + ": [ Vacío ]");
                } else {
                    System.out.println("  Nivel " + fila + ": [ " + nodo.nombre + " (" + nodo.peso + "kg) ]");
                }
            }
            System.out.println();
        }
    }
}
