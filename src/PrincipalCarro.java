public class Principal4 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Honda Civic";
        carro.ano = 2021;
        carro.cor = "Preto";

        carro.exibeFichaTecnica();

        System.out.println("A idade do carro é: " + carro.calculaIdade() + " anos.");
    }
}