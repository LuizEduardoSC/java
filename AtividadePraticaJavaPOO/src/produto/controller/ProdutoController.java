package produto.controller;

import java.util.ArrayList;
import java.util.Optional;

import produto.model.Cosmetico;
import produto.model.Medicamento;
import produto.model.Produto;
import produto.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {
	
	private ArrayList<Produto> listaProduto = new ArrayList<Produto>();
	
	public static int gerarNumero() {
		
		int contador = 0;
		
		return ++contador;	
	}
	
    
	@Override
	public void criarProduto(Produto produto) {
		int id = gerarNumero();
		produto.setId(id);
		listaProduto.add(produto);
    }


	@Override
	public Produto consultarProdutoPorId(int id) {
		
		Optional<Produto> produto = Optional.ofNullable(buscarNaCollection(id));	
		return produto.orElse(null);
		}


	@Override
	public void atualizarProduto(Produto produto) {
		int id = produto.getId();
		listaProduto.removeIf(p -> p.getId() == id);
		listaProduto.add(produto);
	}
	

	@Override
	public void deletarProduto(int id) {
		listaProduto.removeIf(p -> p.getId() == id);
	}
	
	
	@Override
	public ArrayList<Produto> listarTodosOsProdutos() {
		return listaProduto;
	}
	
	private Produto buscarNaCollection(int id) {
		
		for (Produto produto : listaProduto) {
			if (produto.getId() == id) {
				return produto;
			}
		  }
		return null;
	}
}
