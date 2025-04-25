package Atividade2;

public class Livro {
    String titulo;
    String autor;
    int numPaginas;

    public Livro(String titulo, String autor, int numPaginas) {

        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;

    }

    public void exibirIformacoes(){

        System.out.println("Titulo : "+titulo);
        System.out.println("Autor : "+autor);
        System.out.println("Número de Paginas : "+numPaginas);

    }

    public void exibirInformacoes() {
    }
}
