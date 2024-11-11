package ej7_bdjc;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class ejr7_bdjc {
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
                    grupo.Insertar(nombre);
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
                    //grupo.buscar(nombre);
                    break;
                case 5:
                    System.out.println("Nombre a insertar:");
                    colado=leer.nextLine();
                    System.out.println("antes de quien: ");
                    nombre=leer.nextLine();
                    grupo.InsertarEnMedio(colado, nombre);
                    break;
                case 6:
                    if(grupo.vacia() == false){
                        System.out.println("Nombre a borrar: ");
                        nombre = leer.nextLine();
                        if(grupo.borrar(nombre) == true){
                            System.out.println("Borrado");
                        }
                        else
                        {
                            System.out.println("El elemento no esta en la lista.");
                        }
                    }
                    break;
                case 7:
                    //grupo.limpiar();
                    break;
                case 8:
                    InputStream ins = new FileInputStream("datos.txt");
                    Scanner obj = new Scanner(ins);
                    while(obj.hasNextLine()){
                        System.out.println(obj.nextLine());
                    }
                    break;
                case 9: // guardar datos en archivo Datos.txt
                    System.out.println("Guardando datos en el archivo Datos.txt...");
                    grupo.guardarEnArchivo("datos.txt");  // Llamada al nuevo método para guardar la lista
                    System.out.println("Datos guardados. Saliendo....\n");
                    break;
                case 10:
                    System.out.println("Saliendo");
                    break;
                case 11:
                    System.out.println("Lista Invertida");
                    if(grupo.vacia())
                    {
                        System.out.println("No hay elementos.");
                    }
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }while(op!=10);
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
        System.out.println("7. Reiniciar");
        System.out.println("8. Mostrar Lista");
        System.out.println("9. Guardar archivo");
        System.out.println("10. Salir");
    }
}