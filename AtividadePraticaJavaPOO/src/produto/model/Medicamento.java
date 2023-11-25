package produto.model;

public class Medicamento extends Produto { // Subclasse da Classe Produto
	
	private String generico;

	public Medicamento(int id, String nome, int tipo, double preco, String generico) {
		super(id, nome, tipo, preco);
		this.generico = generico;
	}

	public String getGenerico() {
		return generico;
	}

	public void setGenerico(String generico) {
		this.generico = generico;
	}

	
	@Override
	public void visualizar() {
		// TODO Auto-generated method stub
		
	}
}
