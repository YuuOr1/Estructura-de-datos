package ejercicio5;

import java.util.Scanner;

public class ejr5_bdjc {
    public static void main(String[] args) {
        System.out.println("Ejercicio 5");
        Scanner leer = new Scanner(System.in);
        String nombre;
        
        Lista grupo = new Lista();
        
        System.out.println(grupo.getFin());
        
        System.out.println(grupo.getFin());
        
        grupo.direcciones();
        
        System.out.println("Nombre para agregar: ");
        
        nombre = leer.nextLine();
        
        grupo.InsertarInicio(nombre);

        grupo.InsertarEnMedio(nombre, "nuevoElemento");
    }
    
}
