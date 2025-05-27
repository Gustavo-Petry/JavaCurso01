package Caneta;

public class Copo {

    String modelo;
    String cor;
    float volumeMaximo;
    float volumeAtual;
    boolean cheio;
    boolean sujo;

    void status(){
        System.out.println("Um copo de cor: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Capacidade: " + this.volumeMaximo + " ml");
        System.out.println("O copo está cheio? " + (this.cheio ? "Sim" : "Não"));
        System.out.println("O copo está sujo? " + (this.sujo ? "Sim" : "Não"));
    }

    void beber(){
        if(this.cheio == true){
            System.out.println("Posso beber do copo.");
        }
        else {
            System.out.println("Não posso beber, o copo está vazio.");
        }
    }
    void encher(){
        if(this.volumeAtual < volumeMaximo){
            System.out.println("Vou encher, pois o copo não está cheio");
        } else {
            System.out.println("Não posso encher, o copo já está cheio.");
        }
    }

    
}
