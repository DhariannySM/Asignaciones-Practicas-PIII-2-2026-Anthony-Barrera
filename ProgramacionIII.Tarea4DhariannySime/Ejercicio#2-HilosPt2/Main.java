public class Main {
    
    public static String ganador = "";
    public static void main(String [] args){

        try{
            Corredor corredor1 = new Corredor("Anthony");
            Corredor corredor2 = new Corredor("Gregory");
            Corredor corredor3 = new Corredor("Kelvin");
            Corredor corredor4 = new Corredor("Rafael");

            System.out.println("\n***ESTADOS INICIALES DE LOS CORREDORES***");
            System.out.println(corredor1.getName() + "-" + corredor1.getState());
            System.out.println(corredor2.getName() + "-" + corredor2.getState());
            System.out.println(corredor3.getName() + "-" + corredor3.getState());
            System.out.println(corredor4.getName() + "-" + corredor4.getState());
            System.out.println(" ");
            System.out.println("*****************************************\n");

            corredor1.start();
            corredor2.start();
            corredor3.start();
            corredor4.start();
        
            System.out.println("\nCarrera en curso ? " + "(" + corredor1.getName() + " = " + corredor1.getState() + ")\n");
            
            corredor1.join();
            corredor2.join();
            corredor3.join();
            corredor4.join();

            System.out.println("\n***ESTADOS FINALES DE LOS CORREDORES***");
            System.out.println(corredor1.getName() + "-" + corredor1.getState());
            System.out.println(corredor2.getName() + "-" + corredor2.getState());
            System.out.println(corredor3.getName() + "-" + corredor3.getState());
            System.out.println(corredor4.getName() + "-" + corredor4.getState());
            System.out.println(" ");
            System.out.println("*****************************************\n");
        

            System.out.println("\nEl ganador de la carrera es: " + ganador + "!!!\n");
        } catch(Exception e){
            e.printStackTrace();
        }
}
}
