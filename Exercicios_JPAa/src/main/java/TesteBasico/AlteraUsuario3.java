package TesteBasico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

//pega as informações sem alterar o dado gerenciado
public class AlteraUsuario3 {
	public static void main(String[] args) {
        // Cria uma fábrica de gerenciadores de entidades com base na unidade de persistência "EstudosJpa".
        EntityManagerFactory emf = Persistence
        		.createEntityManagerFactory("EstudosJpa");
        // Cria um gerenciador de entidades a partir da fábrica.
        EntityManager em = emf
        		.createEntityManager();
   
        em.getTransaction().begin();
        
        Usuario usuario = em.find(Usuario.class, 5L);
        em.detach(usuario);
        usuario.setNome("Kaio");
        
        em.merge(usuario);
        
        em.getTransaction().commit();
        
        // Fecha o gerenciador de entidades para liberar recursos.
        em.close();
        // Fecha a fábrica de gerenciadores de entidades para liberar recursos.
        emf.close();

	}
}
