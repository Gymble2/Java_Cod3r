package TesteBasico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarios {

	public static void main(String[] args) {
        // Cria uma fábrica de gerenciadores de entidades com base na unidade de persistência "EstudosJpa".
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EstudosJpa");
        // Cria um gerenciador de entidades a partir da fábrica.
        EntityManager em = emf.createEntityManager();
   
//        String jpql = "select u from Usuario u";
//        TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
//        query.setMaxResults(3);	
        
        List<Usuario> usuarios = em.createQuery("select u from Usuario u", Usuario.class)
        		.getResultList();
        
        for(var usuario: usuarios)
        {
        	System.out.println("Id: " + usuario.getId() + " Nome: " + usuario.getNome() + " Email: " + usuario.getEmail());
        }    

        // Fecha o gerenciador de entidades para liberar recursos.
        em.close();
        // Fecha a fábrica de gerenciadores de entidades para liberar recursos.
        emf.close();

	}
}
