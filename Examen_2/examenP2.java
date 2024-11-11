import java.util.Scanner;

public class examenP2 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        CharolaDeExamenes charola = new CharolaDeExamenes();

        boolean continuar = true;
        while (continuar) {
            System.out.print("Ingrese el nombre del alumno: ");
            String nombre = datos.nextLine();

            System.out.print("Ingrese la calificación del alumno (0-20): ");
            int calificacion;
            while (true) {
                calificacion = datos.nextInt();
                if (calificacion >= 0 && calificacion <= 20) {
                    break;
                } else {
                    System.out.print("Calificación inválida. Ingrese un valor entre 0 y 20: ");
                }
            }
            datos.nextLine();  // Limpiar el buffer

            charola.agregarExamen(new Examen(nombre, calificacion));

            System.out.print("¿Desea agregar otro examen? (s/n): ");
            String respuesta = datos.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }

        Calificador calificador = new Calificador();
        calificador.calificarExamenes(charola.obtenerExamenes());

        System.out.println("\nResultados finales:");
        calificador.mostrarResultados();

        datos.close();
    }
}
