import java.util.Scanner;

public class CuentaBancaria {
    public static void ejecutar(Scanner lector) {
        System.out.println("\n--- CUENTA BANCARIA ---");
        
        String cliente = "Anthony Barrera";
        double saldoActual = 25500900.00;
        
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo actual: $" + saldoActual);
        
        System.out.println("\n¿Qué operación deseas realizar?");
        System.out.println("1. Depósito");
        System.out.println("2. Retiro");
        System.out.print("Elige una opción (1 o 2): ");
        int operacion = lector.nextInt();
        
        if (operacion == 1) {
            System.out.print("Ingresa la cantidad a depositar: $");
            double deposito = lector.nextDouble();
            saldoActual = saldoActual + deposito;
            System.out.println("Depósito exitoso. Tu nuevo saldo es: $" + saldoActual);
            
        } else if (operacion == 2) {
            System.out.print("Ingresa la cantidad a retirar: $");
            double retiro = lector.nextDouble();
            
            // Validación de fondos suficientes
            if (retiro > saldoActual) {
                System.out.println("Error: No tienes fondos suficientes para ese retiro.");
            } else {
                saldoActual = saldoActual - retiro;
                System.out.println("Retiro exitoso. Tu nuevo saldo es: $" + saldoActual);
            }
            
        } else {
            System.out.println("Opción no válida.");
        }
    }
}