
public class Livro {

	// model que representa o que o livro precisa ter
		
	String nome;
	String descricao;
	double valor;
	String isbn;
	Autor autor;
	
	//Impress�o dos dados do cadastro	
	void mostrarDetalhes() {
		System.out.println("Mostrando Detalhes do livro");
		System.out.println("Nome: " + nome);
		System.out.println("descricao: " + descricao);
		System.out.println("valor " + valor);
		System.out.println("isbn " + isbn);
		// Objeto e seu metodo
		autor.mostrarDetalhes();
		System.out.println("--");
		
	}
	//this indica que � um atributo al�m de v�riavel 
		public void aplicarDesconteDe (double porcetagem) {
			this.valor -= this.valor * porcetagem;
		}
	}


