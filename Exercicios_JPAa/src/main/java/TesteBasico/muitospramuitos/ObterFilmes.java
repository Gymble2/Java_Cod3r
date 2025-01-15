package TesteBasico.muitospramuitos;

import java.util.List;

import Infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class ObterFilmes {
	public static void main(String[] args) {
		DAO<Filme> dao = new DAO<>();
		List<Filme> filmes = dao.consultar("filmesNotaMaiorQue", "nota", 8.5);
		
		for (Filme filme : filmes) {
			System.out.println(filme.getNome() + " => " + filme.getNota());
			
			for(Ator ator: filme.getAtores()) {
				System.out.println(ator.getNome());
			}
		}
	}
}
