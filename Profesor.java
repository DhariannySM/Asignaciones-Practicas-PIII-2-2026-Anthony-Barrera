public class Profesor extends Persona {
    private String codigo;
    private String especialidad;

    public Profesor(String nombre, String apellido, String codigo, String especialidad) {
        super(nombre, apellido);
        this.codigo = codigo;
        this.especialidad = especialidad;
    }

    public void mostrarInfo() {
        System.out.println("Código: " + codigo + " | Nombre: " + nombre + " " + apellido + 
                           " | Especialidad: " + especialidad);
    }
}