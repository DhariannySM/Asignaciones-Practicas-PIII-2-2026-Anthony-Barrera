public class Main{

    public static void main(String [] args){

        try{
            HiloDescarga archivo1 = new HiloDescarga("Archivo1");
            HiloDescarga archivo2 = new HiloDescarga("Archivo2");
            HiloDescarga archivo3 = new HiloDescarga("Archivo3");

            archivo1.start();
            archivo2.start();
            archivo3.start();
        
        } catch(Exception e){
            System.out.println("\nOcurrio un problema en el hilo principal: " + e.getMessage());
            e.printStackTrace();
        }


    }
}