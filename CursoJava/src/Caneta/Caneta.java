package Caneta;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("A caneta está tampada? ");
        if(this.tampada == true) {
            System.out.println("Está tampada.");
        } else {
            System.out.println("Está destampada.");
        }
        

    } 

    void rabiscar(){
        if(this.tampada == true) {
            System.out.println("Erro! Não posso rabiscar.");
        } else {
            System.out.println("Estou rabiscando...");
        }

    }
    void tampar(){
        this.tampada = true;


    }
    void destampar(){
        this.tampada = false;
    
        
    }
}