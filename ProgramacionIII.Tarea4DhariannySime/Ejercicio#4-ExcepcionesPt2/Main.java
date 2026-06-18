import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        try{

            System.out.println("---MENU DE CALCULADORA---");
            System.out.println("1. Sumar.");
            System.out.println("2. Restar.");
            System.out.println("3. Multiplicar.");
            System.out.println("4. Dividir.");
            System.out.println("Seleccione una opcion: ");
            int opcion = teclado.nextInt();

            System.out.println("Ingrese el primer numero: ");
            int num1 = teclado.nextInt();

            System.out.println("Ingrese el segundo numero: ");
            int num2 = teclado.nextInt();

            int resultado = 0;

            switch (opcion) {
                case 1: 
                    resultado = Calculadora.sumar(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    resultado = Calculadora.restar(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    resultado = Calculadora.multiplicar(num1, num2);
                    System.out.println("Resultado:" + resultado);
                    break;
                case 4:
                    resultado = Calculadora.dividir(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } catch (ArithmeticException e){
            System.out.println("Error: No se puede dividir entre cero.");
        }catch(InputMismatchException e){
            System.out.println("Error: entrada invalida. Favor ingresar un numero entero.");
        }finally{
            System.out.println("Proceso finalizado.");
            teclado.close();
        }
    }
}
