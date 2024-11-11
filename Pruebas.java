import java.util.Scanner;

public class Pruebas {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[ ] a = new int[10];
        int valor,continuar,pos;
        System.out.println("Ejercicio 2 Jose Becerra");
        do{
            //Pedir datos
            System.out.println("Que valor quiere guardar? ");
            valor = leer.nextInt();
            for (int pos ; pos==0 ; pos++){
                a[pos] = valor;
                System.out.println("Continuar 1/0");
                continuar = leer.nextInt();
            }
	    }while(continuar == 1 && pos < 10);
        for(int i=0; i<=9; i++)
        System.out.println(i + " = " + a[i]);
    }
}