public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaDasAvaliacaoes;
    int numAvaliacoes;

    void exibeFichaTecnica(){
        System.out.println("Música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacaoes += nota;
        numAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacaoes / numAvaliacoes;
    }
}