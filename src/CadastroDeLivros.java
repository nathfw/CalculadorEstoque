
public class CadastroDeLivros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Autor autor = new Autor ();
		autor.nome = "Nathalia Santos";
		autor.email = "nathalia@testes.com.br";
		autor.cpf = "123.456.789-10";
				
		// No cadastro de livros serão passados informações para o cadastro do mesmo
		Livro livro = new Livro();
		livro.nome = "Java 8";
		livro.descricao = "Essa a descricao";
		livro.valor = 6.90;
		livro.isbn = "99999";
		
		livro.autor = autor;
		
		livro.mostrarDetalhes();

		Autor outroAutor = new Autor ();
		outroAutor.nome = "teste";
		outroAutor.email = "teste@teste.com.br";
		outroAutor.cpf = "125.325.258-78";
		
		Livro outroLivro = new Livro();
		outroLivro.nome = "Logica de Programação";
		outroLivro.descricao = "";
		outroLivro.valor = 0;
		outroLivro.isbn = "";
		
		// Entendendo de referencia a objeto
		
		outroLivro.autor = outroAutor;
		
		outroLivro.mostrarDetalhes();
		
	}

}