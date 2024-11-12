import java.util.Scanner;

public class exapenP2 {
    private Pila charola;
    private Calificador calificador;
    private Scanner datos;

    public exapenP2() {
        charola = new Pila();
        calificador = new Calificador();
        datos = new Scanner(System.in);
    }

    public void mostrarMenu() {
        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar alumno y calificación");
            System.out.println("2. Ver calificaciones");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = datos.nextInt();
            datos.nextLine(); // Limpiar el buffer

            switch(opcion){
                case 1:
                    agregarAlumno();
                    break;

                case 2:
                    verCalificaciones();
                    break;

                case 3:
                    salir = true;
                    System.out.println("Hasta Luego...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }

        datos.close();
    }

    private void agregarAlumno() {
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

        charola.apilar(new Examen(nombre, calificacion));
        System.out.println("Alumno agregado correctamente.");
    }

    private void verCalificaciones() {
        calificador.calificarExamenes(charola);
        System.out.println("\nCalificaciones ordenadas:");
        calificador.mostrarResultados();
    }

    public static void main(String[] args) {
        exapenP2 programa = new exapenP2();
        programa.mostrarMenu();
    }
}
