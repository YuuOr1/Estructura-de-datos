import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Librero librero = new Librero();
        boolean continuar = true;

        System.out.println("Bienvenido al sistema de librero apilable.");

        while (continuar) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar objeto");
            System.out.println("2. Mostrar estantería");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del objeto: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Ingrese el peso del objeto (kg): ");
                    int peso = scanner.nextInt();

                    System.out.print("Ingrese la columna (1, 2, 3): ");
                    int columna = scanner.nextInt() - 1;

                    System.out.print("Ingrese el nivel (0 para el más bajo): ");
                    int nivel = scanner.nextInt();

                    librero.agregarNodo(columna, nivel, nombre, peso);
                    break;

                case 2:
                    librero.mostrarEstanteria();
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}
