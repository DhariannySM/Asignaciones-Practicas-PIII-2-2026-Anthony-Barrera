import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        GestorAcademico gestor = new GestorAcademico(); 
        int opcion = 0;

        do {
            System.out.println("\n====================================");
            System.out.println("   SISTEMA DE GESTIÓN ACADÉMICA");
            System.out.println("====================================");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Registrar profesor");
            System.out.println("3. Registrar materia");
            System.out.println("4. Asignar materia a estudiante");
            System.out.println("5. Registrar calificación");
            System.out.println("6. Buscar estudiante");
            System.out.println("7. Mostrar estudiantes");
            System.out.println("8. Mostrar materias");
            System.out.println("9. Mostrar reporte de promedios");
            System.out.println("10. Salir");
            System.out.print("Seleccione una opción: ");

            if (teclado.hasNextInt()) {
                opcion = teclado.nextInt();
                teclado.nextLine(); 
            } else {
                System.out.println("\nPor favor, ingrese un número válido.");
                teclado.nextLine(); 
                continue; 
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese Matrícula: ");
                    String matricula = teclado.nextLine();
                    
                    System.out.print("Ingrese Nombre: ");
                    String nombre = teclado.nextLine();
                    
                    System.out.print("Ingrese Apellido: ");
                    String apellido = teclado.nextLine();
                    
                    System.out.print("Ingrese Edad: ");
                    int edad = teclado.nextInt();
                    teclado.nextLine(); 
                    
                    System.out.print("Ingrese Carrera: ");
                    String carrera = teclado.nextLine();
                    
                    System.out.print("Ingrese Fecha de inscripción (Ej: 31/05/2026): ");
                    String fecha = teclado.nextLine();

                    Estudiante nuevoEst = new Estudiante(nombre, apellido, matricula, edad, carrera, fecha);
                    gestor.registrarEstudiante(nuevoEst);
                    break;
                    
                case 2:
                    System.out.print("Ingrese Código de Profesor: ");
                    String codigoProf = teclado.nextLine();
                    
                    System.out.print("Ingrese Nombre: ");
                    String nombreProf = teclado.nextLine();
                    
                    System.out.print("Ingrese Apellido: ");
                    String apellidoProf = teclado.nextLine();
                    
                    System.out.print("Ingrese Especialidad: ");
                    String especialidad = teclado.nextLine();

                    Profesor nuevoProf = new Profesor(nombreProf, apellidoProf, codigoProf, especialidad);
                    gestor.registrarProfesor(nuevoProf);
                    break;
                    
                case 3:
                    System.out.print("Ingrese Código de la Materia: ");
                    String codigoMat = teclado.nextLine();
                    
                    System.out.print("Ingrese Nombre de la Materia: ");
                    String nombreMat = teclado.nextLine();
                    
                    System.out.print("Ingrese Cantidad de Créditos: ");
                    int creditos = teclado.nextInt();
                    teclado.nextLine(); 

                    Materia nuevaMat = new Materia(codigoMat, nombreMat, creditos);
                    gestor.registrarMateria(nuevaMat);
                    break;
                    
                case 4:
                    System.out.print("Ingrese Matrícula del Estudiante: ");
                    String matEstudiante = teclado.nextLine();
                    Estudiante estParaMateria = gestor.buscarEstudiantePorMatricula(matEstudiante);

                    if (estParaMateria != null) {
                        System.out.print("Ingrese Código de la Materia a asignar: ");
                        String codMatAsignar = teclado.nextLine();
                        Materia matAsignar = gestor.buscarMateria(codMatAsignar);

                        if (matAsignar != null) {
                            estParaMateria.asignarMateria(matAsignar);
                            System.out.println("Materia asignada correctamente al estudiante.");
                        } else {
                            System.out.println("Error: La materia no existe en el sistema.");
                        }
                    } else {
                        System.out.println("Error: El estudiante no existe.");
                    }
                    break;
                    
                case 5:
                    System.out.print("Ingrese Matrícula del Estudiante: ");
                    String matCalificar = teclado.nextLine();
                    Estudiante estCalificar = gestor.buscarEstudiantePorMatricula(matCalificar);

                    if (estCalificar != null) {
                        System.out.println("--- Materias Actuales ---");
                        estCalificar.mostrarMateriasAsignadas();
                        
                        System.out.print("Ingrese el Código de la Materia a calificar: ");
                        String codMatCalificar = teclado.nextLine();
                        
                        System.out.print("Ingrese la calificación: ");
                        double nota = teclado.nextDouble();
                        teclado.nextLine(); 

                        boolean exito = estCalificar.registrarCalificacion(codMatCalificar, nota);
                        if (exito == true) {
                            System.out.println("Calificación guardada con éxito.");
                        } else {
                            System.out.println("Error: El estudiante no está cursando esa materia.");
                        }
                    } else {
                        System.out.println("Error: El estudiante no existe.");
                    }
                    break;
                    
                case 6:
                    System.out.println("Buscar por: 1. Matrícula  2. Nombre");
                    System.out.print("Seleccione (1 o 2): ");
                    
                    int subOpcion = 0;
                    if (teclado.hasNextInt()) {
                        subOpcion = teclado.nextInt();
                        teclado.nextLine(); 
                    } else {
                        System.out.println("Entrada no válida.");
                        teclado.nextLine(); 
                        break; 
                    }

                    if (subOpcion == 1) {
                        System.out.print("Ingrese Matrícula: ");
                        String matBuscar = teclado.nextLine();
                        Estudiante estEncontrado = gestor.buscarEstudiantePorMatricula(matBuscar);
                        
                        if (estEncontrado != null) {
                            estEncontrado.mostrarInfo();
                        } else {
                            System.out.println("Estudiante no encontrado.");
                        }
                    } else if (subOpcion == 2) {
                        System.out.print("Ingrese Nombre: ");
                        String nomBuscar = teclado.nextLine();
                        gestor.buscarEstudiantePorNombre(nomBuscar);
                    } else {
                        System.out.println("Opción inválida.");
                    }
                    break;
                    
                case 7:
                    System.out.println("\n--- Lista de Estudiantes ---");
                    gestor.mostrarTodosLosEstudiantes();
                    break;
                    
                case 8:
                    System.out.println("\n--- Lista de Materias ---");
                    gestor.mostrarTodasLasMaterias();
                    break;
                    
                case 9:
                    System.out.println("\n--- Reporte de Promedios ---");
                    gestor.mostrarReportePromedios();
                    break;
                    
                case 10:
                    System.out.println("\nSaliendo del sistema... ¡Hasta luego!");
                    break;
                    
                default:
                    System.out.println("\nOpción no válida. Intente de nuevo.");
            }

        } while (opcion != 10);

        teclado.close();
    }
}