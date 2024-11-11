

public class Nodo {
    
    private String elem;

    private Nodo next; 

    public void setElem(String variable){
        elem = variable; //adaptar en unas 2 semanas
    }
    //get permite visualizar el contenido, regresa
    public String getElem(){
        return elem;
    }

    public void setNext(Nodo variable){
        next = variable;
    }

    public Nodo getNext(){
        return next;
    }

    public void mostrar (){
        Nodo i = this.inicio;

        while (i != null){
            System.out.println(i.getElem());
            i = i.getNext();
        }
    }

    public void colas(){
            //First Input First Output

            inicio = null;
            fin = null;
    }

    public void borrar(){
        if(inicio == fin){
            inicio = null;
            fin = null;
        }
        else { //Hay mas de 1 elemento
            Nodo aux = inicio.getNext();
            inicio.setNext();
            inicio = aux;
        }
    }

    public void insertar(String elem){
    Nodo nuevo = new Nodo();
    nuevo.setElem(elem);

    //cuando esta vacia
    if (inicio == null && inicio == fin){
        inicio = nuevo;
        fin == nuevo;
    }
    else { //cuando ya hay elementos
        Nodo i = inicio;
        while(i.getNext() != null){
            i = i.getNext();
        }
    }
    }
    
}
