import java.util.Scanner;

public class PromedioNotasA {
    public static void ejecutar(Scanner lector) {
        System.out.println("\n--- Promedio de Notas ---");
        System.out.print("¿Cuántas notas desea ingresar?: ");
        int cantidad = lector.nextInt();
        
        if(cantidad <= 0) {
            System.out.println("Cantidad inválida.");
            return;
        }

        double[] notas = new double[cantidad];
        double suma = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = lector.nextDouble();
            suma += notas[i];
        }

        double promedio = suma / cantidad;
        System.out.println("El promedio de las " + cantidad + " notas es: " + promedio);
    }
}