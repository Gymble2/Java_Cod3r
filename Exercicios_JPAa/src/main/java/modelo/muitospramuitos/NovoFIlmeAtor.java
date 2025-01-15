package modelo.muitospramuitos;

import Infra.DAO;

public class NovoFIlmeAtor {
	public static void main(String[] args) {
		Filme filmeA = new Filme ("Star Wars", 8.7);
		Filme filmeB = new Filme ("O fugitivo", 5.0);
		
		Ator atorA = new Ator ("Harrison Ford");
		Ator atrizB = new Ator ("Carrie Fisher");
		
		filmeA.AdicionarAtor(atorA);
		filmeA.AdicionarAtor(atrizB);
		
		filmeB.AdicionarAtor(atorA);
		
		DAO<Filme> dao = new DAO<Filme>();
		
		dao.incluirAtomico(filmeA);
		
	}
}
