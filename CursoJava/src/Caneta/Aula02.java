package Caneta;

public class Aula02 {
    public static void main(String[] args) throws Exception {
        // Caneta c1 = new Caneta();
        // c1.cor = "Azul";
        // c1.ponta = 0.5f;
        // c1.tampar();
        // c1.status();
        // c1.rabiscar();

        // Caneta c2 = new Caneta();
        // c2.modelo = "BIC";
        // c2.cor = "Preta";
        // c2.destampar();
        // c2.rabiscar();
        // c2.status();

        Copo philips1 = new Copo();
        philips1.modelo = "Philips Funcionário";
        philips1.cor = "Azul";
        philips1.volumeMaximo = 500.0f;
        philips1.volumeAtual = 250.0f;
        philips1.sujo = false;
        philips1.cheio = false;
        philips1.status();
        philips1.encher();
        philips1.beber();

    }
}
