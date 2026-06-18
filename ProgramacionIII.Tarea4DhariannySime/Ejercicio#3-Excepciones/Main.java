import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();

        try{
            Validador.validarEdad(edad);
        } catch (EdadInvalidaException e){
            System.out.println(e.getMessage());
        } finally{
            System.out.println("Validacion terminada.");
            sc.close();
        }
    }
}

