public class pila {
    
    public void mostrar(){
        Nodo i = cabeza;
        Pila aux = new Pila();
        while(cabeza != null){
            System.out.println(cabeza.getElem());
            aux.insertar(cabeza.getDElem());
            this.borrar();
        }
    }

    public void borrar(){
        if(cabeza==fin){
            cabeza = i = null;
        }
        else{
            i = i.getNext();
        }
    }

}
