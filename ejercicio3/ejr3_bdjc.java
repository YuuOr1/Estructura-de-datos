package ejercicio3;
public class ejr3_bdjc {
    public static void main(String[] args) {
        
        System.out.println("Ejercicio");
        //Probar clases externas, probar los moldes
        int variable = 24;
        System.out.println("Primer elemento");
        Nodo caja =  new Nodo();
        //caja.setMascota = "firulais";
        caja.setMascota("firulais");
        System.out.println(caja.getMascota());
        System.out.println(caja.getNext());
        System.out.println("Segundo elemento");
        Nodo cajota = new Nodo();
        //cajota.setMascota = "oso panda";
        cajota.setMascota("oso panda");
        //caja.setnext = cajota;
        caja.setNext(cajota);
        System.out.println(cajota.getMascota());
        System.out.println(cajota.getNext());
        System.out.println(caja.getNext());
        System.out.println(cajota);
    }
    
}
