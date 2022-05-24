public class Pilota extends Thread{
    
String nome;
Spogliatoio s;
Circuito c;
Long tempo;

public Pilota(String nome ,Spogliatoio p ,Circuito c) {
    this.nome=nome;
    this.s = p;
    this.c = c;
}

@Override
public void run() {
    
    s.semaforoSpogliatoio.v();
    s.usaSpogliatoio(nome);
    s.semaforoSpogliatoio.p();

    long start = System.nanoTime();
    c.UsaCircuito(nome);
    long stop = System.nanoTime();
    tempo = (stop - start) / 1000000;
    System.out.println(tempo + nome);

    s.semaforoSpogliatoio.v();
    s.usaSpogliatoio(nome);
    s.semaforoSpogliatoio.p();
}



}
