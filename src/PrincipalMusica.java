public class Principal3 {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.titulo = "Heat Waves";
        musica.artista = "Glass Animals";
        musica.anoLancamento = 2021;

        musica.exibeFichaTecnica();

        musica.avalia(8.5);
        musica.avalia(6);
        musica.avalia(7.5);

        double mediaAvaliacoes = musica.pegaMedia();
        System.out.println("Média das Avaliaçoes: " + mediaAvaliacoes);
    }
}