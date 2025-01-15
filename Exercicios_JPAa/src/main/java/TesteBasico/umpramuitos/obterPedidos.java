package TesteBasico.umpramuitos;

import Infra.DAO;
import modelo.basico.Produto;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class obterPedidos {
	public static void main(String[] args) {
		DAO<Pedido> dao = new DAO<>(Pedido.class);
				
		Pedido pedido = dao.obterPorId(1L);
		for (ItemPedido item : pedido.getItens()) {
			System.out.println(item.getQuantidade());
			System.out.println(item.getProduto().getNome());
		}
		
		dao.fechar();
	}
}
