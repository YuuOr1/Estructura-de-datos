import java.util.Scanner;
public class Arbol {
    //constructor
    private int elem;
    private Nodo raiz;

    public Arbol(){
        raiz = null;
    }

    public boolean vacio(){
        if (raiz == null)
        return true;
        else return false;
    }
    
    public Nodo getRaiz(){
        return raiz;
    }

    public void insertar(int elem){
        Nodo nuevo = new Nodo(elem);
        nuevo.setElem(elem);
        if(vacio()){
            raiz = nuevo;
        }
        else {
            Nodo i = raiz;
            while(i!=null){
                if (elem > i.getElem()){
                    if(i.getDer() == null){
                        i.setDer(nuevo);
                    }
                    else{
                        i = i.getDer();
                    }
                }
                else {
                    if(i.getIzq() == null){
                        i.setIzq(nuevo);
                    }
                    else{
                        i = i.getIzq();
                    }
                }
            }
        }
    }

    public void MostrarPreOrden(Nodo aux)
    {
        if(aux != null)
        {
            System.out.print(aux.getElem() + " - ");
            MostrarPreOrden(aux.getIzq());
            MostrarPreOrden(aux.getDer());
        }
    }

    // Mostrar arbol en postorden
    public void MostrarInOrden(Nodo aux)
    {
        if(aux != null)
        {
            MostrarInOrden(aux.getIzq());
            System.out.print(aux.getElem() + " - ");
            MostrarInOrden(aux.getDer());
        }
    }

    // Mostrar arbol en postorden
    public void MostrarPostOrden(Nodo aux)
    {
        if(aux != null)
        {
            MostrarPostOrden(aux.getIzq());
            MostrarPostOrden(aux.getDer());
            System.out.print(aux.getElem() + " - ");
        }
    }

    // mostrar por niveles
    public void Mayor_Menor(Nodo aux)
    {
        if(aux != null)
        {
            Mayor_Menor(aux.getDer());
            System.out.print(aux.getElem() + " - ");
            Mayor_Menor(aux.getIzq());
        }
    }

    public void eliminar(Nodo i , int elem, Nodo ant){
        // La primera vez recibe la raiz como i
        if(elem == i.getElem()){
            // caso 1, cuando i no tiene hijos
            if(this.getRaiz().getIzq() == null && this.getRaiz().getDer() == null){
                raiz=null;
            }
            else{
                // cuando el nodo no tiene hijos
                if(i.getIzq() == null && i.getDer() == null){
                    // verificar de que lado esta el nodo
                    if(ant.getIzq() == i){
                        ant.setIzq(null);
                    }
                    else{
                        ant.setDer(null);
                    }
                }
            }
        }
        else{
            if(elem<i.getElem()){
                eliminar(i.getIzq(), elem, i);
            }
            else{
                eliminar(i.getDer(), elem, i);
            }
        }
    }

    public void buscar(){
        Scanner scanner = new Scanner(System.in);
        int elem;
        System.out.print("Ingrese el elemento a buscar: ");
        elem = scanner.nextInt();
        Nodo i = raiz;
        while(i!=null){
            if(elem == i.getElem()){
                System.out.println("El elemento fue encontrado");
                return;
            }
            else if(elem > i.getElem()){
                i = i.getDer();
            }
            else{
                i = i.getIzq();
            }
        }
    }

}
