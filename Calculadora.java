import java.util.Scanner;

public class Calculadora {
    
    public static void ejecutar(Scanner lector) {
        System.out.println("\n--- Calculadora Básica ---");
        System.out.print("Ingrese el primer número: ");
        double num1 = lector.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = lector.nextDouble();
        System.out.print("Ingrese la operación (+, -, *, /): ");
        char operacion = lector.next().charAt(0);

        double resultado = 0;
        boolean operacionValida = true;

        switch (operacion) {
            case '+': resultado = num1 + num2; break;
            case '-': resultado = num1 - num2; break;
            case '*': resultado = num1 * num2; break;
            case '/': 
                if (num2 != 0) {
                    resultado = num1 / num2; 
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                    operacionValida = false;
                }
                break;
            default:
                System.out.println("Operación no reconocida.");
                operacionValida = false;
        }

        if (operacionValida) {
            System.out.println("El resultado es: " + resultado);
        }
    }
}