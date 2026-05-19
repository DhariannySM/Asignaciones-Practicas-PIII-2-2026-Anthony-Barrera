import java.util.Scanner;

public class Matriz3x3 {
    public static void ejecutar(Scanner lector) {
        System.out.println("\n--- Matriz 3x3 ---");
        int[][] matriz = new int[3][3];
        int valor = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = valor;
                valor++;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}