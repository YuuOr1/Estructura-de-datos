public class Nodo {
    private int Elem;
    Nodo izq;
    Nodo der;

    public Nodo(int elem) {
        Elem = elem;
        izq = null;
        der = null;
    }

    public Nodo(int Elem, Nodo der, Nodo izq) {
        this.Elem = Elem;
        this.der = der;
        this.izq = izq;
    }

    public int getElem() {
        return Elem;
    }

    public void setElem(int elem) {
        Elem = elem;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }

    

}
