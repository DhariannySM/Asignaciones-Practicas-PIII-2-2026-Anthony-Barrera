import java.util.Random;

public class Corredor extends Thread{

    public Corredor(String nombre){
        super(nombre);
    }
    
    @Override
    public void run(){
        for(int metro = 0; metro <= 10; metro ++){
            System.out.println(this.getName() + " avanzo al metro " + metro);

            try{
                Random aleatorio = new Random();
                Thread.sleep(aleatorio.nextInt(250) + 50);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println(this.getName() + " llego a la meta.");

        if(Main.ganador.equals("")){
            Main.ganador = this.getName();
        }

    }
}
