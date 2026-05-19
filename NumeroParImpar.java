import java.util.Scanner;

public class NumeroParImpar {
    public static void ejecutar(Scanner lector) {
        System.out.println("\n--- Número Par o Impar ---");
        System.out.print("Ingrese un número entero: ");
        int numero = lector.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es PAR.");
        } else {
            System.out.println("El número " + numero + " es IMPAR.");
        }
    }
}