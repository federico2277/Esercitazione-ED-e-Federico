public class Spogliatoio {
    
    String nome;
    Semaforo semaforoSpogliatoio;

    public Spogliatoio(String nome ,Semaforo s) {
        this.nome = nome;
        this.semaforoSpogliatoio = s;
    }

    public synchronized void usaSpogliatoio(String nomePilota) {
        
            System.out.println("è entrato il pilota : " +nomePilota +" nello spogliatoio  : " + nome );
        try {

            Thread.sleep((long)(Math.random() * 1000));

        } catch (Exception e) {
        }

            System.out.println("è uscito il pilota : " +nomePilota +" dallo spogliatoio  : " + nome );

        

    }


}
