import java.awt.font.NumericShaper;
import java.util.Scanner;

public class ej12 
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new  Scanner(System.in);
        int opc = 0;
        Arbol nums = new Arbol();

        do{
            menu();
            System.out.print("Elige: ");
            opc = Integer.parseInt(scanner.nextLine());
            System.out.println("\n||-------------------------------------------------||\n");
            switch (opc)
            {
                case 1 -> 
                {
                    nums.Instertar(3);
                    nums.Instertar(8);
                    nums.Instertar(2);
                    nums.Instertar(1);
                    nums.Instertar(10);
                    nums.Instertar(4);
                    nums.Instertar(7);
                }

                case 2 -> 
                {
                    // raiz, izquierdas y luego derechas
                    System.out.println("PreOrden: ");
                    nums.MostrarPreOrden(nums.getRaiz());
                }

                case 3 -> 
                {
                    // izquierdas, raiz y luego derechas
                    System.out.println("InOrden: ");
                    nums.MostrarInOrden(nums.getRaiz());
                }

                case 4 -> 
                {
                    // izquierdas, derechas y luego raiz
                    System.out.println("PostOrden: ");
                    nums.MostrarPostOrden(nums.getRaiz());
                }
                
                case 5 -> 
                {
                    // Mayor a menor
                    System.out.println("Mayor a Menor: ");
                    nums.Mayor_Menor(nums.getRaiz());
                }

                case 6 -> 
                {
                    // Buscar
                }


                case 7 -> 
                {
                    // Instertar aleatorios
                }

                case 8 -> 
                {
                    System.out.println("Numero a eliminar: ");
                    int num = Integer.parseInt(leer.nextLine());
                    if(!nums.buscar(num))
                        System.out.println("No esta el numero");
                    else{
                        nums.eliminar(nums.getRaiz(),num,null);
                    }
                }

                case 9 -> System.out.println("Saliendo....\n");

            }


        }while(opc != 9);
    }

    public static void menu(){
        System.out.println("1. Insertar ");
        System.out.println("2. Mostrar Pre_Orden");
        System.out.println("3. Mostrar In_Orden");
        System.out.println("4. Mostrar Post_Orden");
        System.out.println("5. Mostrar Mayor_Menor");
        System.out.println("6. Buscar");
        System.out.println("7. Insertar aleatorios");
        System.out.println("8. Eliminar");
        System.out.println("9. Salir");

    }
}
