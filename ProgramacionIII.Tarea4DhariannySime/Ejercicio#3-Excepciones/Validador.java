public class Validador {
    
    public static void validarEdad (int edad) throws EdadInvalidaException{
        if (edad < 18){
            throw new EdadInvalidaException("Error: Debe ser mayor de edad.");
        }

        System.out.println("Accedo concedido. Edad valida.");
    }
}
