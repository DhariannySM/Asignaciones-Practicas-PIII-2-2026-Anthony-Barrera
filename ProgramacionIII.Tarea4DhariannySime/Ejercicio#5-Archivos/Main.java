import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        File archivo = new File("actividades.txt");

        do{
            System.out.println("\n---SISTEMA DE REGISTRO DE ACTIVIDADES---");
            System.out.println("1. Agregar Actividad.");
            System.out.println("2. Mostrar Actividades.");
            System.out.println("3. Salir.");
            System.out.println("Seleccione una opcion: ");

            try{
                opcion = sc.nextInt();
                sc.nextLine();

                switch(opcion){
                    case 1:
                        System.out.println("Ingrese una actividad: ");
                        String nuevaActividad = sc.nextLine();

                        FileWriter fw = new FileWriter(archivo, true);
                        BufferedWriter bw = new BufferedWriter(fw);

                        bw.write(nuevaActividad);
                        bw.newLine();

                        bw.close();
                        System.out.println("Su actividad ha sido guardada con exito.");
                        break;
                    case 2:
                        if(!archivo.exists()){
                            System.out.println("Aun no se han registrado actividades en el archivo.");
                        }else{
                            System.out.println("---ACTIVIDADES REGISTRADAS---");

                            FileReader read = new FileReader(archivo);
                            BufferedReader buffer = new BufferedReader(read);
                            String linea;

                            while((linea = buffer.readLine()) != null){
                                System.out.println(linea);
                            }

                            buffer.close();
                        }
                        break;
                    case 3:
                        System.out.println("Saliendo del programa...Hasta luego!");
                        break;
                    default:
                        System.out.println("Opcion no valida. Favor intentarlo denuevo.");
                }
                } catch (IOException e){
                    System.out.println("Ocurrio un error al procesar el archivo " + e.getMessage());
                } catch (Exception e){
                    System.out.println("Error: Entrada invalida.");
                    sc.nextLine();
                }
            } while(opcion != 3);

             sc.close();

    }
}
