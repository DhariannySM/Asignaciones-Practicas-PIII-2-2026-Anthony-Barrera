import java.util.Scanner;

public class ContadorVocales {
    public static void ejecutar(Scanner lector) {
        System.out.println("\n--- Contador de Vocales ---");
        System.out.print("Ingrese una frase o palabra: ");
        String texto = lector.nextLine().toLowerCase();
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        System.out.println("La cantidad de vocales es: " + contador);
    }
}