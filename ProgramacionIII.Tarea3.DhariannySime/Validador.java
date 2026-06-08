public class Validador {

    public static void validarUsuario(String nombre, int edad, String correo, double salario) 
            throws NombreInvalidoException, EdadInvalidaException, CorreoInvalidoException, SalarioInvalidoException {
        
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new NombreInvalidoException("Error: El nombre no puede estar vacío.");
        }
        if (nombre.trim().length() < 3) {
            throw new NombreInvalidoException("Error: El nombre debe contener al menos 3 caracteres.");
        }

        if (edad < 18 || edad > 100) {
            throw new EdadInvalidaException("Error: La edad debe ser mayor o igual a 18 años y menor que 100.");
        }

        if (correo == null || !correo.contains("@") || !correo.contains(".")) {
            throw new CorreoInvalidoException("Error: El correo electrónico no es válido.");
        }

        if (salario <= 0) {
            throw new SalarioInvalidoException("Error: El salario debe ser mayor que cero.");
        }
    }
}