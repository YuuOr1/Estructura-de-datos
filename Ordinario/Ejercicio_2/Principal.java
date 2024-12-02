import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArbolBinario arbol = new ArbolBinario();
        String criterio = "";
        boolean salir = false;

        System.out.println("Bienvenido al sistema de gestión de clientes del banco.");

        while (!salir) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Elegir criterio de ordenamiento");
            System.out.println("3. Mostrar clientes (In-Orden)");
            System.out.println("4. Mostrar clientes (Pre-Orden)");
            System.out.println("5. Mostrar clientes (Post-Orden)");
            System.out.println("6. Guardar y salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la hora de llegada (HH:mm): ");
                    String hora = scanner.nextLine();
                    if (criterio.isEmpty()) {
                        System.out.println("Primero debe elegir un criterio de ordenamiento (opción 2).");
                    } else {
                        arbol.insertar(nombre, hora, criterio);
                        System.out.println("Cliente agregado exitosamente.");
                    }
                    break;

                case 2:
                    System.out.println("Seleccione el criterio de ordenamiento:");
                    System.out.println("1. Por nombre");
                    System.out.println("2. Por hora de llegada");
                    int opcionCriterio = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer
                    if (opcionCriterio == 1) {
                        criterio = "nombre";
                    } else if (opcionCriterio == 2) {
                        criterio = "hora";
                    } else {
                        System.out.println("Opción inválida.");
                    }
                    break;

                case 3:
                    StringBuilder inOrdenResultado = new StringBuilder();
                    arbol.inOrden(arbol.raiz, inOrdenResultado);
                    System.out.println("Clientes en In-Orden:");
                    System.out.println(inOrdenResultado.toString());
                    break;

                case 4:
                    StringBuilder preOrdenResultado = new StringBuilder();
                    arbol.preOrden(arbol.raiz, preOrdenResultado);
                    System.out.println("Clientes en Pre-Orden:");
                    System.out.println(preOrdenResultado.toString());
                    break;

                case 5:
                    StringBuilder postOrdenResultado = new StringBuilder();
                    arbol.postOrden(arbol.raiz, postOrdenResultado);
                    System.out.println("Clientes en Post-Orden:");
                    System.out.println(postOrdenResultado.toString());
                    break;

                case 6:
                    System.out.print("Ingrese el nombre del archivo para guardar los datos: ");
                    String archivo = scanner.nextLine();
                    try (FileWriter writer = new FileWriter(archivo)) {
                        StringBuilder datos = new StringBuilder();
                        arbol.inOrden(arbol.raiz, datos);
                        writer.write(datos.toString());
                        System.out.println("Datos guardados exitosamente en " + archivo);
                    } catch (IOException e) {
                        System.out.println("Error al guardar el archivo: " + e.getMessage());
                    }
                    salir = true;
                    break;

                default:
                    System.out.println("Opción inválida, intente nuevamente.");
            }
        }

        scanner.close();
        System.out.println("¡Gracias por usar el sistema!");
    }
}
