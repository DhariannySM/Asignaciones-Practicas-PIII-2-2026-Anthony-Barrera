import java.util.Scanner;

public class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void arrancar() {
        System.out.println("El vehículo ha arrancado correctamente.");
    }

    public static void ejecutar(Scanner lector) {
        System.out.println("\n--- REGISTRO DE VEHÍCULO ---");
        
        lector.nextLine(); 

        System.out.print("Ingresa el tipo de vehículo (ej. Motor, automóvil, camión): ");
        String tipo = lector.nextLine();

        System.out.print("Ingresa la marca del vehículo (ej. Toyota): ");
        String marca = lector.nextLine();
        
        System.out.print("Ingresa el modelo (ej. Corolla): ");
        String modelo = lector.nextLine();
        
        System.out.print("Ingresa el año de fabricación: ");
        int year = lector.nextInt();
        
        System.out.println("\n>> ¡Vehículo registrado exitosamente!");
        System.out.println("Tipo: " + tipo + " | Marca: " + marca + " | Modelo: " + modelo + " | Año: " + year);
        System.out.println("(Este vehículo hereda las propiedades básicas de transporte)");
    }
}