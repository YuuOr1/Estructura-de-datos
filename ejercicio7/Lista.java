package ej7_bdjc;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lista {
    Scanner leer = new Scanner(System.in);
    private Nodo inicio;
    private Nodo fin;
    //valores iniciales
    public Lista(){
        inicio = null;
        fin = null;
    }
    public void setInicio(Nodo variable){
        inicio = variable;
    }

    public Nodo getInicio(){
        return inicio;
    }

    public void setFin(Nodo variable){
        fin = variable;
    }
    
    public Nodo getFin(){
        return fin;
    }
    //truco no correcto, para imprimir direcciones de memoria
    public void direcciones(){
        System.out.println("inicio " + inicio);
        System.out.println("fin " + fin);
    }

    public void Insertar(String Elem){
        Nodo nuevo = new Nodo();
        nuevo.setElem(Elem);
        System.out.println("Agregar: " + nuevo.getElem());
        if(inicio == null){
            inicio = nuevo;
            fin = nuevo;
        }
        else{
            fin.setNext(nuevo);
            fin = nuevo;
        }
    }
    
    public void InsertarInicio(String elem){
        Nodo nuevo = new Nodo();
        nuevo.setElem(elem);
        System.out.println("Nuevo: " + nuevo.getElem());
    }

    public void mostrar(String elem){
        Nodo i = inicio;
        while(i!= null){
            System.out.print(i.getElem() + " -> ");
            i = i.getNext();
        }
        System.out.println("null");
    }

    public void InsertarEnMedio(String Elem, String colado){

        boolean estado = false;
        Nodo inicio = new Nodo();
        inicio.setElem(colado);
        Nodo i = inicio;
        Nodo ant = inicio;

        while(i != null && estado == false){
            if(Elem.equals(i.getElem())){
                System.out.println("El elemento se esncuentra en la lista.\n");
                estado = true;
                if(i == inicio){
                    InsertarInicio(colado);
                }
                else{
                    ant.setNext(inicio);
                    inicio.setNext(i);
                }
            }
            else{
                i = inicio.getNext();
            }

        }
        if(estado = false){
            System.out.println("El elemento no se encuentra en la lista\n");
        }
    }

    public void buscar(String Elem){
        boolean estado = false;
        Nodo i = inicio;
        while(i!= null){
            if(Elem.equals(i.getElem())){
                System.out.println("El elemento se encuentra en la lista.\n");
                estado = true;
            }
            else{
                i = i.getNext();
            }
        }
    }

    public void borrar(String Elem, String colado){
        boolean estado = false;
        Nodo inicio = new Nodo();
        inicio.setElem(colado);
        Nodo i = inicio;
        Nodo ant = inicio;

        while(i != null && estado == false){
            if(Elem.equals(i.getElem())){
                System.out.println("El elemento se esncuentra en la lista.\n");
                estado = true;
                if(i == inicio){
                    inicio = inicio.getNext();
                    i.setNext(null);
                }
                else{
                    ant.setNext(i.getNext());
                    i.setNext(null);
                }
                System.out.println("Borrado");
                i = null;
                estado = true;

            }
            else{
                if(i != inicio) {ant = ant.getNext();}
                i = i.getNext();
            }
        }
    }

    public void guardarEnArchivo(String nombreArchivo) {
    try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo))) {
        Nodo actual = inicio; // Comenzamos desde el nodo inicial
        while (actual != null) {
            escritor.write(actual.getElem()); // Escribir el dato del nodo en el archivo
            escritor.newLine(); // Nueva línea para cada dato
            actual = actual.getNext(); // Mover al siguiente nodo
        }
        System.out.println("Lista guardada exitosamente en " + nombreArchivo);
    } catch (IOException e) {
        System.out.println("Ocurrió un error al guardar la lista en el archivo.");
        e.printStackTrace();
    }
}
}
