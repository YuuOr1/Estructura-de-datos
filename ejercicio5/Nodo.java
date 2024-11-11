package ejercicio5;


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
}
    
