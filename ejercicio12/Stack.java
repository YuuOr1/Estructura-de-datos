public class Stack {
    private NodoStack Cabeza=null;
    private NodoStack fin=null;

    public Stack()
    {
        Cabeza = null;
        fin = null;
    }

    public NodoStack getCabeza() { return Cabeza; }
    public void setCabeza(NodoStack cabeza) { Cabeza = cabeza; }

    public NodoStack getFin() { return fin; }
    public void setFin(NodoStack_2 fin) { this.fin = fin; }

    public void insertar(int Elem)
    {
        NodoStack_2 Nuevo = new NodoStack_2(); 
        Nuevo.setElem(Elem);
        if(Cabeza==null && Cabeza==fin)
        {
            Cabeza=Nuevo;
            fin=Nuevo;
        }
        else
        {
            Cabeza.setNext(Nuevo);
            Cabeza = Nuevo;
        }
    }

    public void mostrar()
    {
        if(!vacia())
        {
            Stack_LIFO_2 Aux = new Stack_LIFO_2();
            while(Cabeza != null)
            {
                System.out.println(Cabeza.getElem());
                Aux.insertar(Cabeza.getElem());
                this.borrar();
            }

            while(Aux.Cabeza != null)
            {
                this.insertar(Aux.Cabeza.getElem());
                Aux.borrar();
            }
        }
    }

    public void borrar()
    {
        if(Cabeza == fin)
            Cabeza = fin = null;
        else
        {
            NodoStack_2 i = fin;
            while(i.getNext() != Cabeza)
                i = i.getNext();
            i.setNext(null);
            Cabeza = i;
        }
    }

    public void limpiar()
    {
        Cabeza=fin=null;
    }

    public boolean vacia()
    {
        return (Cabeza == null);
    }
}
