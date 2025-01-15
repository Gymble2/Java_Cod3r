package br.com.gymble.exerciciossb.models.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.gymble.exerciciossb.models.entities.Produto;

public interface ProdutoRepository 
		extends PagingAndSortingRepository<Produto, Integer>{
		
		public Iterable<Produto> findByNomeContaining(String parteNome);
}
