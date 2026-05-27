/*
  Adapta esta classe para aceitar o atributo ano
 */
public class Filme {
	private String titulo;
	// Se não tiver "ano" vai dar erro 😅
	private int ano;

	//Se eu coloquei o atributo ano, tenho por o contrutor a recebelo 🤔
	public Filme(String titulo, int ano) { // o construtor tem de aceitar o atributo ano
		this.titulo = titulo;
		this.ano = ano;
	}
	// Completa aqui o método Setter para alterar o título e o ano do filme
	public void setFilme(String titulo, int ano) {
		this.titulo = titulo;
		// Agora já consigo alterar 2 e não apenas 1 
		this.ano = ano;
	}
	// Completa aqui o método toString para apresentar o título e o ano do filme
	public String toString() {
		
		StringBuilder sb = new StringBuilder("");
		sb.append("Título: "+ titulo);
	    //Se ele está em todo lado, porque não apresenta-lo aqui
        sb.append(" | Ano: " + ano);
        
		return sb.toString();
	}
}
