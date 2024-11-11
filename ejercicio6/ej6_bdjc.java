package Ej6_bdjc;

import java.util.List;
import java.util.Scanner;
public class ej6_bdjc{
    public static void main(String[] args) {
        System.out.println("Ejercico 5 Lista sencilla ");
        Scanner leer = new Scanner(System.in);
        String nombre,colado; 
        Lista grupo = new Lista();
        int op= 0;
        //System.out.println(grupo.getinicio());
        //System.out.println(grupo.getfin());
        //grupo.direcciones();
        do{
            menu();
            System.out.println("Elige una opcion");
            op = Integer.parseInt(leer.nextLine());
            switch(op){
                case 1:
                    System.out.println("Nombre para agregar:");
                    nombre = leer.nextLine();
                    grupo.insertar(nombre);
                    break;
                case 2:
                    System.out.println("Lista del grupo");
                    grupo.mostrar(colado);
                    break;
                case 3:
                    System.out.println("Nombre para agregar:");
                    nombre = leer.nextLine();
                    grupo.InsertarInicio(nombre);
                    break;
                case 4:
                    System.out.println("Nombre para buscar:");
                    nombre = leer.nextLine();
                    grupo.buscar(nombre);
                    break;
                case 5:
                    System.out.println("Nombre a insertar:");
                    colado=leer.nextLine();
                    System.out.println("antes de quien: ");
                    nombre=leer.nextLine();
                    grupo.InsertarEnMedio(colado, nombre);
                    break;
                case 6:
                    System.out.println("Que nombre quiere borrar");
                    nombre = leer.nextLine();
                    grupo.Borrar(nombre);
                    break;
                case 7:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }while(op!=7);
        /*System.out.println("0 para termiar");
        System.out.println("Nombre para agregar:");
        nombre = leer.nextLine();
        grupo.insertar(nombre);
        System.out.println("Nombre para agregar:");
        nombre = leer.nextLine();
        grupo.insertar(nombre);
        System.out.println("Nombre para agregar:");
        nombre = leer.nextLine();
        grupo.insertar(nombre);
        System.out.println("Lista del grupo");
        grupo.mostrar();
        System.out.println("inicio "+ grupo.getinicio().getelem());
        System.out.println("fin "+ grupo.getfin().getelem());
        grupo.direcciones();*/

    }// fin del main 
    public static void menu (){
        System.out.println("Listas simples");
        System.out.println("1. Insertar nombre");
        System.out.println("2. Mostrar lista");
        System.out.println("3. Insertar nombre al inicio");
        System.out.println("4. Buscar nombre");
        System.out.println("5. Nombre a insertar");
        System.out.println("6. Borrar");
        System.out.println("7. Salir");
    }
}