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
        System.out.println("Capacidade Máxima: " + this.volumeMaximo + " ml");
        System.out.println("Capacidade atual: " + this.volumeAtual + " ml");
        System.out.println("O copo está cheio? " + (this.cheio ? "Sim" : "Não"));
        System.out.println("O copo está sujo? " + (this.sujo ? "Sim" : "Não"));
    }

    void beber(){
        if(this.volumeAtual > 0 && volumeAtual <= volumeMaximo){
            System.out.println("Posso beber do copo.");
        }
        else if (this.volumeAtual <= 0) {
            System.out.println("Não posso beber, o copo está vazio.");
        }
        else{
            System.out.println("Não posso beber, o copo está transbordando.");
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
