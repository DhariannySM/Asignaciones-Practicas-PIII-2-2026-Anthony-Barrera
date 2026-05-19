import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n========================================");
            System.out.println("          MENÚ DE APLICACIÓN          ");
            System.out.println("========================================");
            System.out.println("1. Calculadora básica");
            System.out.println("2. Número par o impar");
            System.out.println("3. Tabla de multiplicar");
            System.out.println("4. Contador de vocales");
            System.out.println("5. Promedio de notas");
            System.out.println("6. Clase Estudiante");
            System.out.println("7. Cuenta bancaria");
            System.out.println("8. Herencia de vehículos");
            System.out.println("9. Matriz 3x3");
            System.out.println("10. Sistema básico de inventario");
            System.out.println("11. Salir de la aplicación");
            System.out.print("Seleccione una opción: ");
            
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    Calculadora.ejecutar(teclado);
                    break;
                case 2:
                    NumeroParImpar.ejecutar(teclado);
                    break;
                case 3:
                    TablaMultiplicar.ejecutar(teclado);
                    break;
                case 4:
                    ContadorVocales.ejecutar(teclado);
                    break;
                case 5:
                    PromedioNotasA.ejecutar(teclado);
                    break;
                case 6:
                    Estudiante.ejecutar(teclado);
                    break;
                case 7:
                    CuentaBancaria.ejecutar(teclado);
                    break;
                case 8:
                    Automovil.ejecutar(teclado); 
                    break;
                case 9:
                    Matriz3x3.ejecutar(teclado);
                    break;
                case 10:
                    SistemaInventario.ejecutar(teclado);
                    break;
                case 11:
                    System.out.println("Saliendo de la aplicación. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 11);
        
        teclado.close(); 
}
}