import java.util.ArrayList;

public class GestorAcademico {
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Profesor> profesores;
    private ArrayList<Materia> materias;

    public GestorAcademico() {
        this.estudiantes = new ArrayList<>();
        this.profesores = new ArrayList<>();
        this.materias = new ArrayList<>();
    }

    public void registrarEstudiante(Estudiante est) {
        estudiantes.add(est);
        System.out.println("Estudiante registrado exitosamente.");
    }

    public void registrarProfesor(Profesor prof) {
        profesores.add(prof);
        System.out.println("Profesor registrado exitosamente.");
    }

    public void registrarMateria(Materia mat) {
        materias.add(mat);
        System.out.println("Materia registrada exitosamente.");
    }

    public Estudiante buscarEstudiantePorMatricula(String matricula) {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getMatricula().equalsIgnoreCase(matricula)) {
                return estudiantes.get(i);
            }
        }
        return null;
    }

    public void buscarEstudiantePorNombre(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getNombre().equalsIgnoreCase(nombre)) {
                estudiantes.get(i).mostrarInfo();
                encontrado = true;
            }
        }
        if (encontrado == false) {
            System.out.println("No se encontraron estudiantes con ese nombre.");
        }
    }

    public Materia buscarMateria(String codigo) {
        for (int i = 0; i < materias.size(); i++) {
            if (materias.get(i).getCodigo().equalsIgnoreCase(codigo)) {
                return materias.get(i);
            }
        }
        return null;
    }

    public void mostrarTodosLosEstudiantes() {
        if (estudiantes.size() == 0) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            for (int i = 0; i < estudiantes.size(); i++) {
                estudiantes.get(i).mostrarInfo();
                System.out.println("---------------------------");
            }
        }
    }

    public void mostrarTodasLasMaterias() {
        if (materias.size() == 0) {
            System.out.println("No hay materias registradas.");
        } else {
            for (int i = 0; i < materias.size(); i++) {
                materias.get(i).mostrarInfo();
            }
        }
    }

    public void mostrarReportePromedios() {
        if (estudiantes.size() == 0) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            for (int i = 0; i < estudiantes.size(); i++) {
                Estudiante est = estudiantes.get(i);
                double promedio = est.calcularPromedio();
                String estado;
                
                if (promedio >= 2.0) {
                    estado = "Aprobó";
                } else {
                    estado = "Reprobó";
                }
                
                System.out.println(est.getMatricula() + " - " + est.getNombre() + " " + est.getApellido() + 
                                   " | Promedio: " + String.format("%.2f", promedio) + " | Estado: " + estado);
            }
        }
    }
}