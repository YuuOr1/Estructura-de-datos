public class Calificador {
    private Cola colaExamenes;

    public Calificador() {
        colaExamenes = new Cola();
    }

    public void calificarExamenes(Pila pilaDeExamenes) {
        while (!pilaDeExamenes.estaVacia()) {
            colaExamenes.encolar(pilaDeExamenes.desapilar());
        }

        if (!colaExamenes.estaVacia()) {
            Examen primerLugar = colaExamenes.desencolar();
            primerLugar.setTotalPuntos(primerLugar.getTotalPuntos() + 5);

            if (!colaExamenes.estaVacia()) {
                Examen segundoLugar = colaExamenes.desencolar();
                segundoLugar.setTotalPuntos(segundoLugar.getTotalPuntos() + 5);

                colaExamenes.encolar(primerLugar);
                colaExamenes.encolar(segundoLugar);
            } else {
                colaExamenes.encolar(primerLugar);
            }
        }
    }

    public void mostrarResultados() {
        while (!colaExamenes.estaVacia()) {
            System.out.println(colaExamenes.desencolar());
        }
    }
}
