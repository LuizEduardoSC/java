package produto.model;

public class Cosmetico extends Produto { // Subclasse da Classe Produto
	
	private String fragancia;

	public Cosmetico(int id, String nome, int tipo, double preco, String fragancia) {
		super(id, nome, tipo, preco);
		this.fragancia = fragancia;
	}

	public String getFragancia() {
		return fragancia;
	}

	public void setFragancia(String fragancia) {
		this.fragancia = fragancia;
	}

	
	@Override
	public void visualizar() {
		
		
	}	

}
