import java.util.Stack;

public class CharolaDeExamenes {
    private Stack<Examen> pilaDeExamenes;

    public CharolaDeExamenes() {
        pilaDeExamenes = new Stack<>();
    }

    public void agregarExamen(Examen examen) {
        pilaDeExamenes.push(examen);
    }

    public Stack<Examen> obtenerExamenes() {
        return pilaDeExamenes;
    }
}
