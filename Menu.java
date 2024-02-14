import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Bienvenido al sistema de converseón de bnarios, por favor selecciona una opción ");
        System.out.println("1. Convertir binario a entero");
        System.out.println("2. Convertir entero a binario");
        System.out.println("3. Convertir hexadecimal a decimal");
        System.out.println("4. Convertir decimal a hexadecimal");
        System.out.println("5. Salir");
        int opcion = Integer.parseInt(leer.nextLine());

        if (opcion == 1) {
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------");

        }

        if (opcion == 2) {
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------");

        }

        if (opcion == 3) {
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------");

        }

        if (opcion == 4) {
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------");

        }

        if (opcion == 5) {
            System.out.println("Saliendo del programa. ¡Hasta luego!");
            System.exit(0);
        }

        leer.close();
    }

}
