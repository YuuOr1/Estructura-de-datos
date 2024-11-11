import java.util.Scanner;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Lista jug1 = new Lista(); // Player 1's list
        Lista jug2 = new Lista(); // Player 2's list
        Lista jug3 = new Lista(); // Player 3's list (optional)
        int opc = 0;
        int dado;
        int turno = 1;
        String respuesta;

        // Initialize the game board (replace with your preferred method)
        String[] gato = inicializarTablero(); // Call your board initialization method

        mostrarTablero(gato); // Call your board display method
        String letraJug1 = pedirLetra(); // Get player 1's letter (X or O)
        String letraJug2 = letraJug1.equals("X") ? "O" : "X";
        System.out.println("Jugador 1 tira " + letraJug1);
        System.out.println("Jugador 2 tira " + letraJug2);

        do {
            menu();
            System.out.println("Elige: ");
            opc = Integer.parseInt(leer.nextLine());

            switch (opc) {
                case 1:
                    nuevoJuego(jug1, jug2, jug3);
                    break;
                case 2:
                    dado = (int) (Math.random() * 6) + 1;
                    if (dado == 5) {
                        System.out.println("Avanza o te quedas? A/R");
                        respuesta = leer.nextLine().toUpperCase();
                        if (respuesta.equals("A")) {
                            turno = avanza(turno, dado, jug1, jug2, jug3);
                        } else {
                            turno = retrocede(turno, dado, jug1, jug2, jug3); // Implement retrocede if needed
                        }
                    } else {
                        if (dado == 6) {
                            // Handle special action for rolling a 6 (if any)
                        } else {
                            turno = avanza(turno, dado, jug1, jug2, jug3);
                        }
                    }
                    break;
                case 9:
                    System.out.println("Saliendo del juego...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (!meta(jug1, jug2, jug3) && opc != 9);

        leer.close(); // Close the Scanner
    }

    // Implement these methods according to your game logic and board representation
    public static String[] inicializarTablero() {
        // ... (Create and initialize the game board)
    }

    public static void mostrarTablero(String[] gato) {
        // ... (Display the game board)
    }

    public static void menu() {
        System.out.println("1. Iniciar juego"); // All lists empty
        System.out.println("2. Dado");
        System.out.println("9. Salir");
    }

    public static void nuevoJuego(Lista jug1, Lista jug2, Lista jug3) {
        jug1.reiniciar();
        jug2.reiniciar();
        jug3.reiniciar();
    }

    public static int avanza(int turno, int num, Lista j1, Lista j2, Lista j3) {
        switch (turno) {
            case 1:
                if (j1.getInicio() == null) {
                    j1.insertar(num);
                } else {
                    // Handle logic for moving on list 1
                    // ...
                }
                turno = 2;
                break;
            case 2:
                if (j2.getInicio() == null) {
                    j2.insertar(num);
                } else {
                    // Handle logic for moving on list 2
                    // ...
                }
                turno = 3;
                break;
            case 3:
                if (j3.getInicio() == null) {
                    j3.insertar(num);
                } else {
                    // Handle logic for moving on
                }

            }
        }
}
