package twu.exercises;

public class Node {
	
	private String conteudo;
	private Node proximo;
	
	public Node(String conteudo){
		
		this.conteudo = conteudo.toLowerCase();
		this.proximo = null;
		
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Node getProximo() {
		return proximo;
	}

	public void setProximo(Node proximo) {
		this.proximo = proximo;
	}

}
