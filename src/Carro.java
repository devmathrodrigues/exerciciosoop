public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnica(){
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    int calculaIdade(){
        return 2023 - ano;
    }
}