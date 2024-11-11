package ej7_bdjc;


public class Nodo {
        private String elem;
        private Nodo next; //cuerda que une a otro elemento
    
        //set asignacion o coloca elemento de la caja
        //mas adelante se cambiaran el nombre de las variables
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

        public void ListaDoble(){
            Nodo next;
            String elem;
            Nodo back;
            boolean inicio = false;
            boolean fin = false;

            if(inicio == null){
                inicio = null;
                fin = null;
            }
            else
        public void ListaDoble(Nodo nuevo) {
            Nodo i = this; // Assuming 'this' refers to the current node in the list

            while (i.getNext() != null) {
                i = i.getNext();
            }

            i.setNext(nuevo);
            nuevo.setBack(i);
        }
}
    
