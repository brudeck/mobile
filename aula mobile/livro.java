package aulas;

public class livro {
    public static void main(String[] args) {
        
        livro meuLivro = new livro("Machado de Assis", "Dom Casmurro é um romance brasileiro clássico.");

        System.out.println("Autor: " + meuLivro.getAutor());
        System.out.println("Descrição: " + meuLivro.getDescricao());
    }
}
