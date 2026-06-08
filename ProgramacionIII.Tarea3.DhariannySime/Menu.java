import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu {

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n=========================");
            System.out.println("   REGISTRO DE USUARIOS");
            System.out.println("=========================");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine();

                if (opcion == 1) {
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.print("Correo: ");
                    String correo = scanner.nextLine();

                    System.out.print("Salario: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("\n--- Resultado ---");
                    
                    try {
                        Validador.validarUsuario(nombre, edad, correo, salario);
                        System.out.println("Usuario registrado correctamente.");
                        
                    } catch (NombreInvalidoException e) {
                        System.out.println(e.getMessage());
                    } catch (EdadInvalidaException e) {
                        System.out.println(e.getMessage());
                    } catch (CorreoInvalidoException e) {
                        System.out.println(e.getMessage());
                    } catch (SalarioInvalidoException e) {
                        System.out.println(e.getMessage());
                    } finally {
                        System.out.println("Proceso finalizado.");
                    }
                    
                } else if (opcion != 2) {
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número válido.");
                scanner.nextLine(); 
                opcion = 0; 
            }

        } while (opcion != 2);

        System.out.println("Saliendo del sistema...");
        scanner.close();
    }
}