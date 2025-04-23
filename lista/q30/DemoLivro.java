package lista.q30;

public class DemoLivro {
    public static void main(String[] args) {
        LivroBiblioteca livroBiblioteca = new LivroBiblioteca("Java", "Deitel", 1000);
        LivroLivraria livroLivraria = new LivroLivraria("Java", "Deitel", 100.0);
        System.out.println(livroBiblioteca);
        System.out.println(livroLivraria);
    }
}
