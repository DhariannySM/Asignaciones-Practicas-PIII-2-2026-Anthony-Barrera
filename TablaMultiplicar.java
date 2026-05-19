import java.util.Scanner;

public class TablaMultiplicar {
    public static void ejecutar(Scanner lector) {
        System.out.println("\n--- Tabla de Multiplicar ---");
        System.out.print("Ingrese el número de la tabla que desea ver: ");
        int numero = lector.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}