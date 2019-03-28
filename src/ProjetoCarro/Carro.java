package ProjetoCarro;

public class Carro {
    String modeloCarro;
    String corCarro;
    String marcaCarro;
    String proprietarioCarro;
    String chassi;

    boolean tetoSolar, cambioAutomatico;

    Double velocidadeMaxima;
    Double volumeCombustivel;
    Double velocidadeAtual;

    int numeroPortas;
    int numeroMarchas;
    int ano;
    int marchaAtual;

    Proprietario prooprietario;



    void acelera(){
        velocidadeAtual = velocidadeAtual + 1;
    }

    void freia(int velocidadeDesejada){
        velocidadeAtual = velocidadeDesejada = 0;
    }

    void trocaMarcha(int marchaDesejada){
        marchaAtual = marchaDesejada = 2;
    }

    void reduzirMarcha(){
        marchaAtual = marchaAtual - 1;
    }

}
