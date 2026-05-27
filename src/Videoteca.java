import java.util.ArrayList;

public class Videoteca {
	private String nome = "Os meus filmes";
	private ArrayList<Filme> filmes = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public int totalFilmes() {
		return filmes.size();
	}

	public void listarFilmes() {
		// mostra o nome da videoteca
		
		// Coloquei o real nome da videoteca
		System.out.println("=== " + nome + " ===");
		
		//// Nunca é mal verificar se tem 
		if (filmes.isEmpty()) {
		    System.out.println("Não existem filmes.");
		}
		
		 else {
			for (int i = 0; i < filmes.size(); i++) {
				System.out.println((i + 1) + ". " + filmes.get(i));
		  }
		// Testa primeiro se a videoteca tem filmes
			
			System.out.println("======");	
		}
		
	}
	
	
	public void adicionarFilme(Filme filme) {
		// Completa o método para adicionar o filme
		
		// Enfim vamos coloca-lo no ArrayList
        filmes.add(filme);
	}

	public void apagarFilme(int numero) {
		// Completa o método para apagar o filme
		
		// Remova de acordo com o seu gosto ksksk
		filmes.remove(numero - 1);
		
	}
	
	public void editarFilme(int numero, String novoTitulo, int ano) {
		// Falta acrescentar o atributo ano
		
		// Quem quiser trocar algo 🫡
		filmes.get(numero - 1).setFilme(novoTitulo, ano);
		
	}
}
