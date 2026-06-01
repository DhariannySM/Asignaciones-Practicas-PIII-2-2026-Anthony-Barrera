import java.util.ArrayList;

public class Estudiante extends Persona {
    private String matricula;
    private int edad;
    private String carrera;
    private String fechaInscripcion;
    private ArrayList<Materia> materias;
    private ArrayList<Double> calificaciones;

    public Estudiante(String nombre, String apellido, String matricula, int edad, String carrera, String fechaInscripcion) {
        super(nombre, apellido);
        this.matricula = matricula;
        this.edad = edad;
        this.carrera = carrera;
        this.fechaInscripcion = fechaInscripcion;
        this.materias = new ArrayList<>();
        this.calificaciones = new ArrayList<>();
    }

    public String getMatricula() {
        return matricula;
    }

    public void asignarMateria(Materia materia) {
        materias.add(materia);
        calificaciones.add(-1.0);
    }

    public boolean registrarCalificacion(String codigoMateria, double nota) {
        for (int i = 0; i < materias.size(); i++) {
            if (materias.get(i).getCodigo().equalsIgnoreCase(codigoMateria)) {
                calificaciones.set(i, nota);
                return true;
            }
        }
        return false;
    }

    public String obtenerLetra(double nota) {
        if (nota == -1.0) {
            return "Sin calificar";
        } else if (nota >= 90) {
            return "A";
        } else if (nota >= 80) {
            return "B";
        } else if (nota >= 70) {
            return "C";
        } else if (nota >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public void mostrarMateriasAsignadas() {
        if (materias.size() == 0) {
            System.out.println("El estudiante no tiene materias asignadas.");
        } else {
            for (int i = 0; i < materias.size(); i++) {
                double nota = calificaciones.get(i);
                String estadoNota;
                
                if (nota == -1.0) {
                    estadoNota = "Sin calificar";
                } else {
                    estadoNota = nota + " (" + obtenerLetra(nota) + ")";
                }
                
                System.out.println("- " + materias.get(i).getNombre() + 
                                   " | Créditos: " + materias.get(i).getCreditos() + 
                                   " | Calificación: " + estadoNota);
            }
        }
    }

    public double calcularPromedio() {
        if (calificaciones.size() == 0) return 0.0;
        
        double sumaPuntosCalidad = 0.0;
        int totalCreditos = 0;
        
        for (int i = 0; i < calificaciones.size(); i++) {
            double nota = calificaciones.get(i);
            
            if (nota != -1.0) {
                int creditos = materias.get(i).getCreditos();
                double valorLetra = 0.0;
                
                if (nota >= 90) {
                    valorLetra = 4.0;
                } else if (nota >= 80) {
                    valorLetra = 3.0;
                } else if (nota >= 70) {
                    valorLetra = 2.0;
                } else if (nota >= 60) {
                    valorLetra = 1.0;
                } else {
                    valorLetra = 0.0;
                }
                
                sumaPuntosCalidad = sumaPuntosCalidad + (valorLetra * creditos);
                totalCreditos = totalCreditos + creditos;
            }
        }
        
        if (totalCreditos == 0) return 0.0;
        
        return sumaPuntosCalidad / totalCreditos;
    }

    public void mostrarInfo() {
        System.out.println("Matrícula: " + matricula + " | Nombre: " + nombre + " " + apellido + 
                           " | Edad: " + edad + " | Carrera: " + carrera + 
                           " | Fecha: " + fechaInscripcion);
        System.out.println("Materias inscritas:");
        mostrarMateriasAsignadas();
    }
}