import java.util.PriorityQueue;
import java.util.Stack;

public class Calificador {
    private PriorityQueue<Examen> colaExamenes;

    public Calificador() {
        colaExamenes = new PriorityQueue<>((e1, e2) -> Integer.compare(e2.getCalificacion(), e1.getCalificacion()));
    }

    public void calificarExamenes(Stack<Examen> pilaDeExamenes) {
        while (!pilaDeExamenes.isEmpty()) {
            colaExamenes.offer(pilaDeExamenes.pop());
        }

        if (!colaExamenes.isEmpty()) {
            Examen primerLugar = colaExamenes.poll();
            primerLugar.setTotalPuntos(primerLugar.getTotalPuntos() + 5);

            if (!colaExamenes.isEmpty()) {
                Examen segundoLugar = colaExamenes.poll();
                segundoLugar.setTotalPuntos(segundoLugar.getTotalPuntos() + 5);

                colaExamenes.offer(primerLugar);
                colaExamenes.offer(segundoLugar);
            } else {
                colaExamenes.offer(primerLugar);
            }
        }
    }

    public void mostrarResultados() {
        while (!colaExamenes.isEmpty()) {
            System.out.println(colaExamenes.poll());
        }
    }
}

