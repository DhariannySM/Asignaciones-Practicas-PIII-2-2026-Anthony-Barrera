import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RegistroAgencia agencia = new RegistroAgencia(100); 
        int opcion = 0;

        do {
            System.out.println("\n====================================");
            System.out.println("      REGISTRO DE VEHÍCULOS");
            System.out.println("====================================");
            System.out.println("1. Registrar vehículo.");
            System.out.println("2. Mostrar vehículos.");
            System.out.println("3. Buscar vehículo por placa.");
            System.out.println("4. Mostrar vehículos por marca.");
            System.out.println("5. Salir.");
            System.out.print("Seleccione una opción: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine(); 
            } else {
                System.out.println("\nPor favor, ingrese un número válido.");
                scanner.nextLine(); 
                continue; 
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la placa: ");
                    String placa = scanner.nextLine();
                    
                    System.out.print("Ingrese la marca: ");
                    String marca = scanner.nextLine();
                    
                    System.out.print("Ingrese el modelo: ");
                    String modelo = scanner.nextLine();
                    
                    System.out.print("Ingrese el año: ");
                    int year = scanner.nextInt();
                    scanner.nextLine(); 
                    
                    System.out.print("Ingrese el color: ");
                    String color = scanner.nextLine();
                    
                    System.out.print("Ingrese el precio: ");
                    double precio = scanner.nextDouble();
                    scanner.nextLine(); 

                    Vehiculo nuevoVehiculo = new Vehiculo(placa, marca, modelo, year, color, precio);
                    agencia.registrar(nuevoVehiculo);
                    break;
                    
                case 2:
                    agencia.mostrarTodos();
                    break;
                    
                case 3:
                    System.out.print("Ingrese la placa a buscar: ");
                    String placaBuscar = scanner.nextLine();
                    agencia.buscarPorPlaca(placaBuscar);
                    break;
                    
                case 4:
                    System.out.print("Ingrese la marca a buscar: ");
                    String marcaBuscar = scanner.nextLine();
                    agencia.mostrarPorMarca(marcaBuscar);
                    break;
                    
                case 5:
                    System.out.println("\nSaliendo del sistema... ¡Hasta luego!");
                    break;
                    
                default:
                    System.out.println("\nOpción no válida. Intente de nuevo.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}