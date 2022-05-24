public class Circuito {
    
    String nomePista ;

    public Circuito(String nomePista) {
        this.nomePista = nomePista;
    }


    public  void UsaCircuito(String nome){

        System.out.println("il pilota : " + nome + "è entrato nella pista : " +nomePista);
        for (int i = 0; i < 15; i++) {
            try {
                
           
            Thread.sleep((long)(Math.random() * 1000));

        } catch (Exception e) {
        }
        }
        System.out.println("il pilota : " + nome + "ha finito la gara : " + nomePista);
    }
    
}
