public class HiloDescarga extends Thread {
    
    public HiloDescarga (String nombre){
        super(nombre);
    }

    @Override
    public void run(){
        System.out.println("Descargando " + this.getName() + "...");

        for( int progreso = 0; progreso <=100; progreso += 20){
            if(progreso >0){
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println(this.getName() + " " + progreso + "%");
        }
        System.out.println(this.getName() + " completado.");
    }
}
