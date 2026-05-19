import java.util.Scanner;

public class Automovil extends Vehiculo {
    private int cantidadPuertas;

    public Automovil(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo); 
        this.cantidadPuertas = cantidadPuertas;
    }

    public void mostrarDetalles() {
        System.out.println("Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Puertas: " + cantidadPuertas);
    }

    public static void ejecutar(Scanner lector) {
        System.out.println("\n--- Herencia de Vehículos (Automóvil) ---");
        
        lector.nextLine(); 

        System.out.print("Ingresa la marca del automóvil (ej. Toyota): ");
        String marca = lector.nextLine();
        
        System.out.print("Ingresa el modelo del automóvil (ej. Corolla): ");
        String modelo = lector.nextLine();
        
        System.out.print("Ingresa la cantidad de puertas: ");
        int puertas = lector.nextInt();
        
        Automovil auto = new Automovil(marca, modelo, puertas);
        
        System.out.println("\n>> ¡Automóvil registrado con éxito!");
        auto.mostrarDetalles();
        auto.arrancar();  
    }
}