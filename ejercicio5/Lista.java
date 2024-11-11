package ejercicio5;

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
    
    public void InsertarInicio(String elem){
        Nodo nuevo = new Nodo();
        nuevo.setElem(elem);
        System.out.println("Nuevo: " + nuevo.getElem());
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
    public void Borrar(String Elem, String colado){
        System.out.println("Nombre a borrar: ");
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
}
