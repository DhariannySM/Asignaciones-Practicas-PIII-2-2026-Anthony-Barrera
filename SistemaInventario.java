import java.util.Scanner;

public class SistemaInventario {
    public static void ejecutar(Scanner lector) {
        System.out.println("\n--- Sistema Básico de Inventario ---");
        
        System.out.print("¿Cuántos productos desea ingresar al inventario?: ");
        int cantidad = lector.nextInt();
        lector.nextLine();

        if (cantidad <= 0) {
            System.out.println("Cantidad inválida. Debe ingresar al menos 1 producto.");
            return;
        }

        Producto[] inventario = new Producto[cantidad];

        System.out.println("\n--- Registro de Datos ---");
        for (int i = 0; i < inventario.length; i++) {
            System.out.println("\nProducto #" + (i + 1) + ":");
            
            System.out.print("-> Ingrese el Nombre: ");
            String nombre = lector.nextLine();
            
            System.out.print("-> Ingrese el Precio: ");
            double precio = lector.nextDouble();
            
            System.out.print("-> Ingrese las Unidades que entran: ");
            int unidades = lector.nextInt();
            lector.nextLine();

            inventario[i] = new Producto(nombre, precio, unidades);
        }

        System.out.println("\n========================================================");
        System.out.println("               INVENTARIO ACTUALIZADO                   ");
        System.out.println("========================================================");
        for (int i = 0; i < inventario.length; i++) {
            System.out.println((i + 1) + ". " + inventario[i].getNombre() 
                    + " | Precio: $" + inventario[i].getPrecio() 
                    + " | Unidades: " + inventario[i].getUnidades());
        }
        System.out.println("========================================================");
    }
}