public class App {
    public static void main(String[] args){
    

        Semaforo sem = new Semaforo(0);

        Spogliatoio s1 = new Spogliatoio("ferrari",sem );

        Circuito c1 = new Circuito( " Maimi");
        
        Pilota p1 = new Pilota("gigi" ,s1 ,c1);
        Pilota p2 = new Pilota("giacomo" ,s1 ,c1);
        Pilota p3 = new Pilota("giovanni" ,s1 ,c1);
        Pilota p4 = new Pilota("giotaro" ,s1 ,c1);
   
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        
        try {
            p1.join();
        } catch (InterruptedException e) {
        }

        try {
            p2.join();
        } catch (InterruptedException e) {
        }

        try {
            p3.join();
        } catch (InterruptedException e) {
        }

        try {
            p4.join();
        } catch (InterruptedException e) {
        }


        

    }
}
