import java.util.Scanner;
//Nina Nájera 231088
//Mishell Ciprian 231169

public class Conversiones {
    Scanner scanner = new Scanner(System.in);

    public void BinarioaEntero() {
        System.out.println("Ingrese un número binario de 8 bits:");
        String binario = scanner.nextLine();
        int entero = Integer.parseInt(binario);
        System.out.println("La conversión del número " + binario + " a entero es: " + entero);
        scanner.close();
    }

    public void EnteroaBinario() {
        System.out.println("Ingrese un número entero:");
        int entero = scanner.nextInt();
        String binario = Integer.toBinaryString(entero);
        System.out.println("La conversión del número " + entero + " a binario es: " + binario);
    }

    public void HexadecimalaDecimal() {
        System.out.println("Ingrese un número hexadecimal:");
        String hexadecimal = scanner.nextLine();
        int decimal = Integer.parseInt(hexadecimal, 16);
        System.out.println("La conversión del número " + hexadecimal + " a decimal es: " + decimal);
    }

    public void DecimalaHexadecimal() {
        System.out.println("Ingrese un número decimal:");
        int decimal = scanner.nextInt();
        String hexadecimal = Integer.toHexString(decimal).toUpperCase();
        System.out.println("La conversión del número " + decimal + " a hexadecimal es: " + hexadecimal);
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Conversiones conversiones = new Conversiones();

        while (true) {
            System.out.println("\n-----------------------------------------------------------------------------");
            System.out.println("Bienvenido al sistema de conversión de binarios. Por favor selecciona una opción:");
            System.out.println("1. Convertir binario a entero");
            System.out.println("2. Convertir entero a binario");
            System.out.println("3. Convertir hexadecimal a decimal");
            System.out.println("4. Convertir decimal a hexadecimal");
            System.out.println("5. Salir");

            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    conversiones.BinarioaEntero();
                    break;
                case 2:
                    conversiones.EnteroaBinario();
                    break;
                case 3:
                    leer.nextLine();
                    conversiones.HexadecimalaDecimal();
                    break;
                case 4:
                    conversiones.DecimalaHexadecimal();
                    break;
                case 5:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    leer.close();
                    System.exit(0);
                default:
                    System.out.println("Error, solo se aceptan numeros del 1 al 5");
            }
        }
    }
}
