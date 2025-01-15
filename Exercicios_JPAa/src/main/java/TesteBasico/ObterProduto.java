package TesteBasico;

import java.util.List;

import Infra.ProdutoDAO;
import modelo.basico.Produto;

public class ObterProduto {
	public static void main(String[] args) {
		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> produtos = dao.obterTodos();
		
		for (Produto produto :produtos) {
			System.out.println("Id: " + produto.getId() + "Nome :" + produto.getNome());
		}
		
		double precoTotal = produtos
				.stream()
				.map(p -> p.getPreco())
				.reduce(0.0, (t,p) -> t + p)
				.doubleValue();
		
		System.out.println("O valor total é " + precoTotal);
		
		dao.fechar();
	}
}
