package TesteBasico;

import Infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {
		public static void main(String[] args) {
			
			Produto produto = new Produto("Notebook", 2344.75);
			
			DAO<Produto> dao = new DAO<>(Produto.class);
			
//			dao.abrirT().incluir(produto).fecharT().fechar();
			dao.incluirAtomico(produto).fechar();
		}
}
