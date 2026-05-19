import java.util.Scanner;

public class Estudiante {
    public static void ejecutar(Scanner lector) {
        System.out.println("\n--- DATOS DEL ESTUDIANTE ---");
        
        lector.nextLine(); 

        System.out.print("Ingresa el nombre del estudiante: ");
        String nombre = lector.nextLine();
        
        System.out.print("Ingresa la carrera que cursa: ");
        String carrera = lector.nextLine();
        
        System.out.print("Ingresa la edad: ");
        int edad = lector.nextInt();
        
        System.out.print("Ingresa la calificación promedio: ");
        double calificacion = lector.nextDouble();
        
        System.out.println("\n>> Resumen: Estudiante " + nombre + " (" + carrera + "), Edad: " + edad + ", Calificación: " + calificacion);
    }
}