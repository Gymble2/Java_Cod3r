package TesteBasico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class ObterUsuario {

	public static void main(String[] args) {
        // Cria uma fábrica de gerenciadores de entidades com base na unidade de persistência "EstudosJpa".
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EstudosJpa");

        // Cria um gerenciador de entidades a partir da fábrica.
        EntityManager em = emf.createEntityManager();
   
        Usuario usuario = em.find(Usuario.class, 4L);
        System.out.println(usuario.getNome());

        // Fecha o gerenciador de entidades para liberar recursos.
        em.close();

        // Fecha a fábrica de gerenciadores de entidades para liberar recursos.
        emf.close();

	}
}
