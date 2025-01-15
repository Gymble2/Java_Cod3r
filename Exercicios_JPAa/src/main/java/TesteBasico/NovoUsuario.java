package TesteBasico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.basico.Usuario;

public class NovoUsuario {

    public static void main(String[] args) {
        
        // Cria uma fábrica de gerenciadores de entidades com base na unidade de persistência "EstudosJpa".
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EstudosJpa");

        // Cria um gerenciador de entidades a partir da fábrica.
        EntityManager em = emf.createEntityManager();

        // Cria um novo objeto Usuario com nome e email.
        Usuario novoUsuario = new Usuario("Renan", "renanRockAndRoll@IwannaRock.com.br");

        // Inicia uma nova transação. As operações de persistência precisam estar dentro de uma transação.
        em.getTransaction().begin();

        // Persiste (armazena) o novo objeto Usuario no banco de dados.
        em.persist(novoUsuario);

        // Comita a transação para garantir que as mudanças sejam salvas no banco de dados.
        em.getTransaction().commit();

        // Fecha o gerenciador de entidades para liberar recursos.
        em.close();

        // Fecha a fábrica de gerenciadores de entidades para liberar recursos.
        emf.close();
    }
}
